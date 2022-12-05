/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Network;

import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class network {
    private String name;
    private ArrayList<subnetwork> subnet;

    public network() {
       
        subnet = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<subnetwork> getSubNet() {
        return subnet;
    }

    public void setSubNet(ArrayList<subnetwork> subNet) {
        this.subnet = subNet;
    }

    

    public subnetwork createAndAddsubNetwork() {
        subnetwork subn = new subnetwork();
        subnet.add(subn);
        return subn;
    }

    @Override
    public String toString() {
        return name;
    }

}
