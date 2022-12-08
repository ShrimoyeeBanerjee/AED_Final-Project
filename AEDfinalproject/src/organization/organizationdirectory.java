/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organization;

import organization.organization.Type;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class organizationdirectory {
    private ArrayList<organization> orgList;

    public organizationdirectory() {
        orgList = new ArrayList<>();
    }

    public ArrayList<organization> getOrgList() {
        return orgList;
    }
    
    public organization createOrganization(Type type){
        organization organization = null;
        if (type.getValue().equals(Type.Buyer.getValue())){
            organization = new buyer();
            orgList.add(organization);
        }
        else if (type.getValue().equals(Type.Seller.getValue())){
            organization = new seller();
            orgList.add(organization);
        }
        else if (type.getValue().equals(Type.Research.getValue())){
            organization = new research();
            orgList.add(organization);
        }
        else if (type.getValue().equals(Type.EndUser.getValue())){
            organization = new Euser();
            orgList.add(organization);
        }
        else if (type.getValue().equals(Type.Farmer.getValue())){
            organization = new farmer();
            orgList.add(organization);
        }
        else if (type.getValue().equals(Type.Event.getValue())){
            organization = new event();
            orgList.add(organization);
        }
        else if (type.getValue().equals(Type.Funding.getValue())){
            organization = new funding();
            orgList.add(organization);
        }
        
        return organization;
    }
}
