/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAcc;
import Employe.Employe;
import Roles.role;
import Work.queue;

/**
 *
 * @author hrushithaputtala
 */
public class useracc {
    private String username;
    private String password;
    private Employe employee;
    private role role;
    private queue work;
    private String state;
    private String city;

    public useracc() {
        work = new queue();
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
        return work;
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
