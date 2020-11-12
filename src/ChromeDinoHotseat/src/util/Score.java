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
    
    /**
     * Il nome del giocatore che ha effettuato il  punteggio.
     */
    private String name="";
    
    /**
     * Il punteggio ottenuto dal giocatore.
     */
    private int scoredPoints=0;
    /**
     * La data in timestamp attuale.
     */
    private long date;
    /**
     * Getter del nome del giocatore che ha questo oggetto Score.
     * @return Il nome del giocatore che utilizza questo Score.
     */
    public String getName(){
        return name;
    }
    /**
     * Getter dei punti totalizzati dal giocatore.
     * @return I punti totalizzati dal giocatore.
     */
    public int getScoredPoints(){
        return scoredPoints;
    }
    
    /**
     * Costruttore che permtette di instanziare un nuovo oggetto di tipo Score, con 3 parametri
     * @param name Il nome del giocatore di cui si vuole salvare il punteggio.
     * @param scoredPoints Il punteggio ottenuto dal giocatore di cui si vuole salvare il punteggio.
     * @param date La data in millisecondi in cui il giocatore ha ottenuto il punteggio che vuole salvare.
     */
    public Score(String name,int scoredPoints,long date){
        this.name = name;
        this.scoredPoints = scoredPoints;
        this.date = date;
        
        
    }
    /**
     * Override del metodo toString(), che permette di mostrare i 3 attributi della classe Score in una Stringa, delimitatida una ",".
     * @return La stringa rappresentante lo Score.
     */
    @Override
    public String toString(){
        return name+","+scoredPoints+","+new Date(date).toString();
    }
    /**
     * Costruttore vuoto di Score.
     * Di default setta il nome a DEFAULT e il punteggio e la data a 0.
     */
    public Score(){
        this.name="DEFAULT";
        this.scoredPoints= 0;
        this.date= 0;
    }
    
}
