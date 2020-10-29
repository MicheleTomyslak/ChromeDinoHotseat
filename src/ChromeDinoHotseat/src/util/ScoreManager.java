/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michele.tomyslak
 */
public class ScoreManager {
    List<Score> scores;
    public ScoreManager(String path){
        scores = Resource.getScores(path);
        List<Score> orderedScores = getOrderedScore();
    }
    
    public List<Score> getScores(){
        return scores;
    }
    
    public Score getScore(int index){
        return scores.get(index);
    }
    
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Score s :scores){
            sb.append("nome:"+s.getName()+",score:"+s.getScoredPoints()+"\n");
        }
        
        return sb.toString();
    }
    
    
    public List<Score> getOrderedScore(){
        List<Score> orderedScores = new ArrayList<>();
        List<Integer> ordScores = new ArrayList<>();
        for(Score s:scores){
            ordScores.add(s.getScoredPoints());
        }
        
        
        Collections.sort(ordScores);
        Collections.reverse(ordScores);
        Iterator itr = ordScores.iterator();
        int counter = 0;
        
        return orderedScores;
    
    }    
    
    /**
     * Metodo che ritorna la lista dei nomi in base al punteggio score.
     * @param score è il punteggio che si sta cercando nella classifica.
     * @return la lista dei nomi dei giocatori che hanno ottenuto il punteggio score.
     */
    public List<String> getNamesByScore(int score){
        List<String> strlist  = new ArrayList<>();
        for(Score s :scores){
            if(s.getScoredPoints() == score){
                strlist.add(s.getName());
            }
        }
        
        return strlist;
    }
    
    
    /**
     * Metodo che ritorna la lista dei punteggi effettuati da un determinato giocatore.
     * @param name il nome del giocatore di cui cercare i punteggi
     * @return La lista dei punteggi eseguiti dal giocatore name.
     */
    public List<Integer> getScoresByName(String name){
        List<Integer> intlist = new ArrayList<>();
        for(Score s:scores){
            if(s.getName().equals(name)){
                intlist.add(s.getScoredPoints());
            }
        }
        return intlist;
    }
    
    public void update()
    {
        this.scores = Resource.getScores("data/scores.csv");
    }
}
