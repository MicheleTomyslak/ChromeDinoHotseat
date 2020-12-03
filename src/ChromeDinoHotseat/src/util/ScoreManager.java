/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import flexjson.JSONSerializer;
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
    private List<Score> scores;
    private String path = "data/Scores.json";
    public ScoreManager(String path){
        this.path = path;
        scores = Resource.getScores(path);
        
    }
    
    public ScoreManager(){
        scores = new ArrayList<>();
        //scores = Resource.getScores(path);
        
    }
    
    
    
    public List<Score> getScores(){
        return scores;
    }
    
    /**
     * Getter di uno Score nella lista degli scores contenuti nella classe ScoreManager.
     * @param index L'indice da cui prendere il punteggio.
     * @return L'oggetto Score all'indice index.
     */
    public Score getScore(int index){
        return scores.get(index);
    }
    
    
    @Override
    /**
     * Override di ToString che stampa in maniera presentabile tutti i punteggi contenuti nello ScoreManager.
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Score s :scores){
            sb.append("nome:"+s.getName()+",score:"+s.getScoredPoints()+"\n");
        }
        
        return sb.toString();
    }
    
    /**
     * Metodo che ritorna in modo ordinato la lista dei punteggi, per preparare la classifica.
     * #NON FUNZIONANTE
     * 
     */
    public void getOrderedScore(){
        Resource.bubbleSort(this);
    
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
    /**
     * Metodo che viene invocato ad ogni ciclo della loop di gioco.
     */
    public void update()
    {
        
        //this.scores = Resource.getScores("data/scores.csv");
        
    }
    
   
    
    public ScoreManager orderScores(ScoreManager s){
        List<Score> sList = s.getScores();
        
        ScoreManager newS = Resource.bubbleSort(s);
        return newS;
    }
    
    
    
    public String exportAsJSON(){
        StringBuilder sb = new StringBuilder();
        for (Score s : scores) {
            sb.append(new JSONSerializer().serialize(s));
        }
        return sb.toString();
    }
    
    public void saveData(){
        Resource.writeJSONScoreData(this);
    }
    public static ScoreManager getDataFromJSON(){
        List<String> ls = Resource.getResourceFileContent(Resource.DEFAULT_SCORES_PATH);
        StringBuilder sb = new StringBuilder();
        for(String s:ls){
            sb.append(s);
        }
        
        return Resource.getScoreManagerFromJSON(sb.toString());
        
    }
    
    public void addScore(Score s){
        this.scores.add(s);
    }
    
    public void addListOfScores(List<Score> scores){
        for(Score s :scores){
            this.scores.add(s);
        }
    }
    
    
}
