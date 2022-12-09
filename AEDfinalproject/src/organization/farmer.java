/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Roles.admin;
import Roles.farmer;
import Roles.role;
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
    public ArrayList<role> getSupportedRole() {
        ArrayList<role> roles = new ArrayList<>();
        roles.add(new farmer());
        return roles;
    }
}
