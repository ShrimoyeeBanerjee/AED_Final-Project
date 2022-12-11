/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organization;

import Roles.R_eventorganizer;
import Roles.role;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class event extends organization{

    public event() {
        super(Type.Event.getValue());
    }
    
    @Override
    public ArrayList<role> getSupportedRole() {
        ArrayList<role> roles = new ArrayList<>();
        roles.add(new R_eventorganizer());
        return roles;
    }
    
    
}
