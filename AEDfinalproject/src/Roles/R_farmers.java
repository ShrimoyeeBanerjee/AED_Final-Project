/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.farmer;
import organization.organization;
import organization.researcher;
import UserAcc.useracc;
import javax.swing.JPanel;
import UI.farmer.farmerMainboard;
import UI.farmer.farmerQA;

/**
 *
 * @author shalinishree
 */
public class R_farmers extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc account, organization organization, Enterprise enterprise, ecosystem business) {
        return new farmerMainboard(userProcessContainer, account, (farmer)organization, enterprise,business);
        //return new farmerQA(userProcessContainer, account, (farmer)organization, enterprise,business);
    }
    
}
