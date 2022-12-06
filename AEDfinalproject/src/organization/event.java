/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Role.EventOrganizerRole;
import Role.Role;
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
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EventOrganizerRole());
        return roles;
    }
}
