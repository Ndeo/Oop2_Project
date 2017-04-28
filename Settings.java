/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaffury;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Settings extends JFrame{
    JLabel title=new JLabel("Settings");
    JLabel Sound=new JLabel("Sounds");
    JRadioButton bSound=new JRadioButton();
    JLabel Mode=new JLabel("Mode");
    JRadioButton bModen=new JRadioButton("Day");
    JRadioButton bModef=new JRadioButton("Night");
    ButtonGroup gMode = new ButtonGroup();
    
    Settings(){
        super("Settings");
        
        setLayout(new FlowLayout());
        add(title);
        add(Sound);
        add(bSound);
        gMode.add(bModen);
        gMode.add(bModef);
        add(Mode);
        add(bModen);
        add(bModef);
    }
//    public void main(){
//        Settings Settings=new Settings();
//        Settings.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
//        Settings.setSize(500, 500);
//        Settings.setVisible(true);
//    
//    }
}
