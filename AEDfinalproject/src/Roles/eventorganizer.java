/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.eventorganizerRole.EventOrganizerWorkAreaJPanel;

/**
 *
 * @author shalinishree
 */
public class eventorganizer extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, organization organization, Enterprise enterprise, ecosystem business) {
        return new EventOrganizerWorkAreaJPanel(userProcessContainer, enterprise,account,business);
    }
}
