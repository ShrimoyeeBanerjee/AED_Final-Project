package Business;

import Info.CropInfoDirectory;
import Network.network;
import organization.organization;
import Roles.role;
import Roles.sysadmin;
import java.util.ArrayList;

/**
 *
 * @author shalinishree
 */
public class ecosystem extends organization {

    private static ecosystem business;
    private ArrayList<network> networkList;
    private CropInfoDirectory cropDataDirectory;
    
    public CropInfoDirectory getCropDataDirectory() {
        return cropDataDirectory;
    }

    public void setCropDataDirectory(CropInfoDirectory cropDataDirectory) {
        this.cropDataDirectory = cropDataDirectory;
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
        cropDataDirectory=new CropInfoDirectory();
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