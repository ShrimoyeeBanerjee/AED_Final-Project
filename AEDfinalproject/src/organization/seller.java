/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Role.Role;
import Role.SellerRole;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class seller extends organization{
    public seller() {
        super(organization.Type.Seller.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SellerRole());
        return roles;
    }
}
