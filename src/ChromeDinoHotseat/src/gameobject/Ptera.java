package gameobject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Random;
import userinterface.GameScreen;
import util.Animation;


import util.Resource;

/**
 * Rappresenta uno pteranodonte nel gioco del ChromeDino, questo utilizzando animazioni composte da serie di immagini definite in animation.
 * @author Michele Tomyslak
 * @version 3.12.2020
 */
public class Ptera extends Enemy{
    
    
    private Animation animation;
    private int posX;
    private int posY;
    private Rectangle rect;
    private List<MainCharacter> dinos;
    private boolean isScoreGot = false;
    private boolean isFlyingLow = false;
    private float speedX = 4f;
    private GameScreen gameScreen;
    private boolean areHitboxVisible;
    
    public static String DEFAULT_ENEMIES_IMAGES_PATH="data/enemies/";
    
    public Ptera(List<MainCharacter> dinos,GameScreen gameScreen){
        this.gameScreen = gameScreen;
        this.dinos = dinos;
        animation = new Animation(200);
        animation.addFrame(Resource.getResourceImage(DEFAULT_ENEMIES_IMAGES_PATH+"ptera1.png"));
        animation.addFrame(Resource.getResourceImage(DEFAULT_ENEMIES_IMAGES_PATH+"ptera2.png"));
        Random r = new Random();
        isFlyingLow= r.nextBoolean();
        if(isFlyingLow){
            posY = 265;
        }else{
            posY = 220;
        }
        posX = 200;
        
        rect = new Rectangle();
    }
    
    @Override
    public void update(){
        animation.update();
        posY = gameScreen.getGroundY();
        posX-=speedX;
        rect.x = posX;
        rect.y = posY-rect.height;
        rect.width = animation.getFrame().getWidth();
        rect.height = animation.getFrame().getHeight();
    }
    
    @Override
    /**
     * Ritorna la ClipBound del pteranodonte, cioè la sua Hitbox , definita da un rettangolo.
     */
    public Rectangle getBound(){
        return rect;
    }
    @Override
    public void draw(Graphics2D g){
        
        g.drawImage(animation.getFrame(), posX, gameScreen.getGroundY()-rect.height, null);
        if(areHitboxVisible){
            g.drawRect(rect.x, rect.y, rect.width, rect.height);
        }
    }
    
    
    /**
     * Setter del punto di origine x dello pteranodonte.
     * @param x La x del punto di origine dello pteranodonte.
     */
    public void setX(int x){
        posX = x;
    }
    /**
     * Imposta il punto di origine Y dello pteranodonte.
     * @param y La y del punto di orgine dello pteranodonte.
     */
    public void setY(int y){
        posY = y;
    }
    /**
     * Aggiunge un immagine alla lista delle immagini che compongono i frame dell'animazione dello pteranodonte.
     * @param image L'immagine da aggiungere alla animazione dello pteranodonte.
    */
    public void addImage(BufferedImage image){
        animation.addFrame(image);
    }

    @Override
    public boolean isOutOfScreen() {
        return (posX + animation.getFrame().getWidth() <0);
    }

    @Override
    public boolean isOver() {
        boolean flag=false;
        for(MainCharacter dino:dinos){
            flag = dino.getX() > posX;
        }
        return flag;
        
    }

    @Override
    public boolean isScoreGot() {
        return isScoreGot;
    }

    @Override
    public void setIsScoreGot(boolean isScoreGot) {
        this.isScoreGot=isScoreGot;
    }
    /**
     * Imposta la velocità dello pteranodonte a schermo, nel movimento verso il MainCharacter.
     * @param speed La velocità dello pteranodonte.
     */
    public void setSpeed(float speed){
        this.speedX=speed;
    }
    /**
     * Getter dela velocità dello pteranodonte a schermo , nel movimento verao il MainCharacter.
     * @return La velocità dello pteranodonte.
     */
    public float getSpeed(){
        return speedX;
    }
    
    /**
     * Ritorna lo stato della visibilità delle hitbox.
     * @return lo stato della visibilità delle hitbox.
     */
    public boolean getHitboxState(){
        return areHitboxVisible;
    }

    
    /**
    * Setter delle hitbox visibili nello pteranodonte.
    * @param areHitBoxVisible Il flag che definisce le le hitbox dello pteranodonte sono visibili o meno.
    */
    @Override
    public void setHitBoxState(boolean areHitBoxVisible) {
        this.areHitboxVisible=areHitBoxVisible;
    }

    
}
