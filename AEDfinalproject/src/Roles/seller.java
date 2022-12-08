/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import organization.seller;
import UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SellerRole.SellerWorkAreaJPanel;
/**
 *
 * @author shalinishree
 */
public class seller extends role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, organization organization, Enterprise enterprise, ecosystem business) {
        return new SellerWorkAreaJPanel(userProcessContainer, account, (seller)organization, enterprise,business);
    }
}
