/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enterprise;

import java.util.ArrayList;

/**
 *
 * @author hrishithaputtala
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Agriculture){
            enterprise = new Agriculture(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.StateDepartment){
            enterprise = new State(name);
            enterpriseList.add(enterprise);
        }
        else if (type == Enterprise.EnterpriseType.FoodMarket){
            enterprise = new cropmarket(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
