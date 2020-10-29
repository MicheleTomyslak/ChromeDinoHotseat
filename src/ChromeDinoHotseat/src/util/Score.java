/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Date;

/**
 *
 * @author michele.tomyslak
 */
public class Score {
    private String name="";
    private int scoredPoints=0;
    private long date;
    
    public String getName(){
        return name;
    }
    public int getScoredPoints(){
        return scoredPoints;
    }
    public Score(String name,int scoredPoints,long date){
        this.name = name;
        this.scoredPoints = scoredPoints;
        this.date = date;
        
        
    }
    
    public String toString(){
        return name+","+scoredPoints+","+new Date(date).toString();
    }
    
    
}
