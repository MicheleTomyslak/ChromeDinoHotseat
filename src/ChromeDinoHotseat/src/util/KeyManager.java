
package util;
import java.awt.event.KeyEvent;



/**
 *
 * @author michele.tomyslak
 */
public class KeyManager {
    
    /**
     * Proprietà che rappresenta il codice numerico che permette al Dinosauro di saltare.
     * Valore di default => VK_SPACE
     */
   private int jumpKey = KeyEvent.VK_SPACE;
    /**
    * Proprietà che rappresenta il codice numerico che permette al Dinosauro di accovacciarsi.
    * Valore di default => VK_DOWN
    */
   private int duckKey = KeyEvent.VK_DOWN;
   /**
    * Costruttore del gestore dei tasti per ogni Dinosauro.
    * @param jumpKey Il codice del tasto di salto per il dinosauro
    * @param duckKey Il codice del tasto di accovacciamento per il dinosauro.
    */
   public KeyManager(int jumpKey,int duckKey){
       this.duckKey = duckKey;
       this.jumpKey = jumpKey;
       
   }
   /**
    * Costruttore vuoto.
    */
   public KeyManager(){
       
   }
   /**
    * Ritorna il tasto di accovacciamento usato dal dinosauro .
    * @return Il tasto di accovacciamento usato dal dinosauro.
    */
   public int getDuckKey(){
       return duckKey;
   }
   /**
    * Ritorna il tasto di salto usato dal dinosauro .
    * @return Il tasto di salto usato dal dinosauro.
    */
   public int getJumpKey(){
       return jumpKey;
   }
}
