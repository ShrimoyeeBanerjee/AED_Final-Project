/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Network;

import Enterprise.EnterpriseDirectory;

/**
 *
 * @author shalinishree
 */
public class subnetwork {
     private String name;
    private EnterpriseDirectory enterpriseDirectory;

    public subnetwork()
    {
        enterpriseDirectory = new EnterpriseDirectory();
    }
    

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    
    
}
