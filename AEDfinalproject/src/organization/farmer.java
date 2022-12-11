/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organization;

import Roles.R_admin;
import Roles.R_farmers;
import Roles.role;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class farmer extends organization {

   public farmer() {
        super(Type.Farmer.getValue());
    }
    
    @Override
    public ArrayList<role> getSupportedRole() {
        ArrayList<role> roles = new ArrayList<>();
        roles.add(new R_farmers());
        return roles;
    }
}
