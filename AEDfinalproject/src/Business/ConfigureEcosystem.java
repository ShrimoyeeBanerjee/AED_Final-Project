/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Employe.Employe;
import Network.network;
import Roles.sysadmin;
import UserAcc.useracc;
/**
 *
 * @author shalinishree
 */
public class ConfigureEcosystem {
    public static ecosystem configure(){
        
        ecosystem system = ecosystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employe emp = system.getED().createEmploye("RRH");
        
       
        
        useracc useracc = system.getuseraccDirectory().createuseracc("sysadmin", "sysadmin", emp, new sysadmin(),"abc","def");
                
                
                //system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", emp, new sysadmin(),"abc","def");
        
        return system;
        
    }
    
}
