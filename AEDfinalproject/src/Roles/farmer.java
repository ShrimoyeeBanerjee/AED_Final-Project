/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.farmer;
import organization.organization;
import organization.research;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.farmerRole.FarmerDashBoard;
import userinterface.farmerRole.FarmerWorkAreaJPanel;
/**
 *
 * @author shalinishree
 */
public class farmer extends role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, organization organization, Enterprise enterprise, ecosystem business) {
        return new FarmerDashBoard(userProcessContainer, account,(farmer)organization, enterprise,business);
        //return new FarmerWorkAreaJPanel(userProcessContainer, account, (FarmerOrganization)organization, enterprise,business);
    }
}
