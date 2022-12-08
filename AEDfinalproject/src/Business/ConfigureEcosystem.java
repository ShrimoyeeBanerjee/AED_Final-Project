/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Employee.Employee;
import Network.Network;
import Roles.sysadmin;
import Business.UserAccount.UserAccount;
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
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
       
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole(),"abc","def");
        
        return system;
        
    }
    
}
