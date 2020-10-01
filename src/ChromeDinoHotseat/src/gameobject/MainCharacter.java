/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

import java.awt.Color;
import java.awt.Graphics;
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
    
    public void paint(Graphics g){
        /*g.setColor(Color.RED);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        */
        g.drawImage(sprite, 0, 0,null);
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
