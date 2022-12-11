/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package organization;

import organization.organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class organizationdirectory {
    
    private ArrayList<organization> organizationList;

    public organizationdirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<organization> getOrganizationList() {
        return organizationList;
    }
    
    public organization createOrganization(Type type){
        organization organization = null;
        if (type.getValue().equals(Type.Buyer.getValue())){
            organization = new buyer();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Seller.getValue())){
            organization = new seller();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Research.getValue())){
            organization = new researcher();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.EndUser.getValue())){
            organization = new Euser();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Farmer.getValue())){
            organization = new farmer();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Event.getValue())){
            organization = new event();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Funding.getValue())){
            organization = new funding();
            organizationList.add(organization);
        }
        
        return organization;
    }
}