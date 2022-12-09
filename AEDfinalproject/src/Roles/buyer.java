/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.buyer;
import organization.organization;
import UserAcc.useracc;
import userinterface.BuyerRole.BuyerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shalinishree
 */
public class buyer extends role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc account, organization organization, Enterprise enterprise, ecosystem business) {
        return new BuyerWorkAreaJPanel(userProcessContainer, account, (buyer)organization, enterprise,business);
    }
}
