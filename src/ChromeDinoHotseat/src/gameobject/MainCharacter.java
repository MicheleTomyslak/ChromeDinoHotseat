package gameobject;

import java.applet.AudioClip;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JLabel;
import userinterface.GameScreen;
import static userinterface.GameScreen.GRAVITY;


import util.Animation;
import util.KeyManager;
import util.Resource;
import util.Score;

/**
 *
 * @author Michele Tomyslak
 */
public class MainCharacter extends JComponent{

    /**
     * Il nome del dinosauro.
     */
    private String name = "brub";
    
    
    
    /**
     * Identtificativo che significa che il dinosauro sta correndo normalmente-
     */
    public static final int NORMAL_RUN=0;
    /**
     * Identificativo che significa che il dinosauro sta correndo abbassato.
     */
    public static final int DUCK_RUN=1;
    /**
     * Identificativo che significa che il dinosauro sta saltando.
     */
    public static final int JUMPING=2;
    /**
     * Identificativo che significa che il dinosauro è morto.
     */
    public static final int DEAD=3;
    /**
     * la x su cui disegnare il MainCharacter.
     */
    private float x = 0f;
    /**
     * La y su cui disegnare il MainCharacter.
     */
    private float y = 0f;
    
    /**
     * booleano che definisce se le hitbox del dino sono visibili o meno.
     */
    private boolean areHitboxVisible=false;
    /**
     * La velocità di caduta del dinosauro.
     */
    private float speedY = 0f;
    /**
     * Il colore del dinosauro (PROVVISORIO).
     */
    private Color color;
    /**
     * Oggetto che mostra l'animazione della corsa del dinosauro
     */
    private Animation characterRun;
    /**
     * Rettangolo che contiene le hitbox del dinosauro
     */
    private Rectangle rect;
    /**
     * Permette a MainCharacter di effettuare dei suoni quando salta.
     */
    private AudioClip jumpSound;
    /**
     * indica lo stato attuale del MainCharacter.
     */
    private int state;
    /**
     * La velocità verticale del salto del MainCharacter
     */
    public static final float JUMP_SPEED=17;
    /**
     * Animazione rappresentante la corsa abbassata del MainCharacter.
     */
    private Animation duckRun;
    /**
     * Immagine che viene utilizzata quando il dinosauro è in stato JUMPING.
     */
    private BufferedImage jumpImage;
    /**
     * Immagine che viene utilizzata quando il dinosauro è in stato DEAD.
     */
    private BufferedImage deadImage;
    /**
     * Getter che ritorna se il MainCHaracter è vivo o meno.
     */
    private boolean isAlive = true;
    
    private KeyManager keyManager;
    
    private GameScreen gameScreen;
    
    private JLabel dinoLabel;
    
    private boolean isDead;
    
    private AffineTransform at;
    
    private int score;
    
    /**
     * Costruttore del personaggio principale del gioco.
     * @param gameScreen 
     * @param keyManager
     */
    public MainCharacter(GameScreen gameScreen,KeyManager keyManager){
        
        
        this.setDoubleBuffered(true);
        
        isDead=false;
        
        this.keyManager = keyManager;
        this.dinoLabel= new JLabel(this.name);
        this.gameScreen = gameScreen;
        characterRun = new Animation(200);
        characterRun.addFrame(Resource.getResourceImage("data/main-character1.png"));
        characterRun.addFrame(Resource.getResourceImage("data/main-character2.png"));
        jumpImage = Resource.getResourceImage("data/main-character1.png");
        duckRun = new Animation(200);
        duckRun.addFrame(Resource.getResourceImage("data/main-character5.png"));
        duckRun.addFrame(Resource.getResourceImage("data/main-character6.png"));
        deadImage = Resource.getResourceImage("data/main-character4.png");
        rect = new Rectangle();
        at = new AffineTransform();
        this.setLabelVisible(true);
        try {
            //jumpSound = Applet.newAudioClip(new URL("file","","data/jump.wav"));
            jumpSound = Applet.newAudioClip(new URL("file","","data/jump.wav"));
        } catch (MalformedURLException ex) {

        }
    }
    
    /**
     *
     */
    public void update(){
        if(state!=DEAD){


            if(y>=-characterRun.getFrame().getHeight()+gameScreen.getGroundY()){

                speedY=0;
                
                y=-characterRun.getFrame().getHeight()+gameScreen.getGroundY();
            }else{
                speedY+=GRAVITY;
                y+=speedY;
            }
            rect.x=(int)x;
            rect.y = (int)y;
            if(state == NORMAL_RUN){
                characterRun.update();
                rect.width = characterRun.getFrame().getWidth();
                rect.height = characterRun.getFrame().getHeight();
            }else{
                duckRun.update();
                rect.x=(int)x;
                rect.y = (int)y+20;
                rect.width = duckRun.getFrame().getWidth();
                rect.height = duckRun.getFrame().getHeight();

            }
        }else{
            kill();
        }
        
    }
    
    /**
     * Setter dello stato del MainCharacter {RUNNING,JUMPING,DEAD,DUCK_RUN}
     * @param state lo stato del MainCharacter.
     */
    public void setState(int state){
        this.state = state;
    }

    /** 
     * Getter dello stato del MainCharacter.
     * @return lo stato del MainCharacter
     */
    public int getState(){
        return state;
    }
    
    public Rectangle getBound(){
        return rect;
    }
    
    public void draw(Graphics2D g){
        g.setColor(Color.RED);
        
        //g.drawImage(characterRun.getFrame(), new AffineTransform(), this);
        //AffineTransform aTran = new AffineTransform();
        
        double width = this.characterRun.getFrame().getWidth();
        double height = this.characterRun.getFrame().getHeight();
        width= gameScreen.getWidth()/width*4;
        height = gameScreen.getHeight()/height*2;
        //aTran.translate(200.0f, 0.0f);
        //g.transform(aTran);
        
        //int width = (int) (super.getWidth()/16);
        
        //double rapporto = (double) gameScreen.getWidth()/(double)x;
        
        if(gameScreen.getWidth()/width>16){
            
        }else{
            //System.out.println(width);
            //System.out.println(height);
        }
        
        
        
        
        /*
           Codice per repaintare il dino in modo sempre centrato e scalato
        
        
        
        */
         
        at.translate(width, gameScreen.getHeight()/2);
        double ingrandimentox = (double)this.characterRun.getFrame().getWidth()/(double)gameScreen.getWidth();
        double ingrandimentoy = (double)this.characterRun.getFrame().getHeight()/(double)gameScreen.getHeight();
        //System.out.println("ingrandimento x:"+ingrandimentox);
        //System.out.println("ingrandimento y:"+ingrandimentoy);
        
        at.scale(1+ingrandimentox, 1+ingrandimentoy);
        
        
        
        
        
        
        
        
        
        
        switch(state){
            case NORMAL_RUN:
                //g.scale(rapporto, rapporto);
                
                //imageSpaceTran.translate(x, y);
                g.drawImage(characterRun.getFrame(),(int)x,(int)y,null);
                //g.drawImage(characterRun.getFrame(),at, this);
                
                //sg.drawString(""+rapporto, 0, 0);
                if(areHitboxVisible){
                    g.drawRect((int)x,(int)y,characterRun.getFrame().getWidth(),characterRun.getFrame().getHeight());
                }
                break;
            case DUCK_RUN:
                g.drawImage(duckRun.getFrame(),(int)x,(int)y+20,null);
                //
                if(areHitboxVisible){
                    g.drawRect((int)rect.x,(int)rect.y,rect.width,rect.height);
                }
                break;
            case JUMPING:
                //.println(at.getTranslateY());
                g.drawImage(jumpImage ,(int)x, (int)y, null);
                //g.drawImage(jumpImage, at, null);
                if(areHitboxVisible){
                g.drawRect((int)rect.x,(int)rect.y,rect.width,rect.height);
                }
                
                break;
            case DEAD:
                g.drawImage(deadImage, (int)x, (int)y, null);
                if(areHitboxVisible){
                g.drawRect((int)rect.x,(int)rect.y,rect.width,rect.height);
                }
                break;
        }
        
        //this.dinoLabel.setEnabled(true);
        
        //dinoLabel.setSize(100, 60);
        
        if(this.state == DUCK_RUN){
            g.drawString(this.getName(), this.getXM(), this.getYM()+10);
        }else if(this.state == NORMAL_RUN){
            g.drawString(this.getName(), this.getXM(), this.getYM()-10);
        }
        
        
        
        
        
    }
    /**
     * Metodo che permette al dino di saltare.
     */
    public void jump(){
        //state = MainCharacter.JUMPING;
        at.translate(0, speedY);
        jumpSound.play();
        speedY=-JUMP_SPEED;
        y+=speedY;
        
    }
    
    public void kill(){
        this.x-=gameScreen.getScreenSpeed()/2;
        if(!isDead){
            this.score = gameScreen.getScore();
            Date date = new Date(System.currentTimeMillis());
        }
        
        isDead=true;
        
    }
    /**
     * Ritorna lo stato della visibilità delle hitbox del dinosauro.
     * @return lo stato della visibilità dekke hitbox del dinosauro.
     */
    public boolean getHitboxState(){
        return areHitboxVisible;
    }
    
    public void setHitboxState(boolean areHitBoxVisible){
        this.areHitboxVisible=areHitBoxVisible;
    }
    
    public void down(){
        speedY=8;
        y+=speedY;
    }
    public float getXM() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getYM() {
        return y;
    }
    
    public int getY(){
        return super.getX();
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getSpeedY() {
        return speedY;
    }

    public void setSpeedY(float speedY) {
        this.speedY = speedY;
    }
    
    
    
    
    public void setAlive(boolean alive){
        isAlive = alive;
    }
    
    public boolean getAlive(){
        return isAlive;
    }
    public int getHeight(){
        return this.deadImage.getHeight();
    }
    
    public BufferedImage getImage(){
        return characterRun.getFrame();
    }
    
    public void setLabelVisible(boolean choice){
        this.dinoLabel.setVisible(choice);
    }

    public KeyManager getKeyManager() {
        return keyManager;
    }

    public void setKeyManager(KeyManager keyManager) {
        this.keyManager = keyManager;
    }

    public int getScore() {
        return score;
    }

    
    
}
