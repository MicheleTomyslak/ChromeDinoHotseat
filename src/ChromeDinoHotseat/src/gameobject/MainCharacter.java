/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.image.BufferedImage;
import javafx.scene.input.KeyCode;
import javax.swing.JComponent;
import userinterface.GamePanel;
import util.Resource;

/**
 *
 * @author michele.tomyslak
 */
public class MainCharacter extends JComponent {
    /**
     * Costante che definisce il nome di default di un MainCharacter
     */
    public static final String DEFAULT_NAME = "Giocatore";
    
    
    
    
    
    /**
     * Proprietà contenente il nome del Dinosauro(varia in base al giocatore), e viene scelto nello startPanel.
     */
    private String name= DEFAULT_NAME;
    
    /**
     * Immagine statica del dinosauro corrente.
     */
    private BufferedImage sprite ;
    /**
     * Array contenente i 2 KeyCode dei due pulsanti dei comandi per questo dino.
     */
    private int[] controlKeys = {};
    
    
    public MainCharacter(){
        this.sprite = Resource.getResourceImage("data/dino.png");
        controlKeys= new int[2];
        
        setControls(27,28);
    }
    
    public void draw(Graphics2D g2d){
        
    }
    
    
    public void paint(Graphics g){
        super.repaint();
        /*g.setColor(Color.RED);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        */
        Graphics2D g2d = (Graphics2D)g;
        //g.drawImage(sprite, 0, 0,null);
        //g2d;
        g2d.drawImage(sprite, 0, 0, 0, 0, this.getWidth(), this.getHeight(), this.getWidth(), this.getHeight(), this);
    }
    
    
    public void jump(){
    }
    
    public void duck(){
        
    }
    
    
    public int[] getControls(){
        return controlKeys;
    }
    public void setControls(int jumpKey,int duckKey){
        this.controlKeys[0]=jumpKey;
        this.controlKeys[1]=duckKey;
    }
    
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nome:"+this.name);
        sb.append("\nJump Key:"+ this.getControls()[0]);
        sb.append("\nDuck Key:"+ this.getControls()[1]);
        sb.append("\nWidth dino:"+sprite.getWidth());
        sb.append("\nHeight dino:"+sprite.getHeight());
        
        return sb.toString();
        
        
    }
    
    
    public static void main(String[] args) {
        MainCharacter mc = new MainCharacter();
        GamePanel gp = new GamePanel();
        
        System.out.println(mc.toString());
    }
    
}
