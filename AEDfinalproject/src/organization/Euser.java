/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
