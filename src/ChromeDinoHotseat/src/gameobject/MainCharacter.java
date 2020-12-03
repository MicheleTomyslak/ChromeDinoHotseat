package gameobject;

import java.applet.AudioClip;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import userinterface.GameScreen;
import static userinterface.GameScreen.GRAVITY;


import util.Animation;
import util.KeyManager;
import util.Resource;
import util.Score;
import javax.swing.*;
import static util.Resource.getDataFolder;

/**
 *
 * @author Michele Tomyslak
 */
public class MainCharacter extends JComponent implements MouseListener{

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
    
    /**
     * Rappresenta il gestore dei tasti utilizzati dal dinosauro.
     */
    private KeyManager keyManager;
    /**
     * L'oggetto GameScreen in cui è contenuto il MainCharacter.
     */
    private GameScreen gameScreen;
    
    private JLabel dinoLabel;
    
    private JTextField textFieldNome;
    /**
     * flag che determina se l'oggetto MainCharacter è vivo o morto.
     * true = morto
     * false = ancora vivo
     */
    private boolean isDead;
    
    private AffineTransform at;
    
    private int score;
    /**
     * Rettangolo che rappresenta un bottone per scegliere la skin precedente .
     */
    private Rectangle leftButton;

    /**
     * Rettangolo che rappresenta un bottone per scegliere la skin successiva.
     */
    private Rectangle rightButton;
    /**
     * l'effettiva posizione in cu ivengono presi i dati per le skin per l'animazione del dino.
     */
    private String skin_dir = "/data/default_dino";
    /**
     * Costante che rappresenta la cartella di default in cui sono contenute le skin per l'animazione del dino.
     */
    public static String DEFAULT_SKIN_DIR = "/data/default_dino";
    /**
     * Variabile che rappresenta il selettore della skin del giocatore.
     */
    private int skin_selector_counter=0;
    
    private int lastState;
    
    /**
     * Costruttore del personaggio principale del gioco.
     * @param gameScreen L'oggetto GameScreen in cui è contenuto questo MainCharacter.
     * @param keyManager Il gestore dei comandi per questo MainCharacter.
     */
    public MainCharacter(GameScreen gameScreen,KeyManager keyManager){
        //this.addMouseListener(this);
        
        
        this.setDoubleBuffered(true);
        
        isDead=false;
        textFieldNome = new JTextField();
        
        
        
        //this.add(textFieldNome);
        this.keyManager = keyManager;
        this.dinoLabel= new JLabel(this.name);
        this.gameScreen = gameScreen;
        characterRun = new Animation(200);
        characterRun.addFrame(Resource.getResourceImage("data/default_dino/main-character1.png"));
        characterRun.addFrame(Resource.getResourceImage("data/default_dino/main-character2.png"));
        jumpImage = Resource.getResourceImage("data/default_dino/main-character1.png");
        duckRun = new Animation(200);
        duckRun.addFrame(Resource.getResourceImage("data/default_dino/main-character5.png"));
        duckRun.addFrame(Resource.getResourceImage("data/default_dino/main-character6.png"));
        deadImage = Resource.getResourceImage("data/default_dino/main-character4.png");
        rect = new Rectangle();
        at = new AffineTransform();
        this.setLabelVisible(true);
        
        
//Logger.getLogger(MainCharacter.class.getName()).log(Level.INFO, ""+getComponents()[getComponents().length-1]);
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
        
        boolean startingGameFlag;
        if(this.gameScreen.getState()== GameScreen.GAME_PLAY_STATE && this.lastState == GameScreen.GAME_FIRST_STATE ){
            startingGameFlag = true;
            
        
        }else{
            startingGameFlag = false;
        }
        
        if(startingGameFlag){
            this.x -= 2;
        }
        
        
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
        this.lastState = this.gameScreen.getState();
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
    /**
     * Getter delle hitbox del MainCharacter, rappresentate da un oggetto Rectangle.
     * @return il rettangolo che definisce le hitbox del MainCharacter.
     */
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
            
        }
        
        switch(state){
            case NORMAL_RUN:
                g.drawImage(characterRun.getFrame(),(int)x,(int)y,null);
                
                
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
        
        leftButton = new Rectangle((int)this.x-25,(int)this.y+7,15,15);
        rightButton = new Rectangle((int)this.x+characterRun.getFrame().getWidth()+5,(int)this.y+7,15,15);
        
        if(gameScreen.getState() == GameScreen.GAME_FIRST_STATE){
           g.draw(leftButton);
           g.draw(rightButton);
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
    
    public void setJTextFieldVisible(boolean choice){
        this.textFieldNome.setVisible(choice);
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

    @Override
    public void mouseClicked(MouseEvent e) {
        
        if(leftButton.contains(e.getPoint())){
            
            previousSkin();
        }else if(rightButton.contains(e.getPoint())){
            nextSkin();
        }else{
            System.out.println(e.getPoint());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }
    
    /**
     * Imposta la prossima skin tra quelle disponibili nella cartella data e che soddisfano i requisiti per essere delle skin.
     * Utilizza il selettor skin_selector_counter, che sarebbe un semplice contatore che è settato di default a 0.
     * Usando questo metodo skin_selector_counter diventa 1, e ti ritorna la skin nell array alla posizione 1.
     * @version 19.11.2020 15:14
     * 
     * 
     */
    public void nextSkin(){
        
        String[] s = Resource.getDinosSkinDirectory("data/");
        
        for(String str:s){
            Logger.getLogger(MainCharacter.class.getName()).log(Level.INFO, str);
        }
        if(skin_selector_counter==s.length){
            skin_selector_counter=0;
        }
        
        String currentDirSkin = s[skin_selector_counter];
        Animation[] nextAnimationSkin = getDataFolder("data/"+currentDirSkin);
        if(nextAnimationSkin.length>=2){
            
            
            
            this.characterRun = nextAnimationSkin[0];
            this.duckRun = nextAnimationSkin[1];
            
            
        }else{
            Logger.getLogger(MainCharacter.class.getName()).log(Level.INFO, ""+characterRun.getFrame().getWidth());
        }
        this.skin_selector_counter++;
        
        
    }
    
    /**
     * Imposta la  skin precedente tra quelle disponibili nella cartella data e che soddisfano i requisiti per essere delle skin.
     * Utilizza il selettor skin_selector_counter, che sarebbe un semplice contatore che è settato di default a 0.
     * Usando questo metodo skin_selector_counter diventa -1,che viene trasformato nell'ultimo elemento dell'array.
     */
    public void previousSkin(){
        
        String[] s = Resource.getDinosSkinDirectory("data/");
        
        
        if(skin_selector_counter==0){
            skin_selector_counter=s.length-1;
        }
        
        
        String currentDirSkin = s[skin_selector_counter];
        Animation[] previous = getDataFolder("data/"+currentDirSkin);
        if(previous.length>=2){
            
            this.characterRun = previous[0];
            this.duckRun = previous[1];
            
            
        }else{
            Logger.getLogger(MainCharacter.class.getName()).log(Level.INFO, ""+characterRun.getFrame().getWidth());
        }
        this.skin_selector_counter--;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println(e.getPoint());
        
    }
    
    

    @Override
    public void mouseExited(MouseEvent e) {
    }
    public Rectangle getLeftButton() {
        return leftButton;
    }

    public Rectangle getRightButton() {
        return rightButton;
    }
    
    

    
    
}
