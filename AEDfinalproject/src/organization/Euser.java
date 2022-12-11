/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organization;

import Roles.NewUser;
import Roles.role;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class Euser extends organization{
    
    public Euser() {
        super(organization.Type.EndUser.getValue());
    }
    
    @Override
    public ArrayList<role> getSupportedRole() {
        ArrayList<role> roles = new ArrayList<>();
        roles.add(new NewUser());
        return roles;
    }
}
