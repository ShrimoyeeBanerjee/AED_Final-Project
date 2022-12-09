/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;
import java.util.ArrayList;

/**
 *
 * @author hrushithaputtala
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
        else if (type == Enterprise.EnterpriseType.cropmarket){
            enterprise = new cropmarket(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
