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
    
    
    private BufferedImage image;
    private int posX;
    private int posY;
    private Rectangle rect;
    private List<MainCharacter> dinos;
    private boolean isScoreGot = false;
    private float speedX = 4f;
    private GameScreen gameScreen;
    private boolean areHitboxVisible;
    
    public Cactus(List<MainCharacter> dinos,GameScreen gameScreen){
        this.gameScreen = gameScreen;
        this.dinos = dinos;
        image = Resource.getResourceImage("data/cactus1.png");
        posX = 200;
        posY = 265;
        rect = new Rectangle();
    }
    
    @Override
    public void update(){
        posY = gameScreen.getGroundY();
        posX-=speedX;
        rect.x = posX;
        rect.y = posY-rect.height;
        rect.width = image.getWidth();
        rect.height = image.getHeight();
    }
    
    @Override
    public Rectangle getBound(){
        return rect;
    }
    @Override
    public void draw(Graphics2D g){
        g.drawImage(image, posX, gameScreen.getGroundY()-rect.height, null);
        if(areHitboxVisible){
            g.drawRect(rect.x, rect.y, rect.width, rect.height);
        }
    }
    
    public void setX(int x){
        posX = x;
    }
    
    public void setY(int y){
        posY = y;
    }
    
    public void setImage(BufferedImage image){
        this.image = image;
    }

    @Override
    public boolean isOutOfScreen() {
        return (posX + image.getWidth() <0);
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
    
    public void setSpeed(float speed){
        this.speedX=speed;
    }
    
    public float getSpeed(){
        return speedX;
    }
    
    /**
     * Ritorna lo stato della visibilità delle hitbox del dinosauro.
     * @return lo stato della visibilità dekke hitbox del dinosauro.
     */
    public boolean getHitboxState(){
        return areHitboxVisible;
    }

    

    @Override
    public void setHitBoxState(boolean areHitBoxVisible) {
        this.areHitboxVisible=areHitBoxVisible;
    }

    
}
