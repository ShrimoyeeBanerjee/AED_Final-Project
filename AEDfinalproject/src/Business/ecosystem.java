/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Data.CropDataDirectory;
import Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class ecosystem extends Organization{
    private static ecosystem business;
    private ArrayList<Network> networkList;
    private CropDataDirectory cropsDataDirectory;
    
    public CropsDataDirectory getCropDataDirectory() {
        return cropsDataDirectory;
    }

    public void setCropDataDirectory(CropsDataDirectory cropDataDirectory) {
        this.cropsDataDirectory = cropDataDirectory;
    }

    public static ecosystem getInstance() {
        if (business == null) {
            business = new ecosystem();
        }
        return business;
    }

    private ecosystem() {
        super(null);
        networkList = new ArrayList<>();
        cropsDataDirectory=new CropsDataDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

       

        return true;
    }
}
