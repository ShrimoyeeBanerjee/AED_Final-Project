/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import UserAccount.UserAccount;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shalinishree
 */
public class admin extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, organization organization, Enterprise enterprise, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise,account,business);
    }
}
