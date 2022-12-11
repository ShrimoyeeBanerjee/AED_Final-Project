/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.Euser;
import organization.organization;
import UserAcc.useracc;
import javax.swing.JPanel;
import UI.RolePlant.GardenerMainArea;

/**
 *
 * @author shalinishree
 */
public class NewUser extends role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc account, organization organization, Enterprise enterprise, ecosystem business) {
        return new GardenerMainArea(userProcessContainer, account, (Euser)organization, enterprise,business);
    }
    
}
