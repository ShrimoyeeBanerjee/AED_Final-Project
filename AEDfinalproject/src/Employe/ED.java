/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Employe;

import Network.network;
import Network.subnetwork;
import java.util.ArrayList;

/**
 *
 * @author hrishithaputtala
 */
public class ED {
    
    private ArrayList<Employe> employeeList;
    
    public ED() {
        employeeList = new ArrayList<>();
    }
    
    public ArrayList<Employe> getEmployeeList() {
        return employeeList;
    }
    
    public Employe createEmployee(String name) {
        Employe employee = new Employe();
        employee.setName(name);

        employeeList.add(employee);
        return employee;
    }
}
