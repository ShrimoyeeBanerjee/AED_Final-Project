/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAcc;

import Employe.Employe;
import Roles.role;
import Work.queue;

/**
 *
 * @author hrishithaputtala
 */
public class useracc {
    
    private String username;
    private String password;
    private Employe employee;
    private role role;
    private queue workQueue;
    private String state;
    private String city;

    public useracc() {
        workQueue = new queue();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public role getRole() {
        return role;
    }

    public void setEmployee(Employe employee) {
        this.employee = employee;
    }

    public void setRole(role role) {
        this.role = role;
    }

    public Employe getEmployee() {
        return employee;
    }

    public queue getWorkQueue() {
        return workQueue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}