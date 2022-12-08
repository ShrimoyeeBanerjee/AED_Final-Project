/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employe;

import java.util.ArrayList;

/**
 *
 * @author hrushithaputtala
 */
public class ED {
    private ArrayList<Employe> employeList;
    
    public ED() {
        employeList = new ArrayList<>();
    }
    
    public ArrayList<Employe> getEmployeeList() {
        return employeList;
    }
    
    public Employe createEmploye(String name) {
        Employe employee = new Employe();
        employee.setName(name);

        employeList.add(employee);
        return employee;
    }
}
