/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.buyer;
import organization.organization;
import UserAcc.useracc;
import javax.swing.JPanel;
import UI.buyer.buyerMainarea;

/**
 *
 * @author shalinishree
 */
public class R_buyer extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc account, organization organization, Enterprise enterprise, ecosystem business) {
        return new buyerMainarea(userProcessContainer, account, (buyer)organization, enterprise,business);
    }
    
}
