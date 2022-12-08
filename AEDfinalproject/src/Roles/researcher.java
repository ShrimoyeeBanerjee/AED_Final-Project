/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import organization.research;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.reseracherRole.researcherWorkAreaJPanel;
/**
 *
 * @author shalinishree
 */
public class researcher extends role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, organization organization, Enterprise enterprise, ecosystem business) {
        return new researcherWorkAreaJPanel(userProcessContainer, account, (research)organization, enterprise,business);
    }
}
