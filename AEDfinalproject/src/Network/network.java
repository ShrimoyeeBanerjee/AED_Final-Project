/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import Enterprise.EnterpriseDirectory;
import organization.organization;
import Roles.role;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class network{
    
    private String name;
    private ArrayList<subnetwork> subNet;

    public network() {
       
        subNet = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<subnetwork> getSubNet() {
        return subNet;
    }

    public void setSubNet(ArrayList<subnetwork> subNet) {
        this.subNet = subNet;
    }

    

    public subnetwork createAndAddsubNetwork() {
        subnetwork subn = new subnetwork();
        subNet.add(subn);
        return subn;
    }

    @Override
    public String toString() {
        return name;
    }

   
}
