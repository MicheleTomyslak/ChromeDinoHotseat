package userinterface;

import java.applet.AudioClip;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JPanel;
import gameobject.Clouds;
import gameobject.Enemy;
import gameobject.EnemyManager;
import gameobject.Land;
import gameobject.MainCharacter;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import util.KeyManager;
import util.Resource;
import static util.Resource.DEFAULT_PATH;
import util.Score;
import util.ScoreManager;

/**
 *
 * @author tmich
 */
public class GameScreen extends JPanel implements Runnable,KeyListener
{    
    
    /**
     * Costante che definisce lo stato in cui lo scenario è in pausa,
     * e si attende la pressione del tasto di pausa nuovamente per ripartire
     */
    public static final int GAME_PAUSE_STATE = 3;
    /**
     * Costante che definisce lo stato in cui lo scenario è fermo , e ci si aspetta un enter dall'utente.
     */
    public static final int GAME_FIRST_STATE = 0;
    /**
     * Costante che definisce lo stato in cui lo scenario si muove, e il dinosauro può saltare.
     */
    public static final int GAME_PLAY_STATE=1;

    /**
     * Costante che definisce lo stato in cui lo scenario si ferma e si interrompe il gioco.
     */
    public static final int GAME_OVER_STATE =2;
    
    /**
     * Costante che definisce la gravità nel gioco.
     */
    
    public static final float GRAVITY = 1f;
    //public static final float GROUNDY = 310;
    private int i =0;
    
    public static final String DEFAULT_PATH = "data/scores.csv";
    
    
    //private MainCharacter dino2;
    /**
     * Rappresenta la lista dei dinosauri che ci sono in gioco.
     */
    private List<MainCharacter> mainCharacters;
    /**
     * Rappresenta la lista dei gestori di nemici che ci sono in gioco.
     */
    private List<EnemyManager> enemyManagers;
    
    
    /**
     * Rappresenta il terreno di gioco (cactus , e dove si tocca terra).
     * */
    private Land land;
    /**
     * Rappresenta le nuvole, che si muovono verso sinistra secondo un parallasse diverso.
     * */
    private Clouds clouds;
    
    /**
     * Rappresenta il gestore dei nemici (Cactus e Ptera) e ne gestisce le collisioni e il movimento.
     * */
    private EnemyManager enemyManager;
    private EnemyManager enemyManager2;
    
    /**
     * Rappresenta il punteggio corrente della partita.
     * */
    private int score;
    
    /**
     * Il gestore dei punteggi del gioco , e si occupa anche del salvataggio e della lettura dei punteggi.
     */
    private ScoreManager scoreManager;
    /**
     * Lo stato attuale del gioco. DEFAULT => GAME_FIRST_STATE.
     * */
    private int gameState = GAME_FIRST_STATE;
    
    /**
     * Rappresenta l'immagine di GameOver per quanto colpisci un ostacolo.
     * */
    private BufferedImage imageGameOverText;
    /**
     * Clip audio che viene fatta partire quando si ottiene un certo punteggio.
     * */
    private AudioClip scoreSound;
    //private OverScreen overScreen;
    
    /**
     * Rappresenta la velocità del gioco, che aumenta ad ogni ostacolo superato, finché non si muore, poi si resetta.
     * */
    private float screenSpeed=4.0f;
    private JTextField textField;
    
    /**
     * Un flag per sapere se il gioco è in stato di game over.
     * */
    private boolean isGameOver=false;
    /**
     * Thread che gestisce il loop di gioco.
     * */
    private Thread thread;
    
    /**
     * Rappresenta il flag che mostra o non mostra le informazioni aggiuntive sul gioco in tempo reale. (Premendo il tasto L)
     *
     * */
    private boolean additionalInfo=false;
    
    /**
     * Valore calcolato che rappresenta i frame per secondo nel gioco.
     * */
    
    private long fps;
    //private JButton jButton;
    private int currentFPS;
    private int distanceBeetweenCharacters = 50;
    
    private int counter =0;
    
    
    private int lastGameState =0;
    
    private HighScoresPanel hspanel;
    
    private Thread hsPanelThread;
    
    
    /**
     * Setter dello stato del gioco (FIRST_GAME_STAGE,GAME_PLAY_STATE,GAME_OVER_STATE) rappresentati da un indice numerico
     * @param state Lo stato che si vuole assegnare.
     * */
    public void setState(int state){
        this.gameState = state;
    }
    
    /**
     * Costruttore vuoto di gameScreen , che istanzia una nuova rappresentazione della schermata di gioco di chrome dino.
     */
    public GameScreen(){
        this.hspanel = new HighScoresPanel();
        //hsPanelThread = new Thread(hspanel);
        //hsPanelThread.start();
        this.add(hspanel);
        this.setDoubleBuffered(true);
        
        //this.setSize(500,500);
        
        
        ScoreManager sm = new ScoreManager(DEFAULT_PATH);
        //Logger.getLogger(GameScreen.class.getName()).log(Level.INFO, sm.toString());
        
        //Logger.getLogger(GameScreen.class.getName()).log(Level.INFO, sm.getScore(0).getName());
        //Logger.getLogger(GameScreen.class.getName()).log(Level.INFO, ""+sm.getScore(0).getScoredPoints());
        
        //creo la thread che gestira la loop di gioco.
        thread = new Thread(this);
        
        //creo una nuova lista di MainCharacters(i dinosauri).
        mainCharacters = new ArrayList<MainCharacter>();
        //aggiungo un dinosauro con parametro il gameScreen e il KeyManager(che sarebbe il gestore dei tasti).
        mainCharacters.add(new MainCharacter(this,new KeyManager()));
        counter = 0;
        for (MainCharacter dino:mainCharacters) {
            dino.setName("Giocatore "+mainCharacters.size());
            dino.setX(50+(50*counter));
            dino.setY(265);
            counter+=distanceBeetweenCharacters;
        }
        counter=0;
        
        
        
        
        land = new Land(this);
        clouds = new Clouds();
        
        this.addKeyListener(this);
        
        
        enemyManagers = new ArrayList<>();
        enemyManagers.add(new EnemyManager(mainCharacters,this));
        enemyManager = new EnemyManager(mainCharacters,this);
        
        
        imageGameOverText = Resource.getResourceImage("data/gameover_text.png");
        
        
        
        try {
            scoreSound = Applet.newAudioClip(new URL("file","","data/scoreup.wav"));
        } catch (MalformedURLException ex) {

        }
        
        
    
    }
    
    /**
     *
     * @param state
     */
    public void setGameState(int state){
        
        gameState = state;
    }
    
    /**
     * Getter del punteggio attuale.
     * @return il punteggio attuale
     */
    public int getScore(){
        return score;
    }
    
    public void resetGame(){
        counter = 0;
        
        mainCharacters = new ArrayList<>();
        
        mainCharacters.add(new MainCharacter(this,new KeyManager(KeyEvent.VK_1,KeyEvent.VK_Q)));
        mainCharacters.add(new MainCharacter(this,new KeyManager(KeyEvent.VK_2,KeyEvent.VK_W)));
        
        mainCharacters.add(new MainCharacter(this,new KeyManager(KeyEvent.VK_3,KeyEvent.VK_E)));
        mainCharacters.add(new MainCharacter(this,new KeyManager(KeyEvent.VK_4,KeyEvent.VK_R)));
        
        for(MainCharacter dino: mainCharacters){
            counter+=1;
            dino.setName("Giocatore "+(counter));
            dino.setAlive(true);
            dino.setX((50*counter));
            dino.setY(265);
            //System.out.println(counter);
            
        }
        enemyManager = new EnemyManager(mainCharacters,this);
        
        //gameState = GAME_PLAY_STATE;
    }
    
    public void setScreenSpeed(float speed){
        this.screenSpeed = speed;
    }
    
    public float getScreenSpeed(){
        return screenSpeed;
    }
    
    public void startGame(){
        thread.start();
    }

    
    @Override
    public void run() {
        int currentFPS;
        while(!this.thread.isInterrupted()){
            //System.out.println(i++);
            try {
                update();
                lastGameState = this.gameState;
                repaint();
                // conta dei frame in un secondo.
                //fps++;
                if(System.currentTimeMillis()%1000<=10){
                    currentFPS = getFPS();
                    System.out.println(currentFPS);
                    fps=0;
                    
                }
                Thread.sleep(12);
            } catch (InterruptedException ex) {
                ex.getStackTrace();
            }
        }
        
        
    }
    
    public void clearScore(){
        for(MainCharacter dino:mainCharacters){
            Resource.writeScore("data/Scores.csv",dino );
        }
        score = 0;
        this.screenSpeed=4.0f;
    }
    
    
    
    public void update(){
        long startTime = System.nanoTime();
        //this.setVisible(true);
        
        
        switch(gameState){
            
            
            case GAME_FIRST_STATE:
                
                hspanel.setVisible(true);
                
            
            
            
            
            
                break;
            case GAME_PLAY_STATE:
                hspanel.setVisible(false);
                land.update();
                clouds.update();
                counter=0;
                for(MainCharacter dino:mainCharacters){
                    dino.update();
                    if(!dino.getAlive()){
                        
                        dino.kill();
                        counter++;
                        //gameState = GAME_OVER_STATE;
                        dino.setState(MainCharacter.DEAD);
                        //clearScore();
                    
                    }
                }
                
                
                if(counter==mainCharacters.size()){
                    gameState = GAME_OVER_STATE;
                    clearScore();
                }
                
                
                //dino2.update();
                enemyManager.update();
                
                
                plusScore(1);
                
                break;
            case GAME_OVER_STATE:
                    
                
                
                isGameOver = true;                
                break;
            }
                
                
           long l = (System.nanoTime()-startTime)/1000;
           fps = l;
            
        }
        

                
                
    public void showSaveGameOption(){
        
    }
    public int getFPS(){
        this.fps +=1;
        
        
        
        
        return (int)fps;
        
    }
    
    
    public void plusScore(int score){
        this.score += score;
        if(getScore()%100==0){
            scoreSound.play();
        }
        
    }
    
    /**
     * Mette la partita in pausa.
     */
    public void pause(){
        this.gameState = GameScreen.GAME_PAUSE_STATE;
    }
    
    /**
     * Riprende la partita dopo una evento di pausa.
     */
    public void resume(){
        this.gameState = GAME_PLAY_STATE;
    }
    
    
    
    @Override
    public void paintComponent(Graphics g){
        long currentMillis= System.nanoTime();
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.decode("#f7f7f7"));
        g.fillRect(0, 0, getWidth(), getHeight());
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);
        /**Codice per disegnare la linea del terreno (prima delle immagini del deserto)
        //g.setColor(Color.RED);
        //g.drawLine(0,(int)GROUNDY,getWidth(),(int)GROUNDY);
         */
        
        
        
        
        
        switch(gameState){
            case GAME_FIRST_STATE:
                for(MainCharacter dino :mainCharacters){
                    //land.draw(g2d);
                    dino.draw(g2d);
                    
                }
                hspanel.repaint();
                
                
               
                
                break;
            case GAME_PLAY_STATE:
                
                clouds.draw(g2d);
                land.draw(g2d);
                for(MainCharacter dino :mainCharacters){
                    dino.draw(g2d);
                }
                
                enemyManager.draw(g2d);
                //enemyManager2.draw(g2d);
                g.setColor(Color.BLACK);
                g.drawString("Score:"+String.valueOf(score), 300, 40);
                break;
            case GAME_OVER_STATE:
                clouds.draw(g2d);
                land.draw(g2d);
                
                for(MainCharacter dino :mainCharacters){
                    dino.draw(g2d);
                }
                
                enemyManager.draw(g2d);  
                //enemyManager2.draw(g2d);
                g.drawImage(imageGameOverText,100,50,null);
                break;
            case GAME_PAUSE_STATE:
                clouds.draw(g2d);
                land.draw(g2d);
                
                for (MainCharacter dino:mainCharacters) {
                    dino.draw(g2d);
                }
                enemyManager.draw(g2d);
                g.drawString("PAUSA", 100, 100);
                break;
                
        }
        for(Enemy x:this.enemyManager.getEnemies()){
                x.setHitBoxState(additionalInfo);
                
        }
        
        
        
        if(additionalInfo){
            
            drawAdditionalInfo(g2d);
            /*
            g.drawString("nome:"+mainCharacters.get(0).getName(), 30, 50);
            
            mainCharacters.get(0).setHitboxState(true);
            g.drawString("is alive:"+mainCharacters.get(0).getAlive(), 30, 75);
            g.drawString(""+mainCharacters.get(0).getBound(), 30, 100);
            g.drawString("Game speed:"+this.screenSpeed,30,150);
            g.drawString("Game State:"+this.getStateAsString(this.gameState),30,175);
            g.drawString(mainCharacters.get(0).getName()+" State:"+mainCharacters.get(0).getState(),30,200);
            g.drawString("Duck Key:"+mainCharacters.get(0).getKeyManager().getDuckKey() , 130, 50);
            g.drawString("Jump Key:"+mainCharacters.get(0).getKeyManager().getJumpKey() , 130, 75);
            g.drawString("FPS:"+this.getFPS(), 30, 125);
            g.drawString(new Date(System.currentTimeMillis()).toString(), 130, 125);
            g.drawString("double Buffered:"+mainCharacters.get(0).isDoubleBuffered(), 230, 175);
            g.drawString("", i, i);*/
        
        
       
        }else{
            for (MainCharacter dino:mainCharacters) {
                dino.setHitboxState(false);
            }
            
            
        }
        /*
        
       */
        
    }
    
    public void drawAdditionalInfo(Graphics2D g){
        g.drawString("nome:"+mainCharacters.get(0).getName(), 30, 50);
            
            mainCharacters.get(0).setHitboxState(true);
            g.drawString("is alive:"+mainCharacters.get(0).getAlive(), 30, 75);
            g.drawString(""+mainCharacters.get(0).getBound(), 30, 100);
            g.drawString("Game speed:"+this.screenSpeed,30,150);
            g.drawString("Game State:"+this.getStateAsString(this.gameState),30,175);
            g.drawString(mainCharacters.get(0).getName()+" State:"+mainCharacters.get(0).getState(),30,200);
            g.drawString("Duck Key:"+mainCharacters.get(0).getKeyManager().getDuckKey() , 130, 50);
            g.drawString("Jump Key:"+mainCharacters.get(0).getKeyManager().getJumpKey() , 130, 75);
            g.drawString("FPS:"+this.getFPS(), 30, 125);
            g.drawString(new Date(System.currentTimeMillis()).toString(), 130, 125);
            g.drawString("double Buffered:"+mainCharacters.get(0).isDoubleBuffered(), 230, 175);
            g.drawString("", i, i);
    }
    
    

    @Override
    public void keyTyped(KeyEvent e) {
        super.repaint();
    }
    
    
    
    public String getStateAsString(int state){
        if(GameScreen.GAME_FIRST_STATE==state){
            return "Game First State";
        }else if(GameScreen.GAME_PLAY_STATE==state){
            return "Game Play State";
        }else if(GameScreen.GAME_OVER_STATE == state){
            return "Game Over State";
        }else{
            return "Stato non valido";
        }
        
    }

    
    @Override
    public void keyPressed(KeyEvent e) {
        String state = this.getStateAsString(gameState);
        
        //System.out.println(state);
        for (MainCharacter dino:mainCharacters) {
            
            
            
            if(e.getKeyCode() == dino.getKeyManager().getDuckKey() && gameState == GAME_PLAY_STATE){
            dino.setState(MainCharacter.DUCK_RUN);
            dino.down();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER && gameState ==GAME_OVER_STATE){
            
            this.setVisible(true);
            this.startGame();
        }
        
        
        
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_L){
            additionalInfo=!additionalInfo;
        }else if(e.getKeyCode()== KeyEvent.VK_P){
            if(gameState == GAME_PAUSE_STATE){
                resume();
            }else{
                pause();
            }
        }
                    //resetGame();
                    
                    
                    
                    
        for (MainCharacter dino:mainCharacters) {
            
            if(e.getKeyCode() == dino.getKeyManager().getJumpKey()){
                if(gameState == GAME_FIRST_STATE){
                        gameState = GAME_PLAY_STATE;
                    }else if(gameState == GAME_PLAY_STATE){
                        if(dino.getYM()+dino.getHeight()>=getGroundY()){
                            dino.jump();
                            //System.out.println(dino.getYM()+dino.getHeight());

                        }
                        //System.out.println(dino.getYM()+dino.getHeight());
                        //System.out.println(getGroundY());

                    }
            }else if(dino.getKeyManager().getDuckKey()== e.getKeyCode()){
                dino.setState(MainCharacter.NORMAL_RUN);
            }
            
            
            switch(e.getKeyCode()){
                
                case KeyEvent.VK_SPACE:
                        //overScreen = new OverScreen(this);
                        if(gameState==GameScreen.GAME_OVER_STATE){
                            
                        
                            super.repaint();

                            dino.setState(dino.NORMAL_RUN);
                            gameState = GAME_FIRST_STATE;
                            resetGame();
                        }
                        break;
                
                

                
            }
        }
    }
    /**
     * Ritorna il punto dove è situato il terreno (per fare la finestra resizabile mi serve)
     * @return Il valore di y dove si trova il terreno.
     */
    public int getGroundY(){
        return this.getHeight()/2;
    }
    
    public int getState(){
        return this.gameState;
    }
    
    
    
    
}
