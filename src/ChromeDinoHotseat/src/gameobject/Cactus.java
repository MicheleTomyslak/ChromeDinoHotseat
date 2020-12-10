package gameobject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.List;
import userinterface.GameScreen;


import util.Resource;

/**
 *
 * @author tmich
 */
public class Cactus extends Enemy{
    
    /**
     * Immagine che rappresenta il cactus
     */
    private BufferedImage image;
    /**
     * la coordinata x del cactus.
     */
    private int posX;
    /**
     * La coordinata y del cactus.
     */
    private int posY;
    
    /**
     * la hitbox del cactus, rappresentata da un oggetto Rectangle.
     */
    private Rectangle rect;
    /**
     * La lista di oggetti MainCharacter che rappresenta tutti i giocatori in partita.
     */
    private List<MainCharacter> dinos;
    
    /**
     * flag che gestisce se il punteggio è stato ricevuto o meno dalla classe ScoreManager.
     */
    private boolean isScoreGot = false;
    
    /**
     * La velocità di movimento del cactus nell'ambiente di gioco.
     */
    private float speedX = 4f;
    
    /**
     * La loop di gioco in cui deve essere il cactus corrente.
     */
    private GameScreen gameScreen;
    /**
     * flag che permette di rendere visibili o meno le hitbox del cactus, per debugging.
     */
    private boolean areHitboxVisible;
    
    /**
     * Cartella di default in cui sono contenute le cartelle per le skin dei cactus.
     */
    public static String DEFAULT_CACTUS_IMAGES_PATH="data/enemies/";
    /**
     * Costruttore che permette di rappresentare un Cactus, che estende Enemy, e permettere di mostrarlo a schermo.
     * Gestisce le collisioni con tutti gli oggetti di tipo MainCharacter contenuti nella lista dinos, nella loop di gioco GameScreen.
     * @param dinos La lista dei dinosauri che al momento sono in gioco (da 1 a 4).
     * @param gameScreen La loop di gioco che gestisce tutti gli eventi dei dino, e il movimento dei cactus, e del gioco in generale.
     */
    public Cactus(List<MainCharacter> dinos,GameScreen gameScreen){
        this.gameScreen = gameScreen;
        this.dinos = dinos;
        image = Resource.getResourceImage(DEFAULT_CACTUS_IMAGES_PATH+"cactus1.png");
        posX = 200;
        posY = 265;
        rect = new Rectangle();
    }
    
    @Override
    /**
     * Ovverride del metodo update contenuto in Enemy.
     * Si occupa di aggiornare lo stato e la posizione del cactus all'interno del gameScreen.
     */
    public void update(){
        posY = gameScreen.getGroundY();
        posX-=speedX;
        rect.x = posX;
        rect.y = posY-rect.height;
        rect.width = image.getWidth();
        rect.height = image.getHeight();
    }
    
    @Override
    /**
     * ritorna la hitbox del cactus, da cui si può rilevare una collisione con un dinosauro MainCharacter.
     */
    public Rectangle getBound(){
        return rect;
    }
    @Override
    /**
     * Metodo che disegna a schermo il cactus 
     */
    public void draw(Graphics2D g){
        g.drawImage(image, posX, gameScreen.getGroundY()-rect.height, null);
        if(areHitboxVisible){
            g.drawRect(rect.x, rect.y, rect.width, rect.height);
        }
    }
    
    /**
     * Setter del punto di origine X del Cactus.
     * @param x la x della coordinata di origine del disegno del cactus.
     */
    public void setX(int x){
        posX = x;
    }
    /**
     * Setter del punto di origine Y del Cactus.
     * @param y la y della coordinata di origine del disegno del cactus.
     */
    public void setY(int y){
        posY = y;
    }
    /**
     * Setter dell'immagine del cactus.
     * @param image L'immagine da sostuituire con quella precedente del cactus.
     */
    public void setImage(BufferedImage image){
        this.image = image;
    }

    @Override
    /**
     * Metodo che controlla se il cactus ha superato i MainCharacter e si trova fuori dallo schermo, così da poter cancellare il cactus e inserirne uno nuovo davanti ai dinosauri.
     */
    public boolean isOutOfScreen() {
        return (posX + image.getWidth() <0);
    }

    @Override
    /**
     * Controlla se il dino è ad un punto oltre la coordinata x del cactus, e se tutti i dinosauri hanno superato questo cactus ritorna true, altrimenti false.
     */
    public boolean isOver() {
        boolean flag=false;
        for(MainCharacter dino:dinos){
            flag = dino.getX() > posX;
        }
        return flag;
        
    }

    @Override
    /**
     * flag che controlla se lo Score è stato ricevuto o meno.
     */
    public boolean isScoreGot() {
        return isScoreGot;
    }

    @Override
    public void setIsScoreGot(boolean isScoreGot) {
        this.isScoreGot=isScoreGot;
    }
    /**
     * Setter della velocità di movimento del cactus nello schermo
     * default(4.0f)
     * @param speed La velocità da impostare al cactus.
     */
    public void setSpeed(float speed){
        this.speedX=speed;
    }
    /**
     * Getter della velocità attuale del Cactus sullo schermo.
     * @return la velocità del cactus a schermo.
     */
    public float getSpeed(){
        return speedX;
    }
    
    /**
     * Ritorna lo stato della visibilità delle hitbox del cactus.
     * @return lo stato della visibilità delle hitbox del cactus.
     */
    public boolean getHitboxState(){
        return areHitboxVisible;
    }

    

    @Override
    /**
     * Setter della visibilità delle hitbox, tramite l'attributo areHitboxVisible, che può venir settato a true o a false, a dipendenza delle necessità.
     */
    public void setHitBoxState(boolean areHitBoxVisible) {
        this.areHitboxVisible=areHitBoxVisible;
    }

    
}
