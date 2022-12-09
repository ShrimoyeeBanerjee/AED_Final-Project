/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB4OUtil;

import Business.ConfigureEcosystem;
import DB4OUtil.DB4OUtil;
import Business.ecosystem;

/**
 *
 * @author shalinishree
 */
public class database {
    private static final String FILENAME = "DataBankfinal.db4o"; // path to the data store
    private static database dB4OUtil;
    
    public synchronized static database getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new database();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public EcoSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.size() == 0){
            system = ConfigureASystem.configure();
          //  addCropData();
            // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        
        conn.close();
        
        
        return system;
    }
}
