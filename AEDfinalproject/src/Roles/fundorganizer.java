/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.funding;
import organization.organization;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FundOrganizerRole.FundOrganizerWorkAreaJPanel;
/**
 *
 * @author shalinishree
 */
public class fundorganizer extends role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, organization organization, Enterprise enterprise, ecosystem business) {
        return new FundOrganizerWorkAreaJPanel(userProcessContainer,(funding)organization ,account,business);
    }
}
