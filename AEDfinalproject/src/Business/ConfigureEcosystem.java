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
        
        
        Employe employee = system.getEmployeeDirectory().createEmployee("RRH");
        
       
        
        useracc ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new sysadmin(),"abc","def");
        
        return system;
        
    }
    
}
