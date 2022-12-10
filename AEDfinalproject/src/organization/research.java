/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Roles.R_farmers;
import Roles.role;
import Roles.R_researcher;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class research extends organization{
    public research() {
        super(organization.Type.Research.getValue());
    }
    
    @Override
    public ArrayList<role> getSupportedRole() {
        ArrayList<role> roles = new ArrayList<>();
        roles.add(new R_farmers());
        roles.add(new R_researcher());
        return roles;
    }
}
