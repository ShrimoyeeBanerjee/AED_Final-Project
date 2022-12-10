/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
