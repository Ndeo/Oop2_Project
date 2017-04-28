/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaffury;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author ASUS
 */
public class AboutUs extends JFrame {
    JLabel title=new JLabel("title");
    
    JTextArea info=new JTextArea();
    JButton Home =new JButton("Home");
AboutUs(){
            setLayout(new FlowLayout());
            
info.setText("meow meow meow");

info.setLineWrap(true);

info.setEditable(false);

info.setColumns(20);

info.setRows(5);

add(title);
add(info);
add(Home);
 //ButtonHandler handler = new ButtonHandler();
//Home.addActionListener(handler);
}
}
//private class ButtonHandler implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//       //    maingate.main();
//        }
//}
// public void main(){
//        AboutUs AboutUs=new AboutUs();
//        AboutUs.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//        AboutUs.setSize(500, 500);
//        AboutUs.setVisible(true);
//    
//    }
//}
