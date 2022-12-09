/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;

import organization.organization;
import organization.organizationdirectory;

/**
 *
 * @author hrushithaputtala
 */
public abstract class Enterprise  extends organization{
    private EnterpriseType enterpriseType;
    private organizationdirectory organizationDirectory;
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new organizationdirectory();
    }
    
    public enum EnterpriseType{
        Agriculture("Agriculture"),
        cropmarket("Food Market"),
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
