/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Data.CropDataDirectory;
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
    private queue queue;
    private ED employeelist;
    private useraccDirectory uad;
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

    public organization(String name) {
        //this.type = type;
        this.name = name;
        queue = new queue();
        employeelist = new ED();
        uad = new useraccDirectory();
        organizationID = counter;
        ++counter;
    }

 

    public abstract ArrayList<role> getSupportedRole();
    
    public useraccDirectory getUserAccountDirectory() {
        return uad;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public ED getEmployeeDirectory() {
        return employeelist;
    }
    
    public String getName() {
        return name;
    }

    public queue getWorkQueue() {
        return queue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(queue queue) {
        this.queue = queue;
    }
    
       public Type getType() {
        return type;
    }

    
       
    
       
    @Override
    public String toString() {
        return name;
    }
    
}
