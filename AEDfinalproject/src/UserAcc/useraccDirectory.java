/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAcc;
import Employe.Employe;
import Roles.role;
import java.util.ArrayList;


/**
 *
 * @author hrushithaputtala
 */
public class useraccDirectory {
    private ArrayList<useracc> userAccountList;

    public useraccDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<useracc> getuseraccountList() {
        return userAccountList;
    }
    
    public useracc authenticateUser(String username, String password){
        for (useracc ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                System.out.println("Account match found:" + ua.getUsername());
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
    
    public boolean checkUniqueusername(String username){
        for (useracc ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
