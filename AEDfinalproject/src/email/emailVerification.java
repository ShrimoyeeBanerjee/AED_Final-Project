/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package email;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
/**
 *
 * @author shalinishree
 */
public class emailVerification extends Authenticator{
    private PasswordAuthentication verify = null;
private String username;
private String password;
 


public emailVerification(String username,String password) {
this.username=username;
this.password=password;
this.verify = new PasswordAuthentication(username,password);
}
 
@Override
protected PasswordAuthentication getPasswordAuthentication() {
return verify;
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
