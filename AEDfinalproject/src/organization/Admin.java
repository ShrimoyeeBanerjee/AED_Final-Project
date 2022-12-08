/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Roles.admin;
import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class Admin extends organization{
    public Admin() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Roles> getSupportedRole() {
        ArrayList<Roles> roles = new ArrayList<>();
        roles.add(new admin());
        return roles;
    }
}
