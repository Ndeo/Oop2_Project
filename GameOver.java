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

/**
 *
 * @author ASUS
 */
public class GameOver extends JPanel{
    JLabel GameOver=new JLabel("GameOver");
    JLabel Score=new JLabel("Score");
    JLabel Scoren=new JLabel();
    JButton Replay=new JButton("Replay");
    JButton Home=new JButton("Home");
    JButton ScoreBoard=new JButton("ScoreBoard");
    GameOver(){
       
        setLayout(new FlowLayout());
        add(GameOver);
        add(Score);
        add(Scoren);
        add(Replay);
        add(Home);
        add(ScoreBoard);
        
    }
    
}
