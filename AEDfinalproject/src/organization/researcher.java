/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class researcher extends organization{
    
    public researcher() {
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
