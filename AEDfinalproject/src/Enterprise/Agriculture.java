/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enterprise;

import Roles.role;
import java.util.ArrayList;

/**
 *
 * @author hrishithaputtala
 */
public class Agriculture extends Enterprise{

  
    public Agriculture() {
        super(null,null);
    }
    
    public Agriculture(String name) {
        super(name, EnterpriseType.Agriculture);
    }

    @Override
    public ArrayList<role> getSupportedRole() {
        return null;
    }
    
    
    
}
