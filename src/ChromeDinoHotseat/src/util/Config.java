/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author michele.tomyslak
 */
public class Config {
   private Option[] options = new Option[4];
   /**
    * Costante che definisce il tasto di default per saltare per il giocatore 1, che sarebbe 87, che rappresenta la W sulla tastiera.
    */
   public static final int DEFAULT_JUMP_KEY_PLAYER_ONE = 87;
   /**
    * Costante che definisce il tasto di default per abbassarsi per il giocatore 1, che sarebbe 83, che rappresenta la S sulla tastiera.
    */
   public static final int DEFAULT_DUCK_KEY_PLAYER_ONE = 83;
   
   /**
    * Costante che definisce il tasto di default per saltare per il giocatore 2, che sarebbe 73, che rappresenta la I sulla tastiera.
    */
   public static final int DEFAULT_JUMP_KEY_PLAYER_TWO = 73;
   /**
    * Costante che definisce il tasto di default per abbassarsi per il giocatore 2, ce sarebbe 71 che rappresenta la K sulla tastiera.
    */
   public static final int DEFAULT_DUCK_KEY_PLAYER_TWO = 75;
   /**
    * Costante che definisce il tasto di default per saltare per il giocatore 3, che sarebbe 38, che rappresenta la UP nelle freccette direzionali.
    */
   public static final int DEFAULT_JUMP_KEY_PLAYER_THREE = 38;
   /**
    * Costante che definisce il tasto di default per abbassarsi per il giocatore 3 , che sarebbe 40m che rappresenta DOWN nelle freccie direzionali.
    */
   public static final int DEFAULT_DUCK_KEY_PLAYER_THREE = 40;
   /**
    * Costante che definisce il tasto di default per saltare per il giocatore 4, che sarebbe 104, che rappresenta l'8 o UP  nel NUMPAD
    */
   public static final int DEFAULT_JUMP_KEY_PLAYER_FOUR = 104;
   /**
    * Costante che definisce il tasto di default per abbassarsi per il giocatore 4, che sarebbe 101, che rappresenta li 2 o DOWN nel NUMPAD.
    */
   public static final int DEFAULT_DUCK_KEY_PLAYER_FOUR = 101;
   
   public Config(){
       options[0] = new Option(1,DEFAULT_JUMP_KEY_PLAYER_ONE,DEFAULT_DUCK_KEY_PLAYER_ONE);
       options[1] = new Option(2,DEFAULT_JUMP_KEY_PLAYER_TWO,DEFAULT_DUCK_KEY_PLAYER_TWO);
       options[2] = new Option(3,DEFAULT_JUMP_KEY_PLAYER_THREE,DEFAULT_DUCK_KEY_PLAYER_THREE);
       options[3] = new Option(4,DEFAULT_JUMP_KEY_PLAYER_FOUR,DEFAULT_DUCK_KEY_PLAYER_FOUR);
   }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }
}



