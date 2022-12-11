/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package organization;

import Info.CropInfoDirectory;
import Employe.ED;
import Roles.role;
import UserAcc.useraccDirectory;
import Work.queue;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public abstract class organization {

    private String name;
    private queue workQueue;
    private ED employeeDirectory;
    private useraccDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    private Type type;
    
    public enum Type{
        Admin("Admin Organization"),        
        Buyer("Buyer Organization"),  //Related to food market
        Seller("Seller Organization"), // Related to food market
        Event("Event Organization"),  // Related to state dept
        Funding("Funding Organization"),// Related to state dept
        Research("Research Organization"), //related to Agriculture
        EndUser("End User Organization"),//related to Agriculture
        Farmer("Farmer Organization");//related to Agriculture
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public organization(String name) {
        //this.type = type;
        this.name = name;
        workQueue = new queue();
        employeeDirectory = new ED();
        userAccountDirectory = new useraccDirectory();
        organizationID = counter;
        ++counter;
    }

 

    public abstract ArrayList<role> getSupportedRole();
    
    public useraccDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public ED getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public queue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(queue workQueue) {
        this.workQueue = workQueue;
    }
    
       public Type getType() {
        return type;
    }

    
       
    
       
    @Override
    public String toString() {
        return name;
    }
    
    
}
