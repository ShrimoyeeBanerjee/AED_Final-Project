/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
//import Business.R_fundorganizer.fundorganizerMain;
import organization.funding;
import organization.organization;
import UserAcc.useracc;
import javax.swing.JPanel;
import UI.fundorganizer.fundorganizerMain;

/**
 *
 * @author Shrimoyee
 */
public class R_fundorganizer extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc account, organization organization, Enterprise enterprise, ecosystem business) {
        return new fundorganizerMain(userProcessContainer,(funding)organization ,account,business);
    }
    
}
