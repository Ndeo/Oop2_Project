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
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


/**
 *
 * @author ASUS
 */
public class SignIn extends JPanel{
  JTextField  UserName = new JTextField(10);
  JLabel UserNamel = new JLabel("UserName") ;
  JPasswordField passwordField = new JPasswordField(10);
  JLabel PassWordl = new JLabel("Password") ;
  JButton Signin=new JButton("Sign in");
  public SignIn(){
      add(UserNamel);
      add(UserName);
      add(PassWordl);
      add(passwordField);
      add(Signin);
      setLayout(new FlowLayout());
      
  }
}
