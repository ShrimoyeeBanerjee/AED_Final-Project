/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organization;

import Roles.R_fundorganizer;
import Roles.role;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class funding extends organization{

    public funding() {
        super(Type.Funding.getValue());
    }
    
    @Override
    public ArrayList<role> getSupportedRole() {
        ArrayList<role> roles = new ArrayList<>();
        roles.add(new R_fundorganizer());
        return roles;
    }
}
