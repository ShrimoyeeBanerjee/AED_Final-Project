/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Enterprise;
import Roles.role;

import java.util.ArrayList;

/**
 *
 * @author hrushithaputtala
 */
public class cropmarket extends Enterprise{
    public cropmarket(String name) {
        super(name, EnterpriseType.cropmarket);
    }

    @Override
    public ArrayList<role> getSupportedRole() {
        return null;
    }
}
