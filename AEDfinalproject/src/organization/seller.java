/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
