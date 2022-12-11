/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import organization.seller;
import UserAcc.useracc;
import javax.swing.JPanel;
import UI.Seller.sellerMain;

/**
 *
 * @author Shrimoyee
 */
public class R_seller extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc account, organization organization, Enterprise enterprise, ecosystem business) {
        return new sellerMain(userProcessContainer, account, (seller)organization, enterprise,business);
    }
    
}
