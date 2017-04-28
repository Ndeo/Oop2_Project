/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaffury;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
public class Register extends JFrame{
    JTextField  UserName = new JTextField(10);
  JLabel UserNamel = new JLabel("UserName") ;
  JPasswordField passwordField = new JPasswordField(10);
  JLabel PassWordl = new JLabel("Password");
  JPasswordField repasswordField = new JPasswordField(10);
  JLabel rePassWordl = new JLabel("Re-enter your Password");
  JButton Signin=new JButton("Register");
  JLabel icon =new JLabel();
  JLabel Email=new JLabel("Email");
  JTextField IEmail=new JTextField(10);
  
  public Register(){
      setLayout(new FlowLayout());
      add(UserNamel);
      add(UserName);
      add(Email);
      add(IEmail);
      add(icon);
      add(PassWordl);
      add(passwordField);
      add(rePassWordl);
      add(repasswordField);
      add(Signin);
      
  }
}
