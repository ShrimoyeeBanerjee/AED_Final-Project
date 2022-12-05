/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Data.CropDataDirectory;
import Employee.EmployeeDirectory;
import Role.Role;
import UserAccount.UserAccountDirectory;
import WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public abstract class organization {
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    private Type type;
    
    public enum Type{
        Admin("Organization: Admin"),        
        Buyer("Organization: Buyer"),  //Related to food market
        Seller("Organization: Seller"), // Related to food market
        Event("Organization: Event"),  // Related to state dept
        Funding("Organization: Funding"),// Related to state dept
        Research("Organization: Research"), //related to Agriculture
        EndUser("Organization: End User"),//related to Agriculture
        Farmer("Organization: Farmer");//related to Agriculture
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        //this.type = type;
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }

 

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
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
