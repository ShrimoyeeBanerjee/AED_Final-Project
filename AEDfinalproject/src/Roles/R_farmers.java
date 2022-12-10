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
    public JPanel createWorkArea(JPanel userProcessContainer, useracc useracc, organization organization, Enterprise enterprise, ecosystem business) {
        return new farmerMainboard(userProcessContainer, useracc, (R_farmers)organization, enterprise, business);
    }
}
