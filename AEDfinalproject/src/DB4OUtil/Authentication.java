/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB4OUtil;

import java.awt.event.KeyEvent;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author shalinishree
 */
public class Authentication {
    public static void strings(KeyEvent evt, JTextField field) {
          char c = evt.getKeyChar();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') || (c==evt.VK_SPACE) || (c==evt.VK_CAPS_LOCK) || (c==evt.VK_SHIFT)||
            (c == evt.VK_BACK_SPACE) ||
            (c == evt.VK_DELETE))) {

        JOptionPane.showMessageDialog(null, "Please enter Alphabets only");
       field.setText("");
        }
     }
     
     public static void integers(KeyEvent evt, JTextField field) {
          char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')||
            (c == evt.VK_BACK_SPACE) ||
            (c == evt.VK_DELETE))) {

        JOptionPane.showMessageDialog(null, "Please enter Integers only");
       field.setText("");
        }
     }
}
