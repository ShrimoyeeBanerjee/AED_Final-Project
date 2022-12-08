/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Role.AdminRole;
import Role.FarmerRole;
import Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class farmer extends organization{
    public farmer() {
        super(Type.Farmer.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FarmerRole());
        return roles;
    }
}
