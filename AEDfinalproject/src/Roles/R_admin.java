/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import UserAcc.useracc;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shalinishree
 */
public class R_admin extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc useracc, organization organization, Enterprise enterprise, ecosystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, enterprise, useracc,business);
    }
}
