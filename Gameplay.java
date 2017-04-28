package leaffury;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


import java.awt.*;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Gameplay extends JPanel implements KeyListener, ActionListener{
    private boolean play= false;
    private int score=50;
    private BufferedImage level=null;
    private BufferedImage enviroment=null;
    private int totalObstical=0;
    private int multiplyer=1;
    private Timer timer;
    private int delay=8;
    
    private int playerx =500;
    private boolean Over=false;
    private int gballposx=((int)(Math.random()*600));
    private int gballposy=((int)(Math.random()*300));
    
    private int yballposx=((int)(Math.random()*600));
    private int yballposy=((int)(Math.random()*300));
    
    
    private int rballposx=((int)(Math.random()*600));;
    private int rballposy=((int)(Math.random()*300));
    
    
    private int bballposx=((int)(Math.random()*600));;
    private int bballposy=((int)(Math.random()*300));
    
    private int blueCounter=0;
    private int greenCounter=0;
    private int yellowCounter=0;
    private int redCounter=0;
        
    private int leafXDir=+1;
    private int leafYDir=+2;
    
    public void resetBlue(){
        bballposx=((int)(Math.random()*600));
        bballposy=((int)(Math.random()*300));
        
    }
    public void resetRed(){
        rballposx=((int)(Math.random()*600));
        rballposy=((int)(Math.random()*300));
        
    }
    public void resetYellow(){
        yballposx=((int)(Math.random()*600));
        yballposy=((int)(Math.random()*300));
        
    }
    public void resetGreen(){
        gballposx=((int)(Math.random()*600));
        gballposy=((int)(Math.random()*300));
        
    }
    public Gameplay(){
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer=new Timer(delay,this);
        timer.start();
    }
    public void paint(Graphics g){
        //background
           BufferedImage image = null;
        try {
            image = ImageIO.read(new File("C:\\Users\\ASUS\\Desktop\\Background.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
        }
//        paintComponent(g);
//        g.drawImage(image, 0, 0, this);
//        Icon backgroundp = new ImageIcon(getClass().getResource( "Background.jpg"));
//          JLabel background =new JLabel("",backgroundp,0);
//          add(background);
//        g.setColor(Color.black);
//        g.fillRect(1, 1, 692, 592);
//        
        //borders
           BufferedImage border = null;
        try {
            border = ImageIO.read(new File("C:\\Users\\ASUS\\Desktop\\border.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
        }
         BufferedImage leaf = null;
        try {
            leaf = ImageIO.read(new File("C:\\Users\\ASUS\\Desktop\\Leafo.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(Gameplay.class.getName()).log(Level.SEVERE, null, ex);
        }
        paintComponent(g);
        g.drawImage(image, 0, 0, this);
        g.drawImage(border, 685, 0, this);
        g.drawImage(border, 0, 0, this);
        g.drawImage(leaf, playerx, 450, this);
//        g.setColor(Color.yellow);
//        g.fillRect(border,0,3,592);
//        g.fillRect(0,0,692,3);
//        g.fillRect(691,0,3,592);
        
        //the paddle
//        g.setColor(Color.gray);
//        g.fillRect(playerx, 550, 100, 100);
//       
        
        
//        g.fillRect(playerx, 550, 50, 50);
        
        //score
        g.setColor(Color.orange);
        g.setFont(new Font("serif",Font.BOLD,25));
        g.drawString("Score  "+score,500, 30);
        
        
        //when over
        if(Over){
            g.setColor(Color.red);
        g.setFont(new Font("serif",Font.BOLD,70));
        g.drawString("Game Over  ",250, 250);
          g.setColor(Color.red);
        g.setFont(new Font("serif",Font.BOLD,20));
        g.drawString("Your Score is "+score+"  Press Enter to continue",250, 300);
        }
        //the things
        
        g.setColor(Color.green);
        g.fillRect(gballposx,gballposy,20,20);
        
        g.setColor(Color.yellow);
        g.fillRect(yballposx,yballposy,20,20);
        
        g.setColor(Color.red);
        g.fillRect(rballposx,rballposy,20,20);
        
        g.setColor(Color.blue);
        g.fillRect(bballposx,bballposy,20,20);
        
//        Icon leaf = new ImageIcon(getClass().getResource( "Leaf.png"));
//            JLabel title =new JLabel("", leaf,0);
//        title.setBounds(playerx, 0, 100, 100);
//       
//        add(title);
        g.dispose();
                
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_ENTER){
            
            if(Over){
                if(!play){
                   LeafFury.GtGo(); 
                }
            }
        }
        if(!Over){
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            if(playerx >=600){
                playerx=600;
            }else{
                moveRight();
            }
    }
        
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
                if(playerx <=10){
                playerx=10;
            }else{
                moveLeft();
            }
        }
        }   
        
    }
    public void moveRight() {
            play =true;
            playerx+=80;
        }
    public void moveLeft() {
            play =true;
            playerx-=80;
        }
    @Override
    public void keyReleased(KeyEvent e) {
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        timer.start();
        if(play){
          
            if(new Rectangle(gballposx,gballposy,20,20).intersects(new Rectangle(playerx,450,100,8))){
                 if(greenCounter<20){
                resetGreen();       
                greenCounter++;
                 }
   
                score+=1*multiplyer;
            }

            if(new Rectangle(yballposx,yballposy,20,20).intersects(new Rectangle(playerx,450,100,20))){
                         
                 if(yellowCounter<20) {
                resetYellow();
                 yellowCounter++;
                         }
                score--;
                
            }
            if(new Rectangle(rballposx,rballposy,20,20).intersects(new Rectangle(playerx,450,100,20))){
            
            Over=true;    
            
                
            }
            if(new Rectangle(bballposx,bballposy,20,20).intersects(new Rectangle(playerx,450,100,20))){
                  
                    if(blueCounter<8){
                resetBlue();
                blueCounter++;
                    }
                multiplyer++;
            }
            if(new Rectangle(bballposx,bballposy,20,20).intersects(new Rectangle(1,550,600,1))){
                if(blueCounter<8){
                resetBlue();
                blueCounter++;
                        }
            }
            if(new Rectangle(rballposx,rballposy,20,20).intersects(new Rectangle(1,550,600,1))){
                
                if(redCounter<2) {
                resetRed();
                redCounter++;
                }
            }
            if(new Rectangle(yballposx,yballposy,20,20).intersects(new Rectangle(1,550,600,1))){
                if(yellowCounter<20) {
                resetYellow();
                yellowCounter++;
                }
            }
            if(new Rectangle(gballposx,gballposy,20,20).intersects(new Rectangle(1,550,600,1))){
                if(greenCounter<20) {
                    greenCounter++;
                resetGreen();    
                }
            }
            
            gballposx +=leafXDir;
            gballposy +=leafYDir;
            
            
            yballposx +=leafXDir;
            yballposy +=leafYDir;
            
            
            rballposx +=leafXDir;
            rballposy +=leafYDir;
            
            
            bballposx +=leafXDir;
            bballposy +=leafYDir;
            
            
//            if(ballposx intersect(playerx)){
            
//        }
            if(gballposx <0){
                leafXDir= -leafXDir;
            }
            if(gballposx <670){
                leafXDir= -leafXDir;
            }
            if(Over){
                play=false;
            }
        }
        repaint();
    }
    
}

