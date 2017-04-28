/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaffury;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *titl
 * @author ASUS
 */
public class MainGate  extends JPanel{
  Icon leaflogo = new ImageIcon(getClass().getResource( "Leaffurylogo.png"));
        JLabel title =new JLabel("", leaflogo,0);
    
    
    JButton Start=new JButton("Start");
    JButton ScoreBoard=new JButton("Score Board");
    JButton Settings=new JButton("Settings");
    JButton AboutUs=new JButton("About Us!");
  
    
    public MainGate(){
        
        setLayout(new GridLayout(8,0,5,0));
        add(title);
        add(Start);
        add(ScoreBoard);
        add(Settings);
        add(AboutUs);
        bhstart hstart = new bhstart();
         bhsettings hsettings = new bhsettings();
         bhaboutUS haboutUS = new bhaboutUS();
         AboutUs.addActionListener(haboutUS);
        Start.addActionListener(hstart);
        Settings.addActionListener(hsettings);
        
        
    }
    private class bhstart implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            LeafFury.goToGameplay();
        }
    } 
    private class bhaboutUS implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
         //  aboutUs.main();
        }
    
    }
        private class bhsettings implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {
            
         
        }
    }
  
    }
     



    

