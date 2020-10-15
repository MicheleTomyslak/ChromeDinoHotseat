/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.awt.event.KeyEvent;



/**
 *
 * @author michele.tomyslak
 */
public class KeyManager {
   private int jumpKey = KeyEvent.VK_SPACE;
   private int duckKey = KeyEvent.VK_DOWN;
   
   public KeyManager(int jumpKey,int duckKey){
       this.duckKey = duckKey;
       this.jumpKey = jumpKey;
       
   }
   
   public KeyManager(){
       
   }
   
   public int getDuckKey(){
       return duckKey;
   }
   
   public int getJumpKey(){
       return jumpKey;
   }
}
