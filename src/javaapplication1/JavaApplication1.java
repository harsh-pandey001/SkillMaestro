/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JavaApplication1 {

    public String us;

    public JavaApplication1(String v) {

        this.us = v;
    }

    public String assign() {

//        try {
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//            con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
//
//            if (pwd.isEmpty() || Name.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Fill all the boxes!");
//            } else {
//                pat = con.prepareStatement("insert into Table1(Username,Name,Phnumber,Password) values(?,?,?,?)");
//                pat.setString(1, Username.trim());
//                pat.setString(2, Name);
//                pat.setString(3, Phnumber);
//                pat.setString(4, pwd);
//                pat.executeUpdate();
////                        dispose();
//                JOptionPane.showMessageDialog(this, "Enter User id  and Password");
//                Loginpage.main(null);
//            }
//
//        } catch (ClassNotFoundException e1) {
//
//            JOptionPane.showMessageDialog(this, "System error");
//
//        } catch (SQLException ex) {
//
//            if (ex instanceof SQLIntegrityConstraintViolationException) {
//                JOptionPane.showMessageDialog(this, "Username is already Exist!");
//            } else {
//                JOptionPane.showMessageDialog(this, "System error");
//
//                Logger.getLogger(signuppagedemo.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//        
//          
//
        return null;

//        try {
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//            con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
//
//            if (pwd.isEmpty() || Name.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Fill all the boxes!");
//            } else {
//                pat = con.prepareStatement("insert into Table1(Username,Name,Phnumber,Password) values(?,?,?,?)");
//                pat.setString(1, Username.trim());
//                pat.setString(2, Name);
//                pat.setString(3, Phnumber);
//                pat.setString(4, pwd);
//                pat.executeUpdate();
////                        dispose();
//                JOptionPane.showMessageDialog(this, "Enter User id  and Password");
//                Loginpage.main(null);
//            }
//
//        } catch (ClassNotFoundException e1) {
//
//            JOptionPane.showMessageDialog(this, "System error");
//
//        } catch (SQLException ex) {
//
//            if (ex instanceof SQLIntegrityConstraintViolationException) {
//                JOptionPane.showMessageDialog(this, "Username is already Exist!");
//            } else {
//                JOptionPane.showMessageDialog(this, "System error");
//
//                Logger.getLogger(signuppagedemo.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        }
//    }
//    public static void main(String[] args) {
//        
//          
//
    }
}
