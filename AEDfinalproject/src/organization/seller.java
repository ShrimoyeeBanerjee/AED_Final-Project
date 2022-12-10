/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Roles.role;
import Roles.R_seller;
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
    public ArrayList<role> getSupportedRole() {
        ArrayList<role> roles = new ArrayList<>();
        roles.add(new R_seller());
        return roles;
    }
}
