/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.CropDataDirectory;
import Network.network;
import organization.organization;
import Roles.role;
import Roles.sysadmin;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class ecosystem extends organization{
    private static ecosystem business;
    private ArrayList<network> networkList;
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

    public ArrayList<network> getNetworkList() {
        return networkList;
    }

    public network createAndAddNetwork() {
        network network = new network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<role> getSupportedRole() {
        ArrayList<role> roleList = new ArrayList<>();
        roleList.add(new sysadmin());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

       

        return true;
    }
}
