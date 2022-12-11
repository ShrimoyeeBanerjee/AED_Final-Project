/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAcc;

import Employe.Employe;
import Roles.role;
import java.util.ArrayList;

/**
 *
 * @author hrishithaputtala
 */
public class useraccDirectory {
    
    private ArrayList<useracc> userAccountList;

    public useraccDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<useracc> getUserAccountList() {
        return userAccountList;
    }
    
    public useracc authenticateUser(String username, String password){
        for (useracc ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                System.out.println("Account match:" + ua.getUsername());
                return ua;
            }
        return null;
    }
    
    public useracc createUserAccount(String username, String password, Employe employee, role role,String state,String city){
        useracc userAccount = new useracc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccount.setState(state);
        userAccount.setCity(city);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (useracc ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
