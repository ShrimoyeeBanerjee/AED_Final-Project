/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    public enum roleType{
        Admin("Admin"),
        Buyer("Buyer"),  // Food Market
        Seller("Seller"), // Food Maket
        Farmer("Farmer"), // Agriculture
        researcher("Researcher"), // Agriculture
        NewUser("New User"); //  Agriculture
        
        private String value;
        private roleType(String value){
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
            useracc useracc, 
            organization organization, 
            Enterprise enterprise, 
            ecosystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
