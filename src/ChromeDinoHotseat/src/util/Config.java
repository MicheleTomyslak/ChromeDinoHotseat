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
   public static final int DEFAULT_JUMP_KEY_PLAYER_ONE = 87;
   public static final int DEFAULT_DUCK_KEY_PLAYER_ONE = 83;
   public static final int DEFAULT_JUMP_KEY_PLAYER_TWO = 73;
   public static final int DEFAULT_DUCK_KEY_PLAYER_TWO = 75;
   public static final int DEFAULT_JUMP_KEY_PLAYER_THREE = 38;
   public static final int DEFAULT_DUCK_KEY_PLAYER_THREE = 40;
   public static final int DEFAULT_JUMP_KEY_PLAYER_FOUR = 104;
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



