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
public class Option{
    
    private int playerNumber;
    private int jumpKey;
    private int duckKey;
    
    Option(int playerNumber,int jumpKey,int duckKey){
        this.playerNumber = playerNumber;
        this.jumpKey = jumpKey;
        this.duckKey = duckKey;
        
    }
    
    Option(){
        
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getJumpKey() {
        return jumpKey;
    }

    public void setJumpKey(int jumpKey) {
        this.jumpKey = jumpKey;
    }

    public int getDuckKey() {
        return duckKey;
    }

    public void setDuckKey(int duckKey) {
        this.duckKey = duckKey;
    }
    
}