/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Enterprise;

import organization.organization;
import organization.organizationdirectory;

/**
 *
 * @author hrishithaputtala
 */
public abstract class Enterprise extends organization{

    private EnterpriseType enterpriseType;
    private organizationdirectory organizationDirectory;
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new organizationdirectory();
    }
    
    public enum EnterpriseType{
        Agriculture("Agriculture"),
        FoodMarket("Food Market"),
        StateDepartment("State Department");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public organizationdirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

}
