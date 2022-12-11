/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import organization.researcher;
import UserAcc.useracc;
import javax.swing.JPanel;
import UI.researcher.researcherMain;

/**
 *
 * @author Shrimoyee
 */
public class R_researcher extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc account, organization organization, Enterprise enterprise, ecosystem business) {
        return new researcherMain(userProcessContainer, account, (researcher)organization, enterprise,business);
    }
    
}
