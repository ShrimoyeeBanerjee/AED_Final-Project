/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 *
 * @author shalinishree
 */
public class emailVerification extends Authenticator{
    private PasswordAuthentication authentication = null;
private String username;
private String password;
 


public emailVerification(String username,String password) {
this.username=username;
this.password=password;
this.authentication = new PasswordAuthentication(username,password);
}
 
@Override
protected PasswordAuthentication getPasswordAuthentication() {
return authentication;
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
}
