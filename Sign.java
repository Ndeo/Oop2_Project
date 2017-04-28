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

/**
 *
 * @author ASUS
 */
public class Sign extends JFrame{
    
    JLabel title =new JLabel("LeafFury");
    JButton signIn =new JButton("Sign in");
    JButton Register =new JButton("Register");
    public Sign(){
        super("Sign");
        setLayout(new FlowLayout());
        add(title);
        add(signIn);
        add(Register);
    }
//    public void main(){
//        Sign Sign=new Sign();
//        Sign.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//        Sign.setSize(500, 500);
//        Sign.setVisible(true);
//    
//    }
    
}
