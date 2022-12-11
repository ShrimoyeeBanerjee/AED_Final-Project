package DB4OUtil;

import Business.ConfigureEcosystem;
import Info.CropInfo;
import Info.CropInfoDirectory;
import Business.ecosystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
            config.common().objectClass(ecosystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(ecosystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public ecosystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet<ecosystem> systems = conn.query(ecosystem.class); // Change to the object you want to save
        ecosystem system;
        if (systems.size() == 0){
            system = ConfigureEcosystem.configure();
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
