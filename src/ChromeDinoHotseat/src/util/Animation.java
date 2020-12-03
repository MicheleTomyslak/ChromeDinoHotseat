package util;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author tmich
 */
public class Animation {
    
    /**
     * La lista delle immagini usate per fare i frame dell'animazione del dinosauro che corre.
     */
    private List<BufferedImage> frames;
    /**
     * L'index delle immagini attuale.
     */
    private int frameIndex=0;
    /**
     * Tempo tra un immagine e un altra nell'animazione.
     */
    private int deltaTime;
    /**
     * L'ultimo tempo registrato.
     */
    private long previousTime;
    
    /**
     * Costruttore che permette di instanziare una rappresentazione grafica di un animazione, creata grazie ai frames contenuti nella lista frames.
     * 
     * 
     * @param deltaTime Il tempo di delay tra un immagine e un'altra.
     */
    public Animation(int deltaTime){
        this.deltaTime = deltaTime;
        frames = new ArrayList<>();
    }
    /**
     * Metodo che viene richiamato ad ogni ciclo della loop per aggiornare l'animazione.
     */
    public void update(){
        if(System.currentTimeMillis()- previousTime>deltaTime){
            frameIndex++;
            if(frameIndex >= frames.size()){
                frameIndex = 0;
            }
            
            previousTime =System.currentTimeMillis();
        }
        
        
    }
    /**
     * Aggiunge un frame (BufferedImage) nella lista dei frames disponibili per l'animazione.
     * @param frame L'immagine BufferedImage da aggiungere alla lista dei frame.
     */
    public void addFrame(BufferedImage frame){
        frames.add(frame);
        
    }
    
    /**
     * Getter del frame corrente.
     * @return La buffered image del frame corrente.
     */
    public BufferedImage getFrame(){
        if(frames.size()>0){
            return frames.get(frameIndex);
        }
        return null;
    }
    
    public int getNumberOfFrame(){
        return this.frames.size();
    }
}
