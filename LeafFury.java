/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leaffury;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class LeafFury {

    /**
     * @param args the command line arguments
     */
    public static Gameplay gp =new Gameplay();
    public static MainGate mg=new MainGate();
    public static AboutUs au =new AboutUs();
    public static Settings st =new Settings();
    public static GameOver go=new GameOver();
    public static Register rg=new Register();
    public static ScoreBoard sb=new ScoreBoard();
    public static Sign sg=new Sign();
    public static SignIn si=new SignIn();
    
    
    
    
    
    
    
    public static  JFrame a=new JFrame();
    public static void main(String[] args) {
        
       
       a.add(mg);
      a.setBounds(10,10,700,600);
      a.setTitle("LeafFury");
      a.setResizable(false);
      a.setVisible(true);
      a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println(a.getWidth());
      
    }
    public static void goToGameplay(){
        a.remove(mg);
        a.add(gp);
        a.setVisible(true);
        a.setBounds(10,10,700,600);
      a.setTitle("LeafFury");
      a.setResizable(false);
    }
    
     public static void MtAU(){
        
        a.remove(mg);
        a.add(au);
        a.setVisible(true);
        a.setBounds(10,10,700,600);
      a.setTitle("LeafFury");
      a.setResizable(false);
      
    }
     
     public static void MtS(){
        
        a.remove(mg);
        a.add(st);
        a.setVisible(true);
        a.setBounds(10,10,700,600);
      a.setTitle("LeafFury");
      a.setResizable(false);
      
    }
     
     
     
     
     
     
    public static void GtM(){
        
        a.remove(gp);
        a.add(mg);
        a.setVisible(true);
        a.setBounds(10,10,700,600);
      a.setTitle("LeafFury");
      a.setResizable(false);
      
    }
    public static void GtGo(){
        
        a.remove(gp);
        a.add(go);
        a.setVisible(true);
        a.setBounds(10,10,700,600);
      a.setTitle("LeafFury");
      a.setResizable(false);
      
    }
   
    
    public static void AUtM(){
        a.remove(au);
        a.add(mg);
        a.setVisible(true);
        a.setBounds(10,10,700,600);
      a.setTitle("LeafFury");
      a.setResizable(false);
      
    }
    public static void StM(){
        a.remove(st);
        a.add(mg);
        a.setVisible(true);
        a.setBounds(10,10,700,600);
      a.setTitle("LeafFury");
      a.setResizable(false);
      
    }
    
 
    
}
