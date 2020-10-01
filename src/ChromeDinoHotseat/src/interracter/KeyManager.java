/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interracter;

import gameobject.MainCharacter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author michele.tomyslak
 */
public class KeyManager implements KeyListener{
    
    
    private int[] jumpKey;
    private int[] dinosID= new int[4];
    private MainCharacter[] dinos ;
    
    public KeyManager(MainCharacter[] dinos){
        for (int i = 0; i < dinosID.length; i++) {
            dinosID[i]=i;
        }
        this.dinos = dinos;
        jumpKey = new int[2];
        
        
    }
    
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP:
                dinos[0].jump();
                
            
                break;
            case KeyEvent.VK_DOWN:
                dinos[0].duck();
                break;
                
                
                
                
                
                
        }



        if(e.getKeyCode()==KeyEvent.VK_SPACE){
            dinos[dinosID[0]].jump();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
  
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    
}
