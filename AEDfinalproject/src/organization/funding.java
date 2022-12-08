/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import Role.FundOrganizerRole;
import Role.Role;
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
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new FundOrganizerRole());
        return roles;
    }
}
