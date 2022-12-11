/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import UserAcc.useracc;
import javax.swing.JPanel;

/**
 *
 * @author shalinishree
 */
public abstract class role {
    
    public enum RoleType{
        Admin("Admin"),
        Buyer("Buyer"),  // Food Market
        Seller("Seller"), // Food Maket
        Farmer("Farmer"), // Agriculture
        Scientist("Scientist"), // Agriculture
        NewUser("New User"); //  Agriculture
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            useracc account, 
            organization organization, 
            Enterprise enterprise, 
            ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}