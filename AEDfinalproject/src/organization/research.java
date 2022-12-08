/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Role.FarmerRole;
import Role.Role;
import Role.ScientistRole;
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
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FarmerRole());
        roles.add(new ScientistRole());
        return roles;
    }
}
