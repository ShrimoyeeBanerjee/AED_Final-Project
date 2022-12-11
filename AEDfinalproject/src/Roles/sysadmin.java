/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.organization;
import UserAcc.useracc;
import UI.sysAdmin.sysadminWorkarea;
import javax.swing.JPanel;

/**
 *
 * @author shalinishree
 */
public class sysadmin extends role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, useracc account, organization organization, Enterprise enterprise, ecosystem system) {
        return new sysadminWorkarea(userProcessContainer, system);
    }
    
}
