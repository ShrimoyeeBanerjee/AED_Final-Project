/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import UserAccount.UserAccount;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shalinishree
 */
public class sysadmin extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, organization organization, Enterprise enterprise, ecosystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
}
