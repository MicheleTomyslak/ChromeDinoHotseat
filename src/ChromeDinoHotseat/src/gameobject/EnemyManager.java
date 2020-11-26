package gameobject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import userinterface.GameScreen;
import util.Animation;
import util.Resource;

/**
 *
 * @author tmich
 */
public class EnemyManager {
    /**
     * Rappresenta la lista di nemici nel gioco al momento attuale. 
     */
    private List<Enemy> enemies;
    
    /**
     * Generatore di numeri random per poter scegliere una skin casuale per il cactus, o per far apparire un enemy di tipo Ptera.
     */
    private Random random;
    
    /**
     * Variabili che rappresentano le immagini disponibili dei cactus.
     */
    private BufferedImage imageCactus1,imageCactus2;
    /**
     * Rappresenta l'animazione dello sbattimento di ali nello pteranodonte.
     */
    private Animation pteraFly;
    
    /**
     * Costante che definisce il percorso di default delle immagini dei nemici
     */
    public static String DEFAULT_ENEMIES_IMAGE_PATH = "data/enemies/";
    /**
     * Rappresenta la lista dei MainCharacter attualmente in gioco.
     */
    private List<MainCharacter> mainCharacters;
    /**
     * Rappresenta la loop di gioco che fa funzionare effettivamente la partita.
     */
    private GameScreen gameScreen;
    
    
    /**
     * Costruttore personalizzato di EnemyManager che permette il passaggio dei seguenti parametri
     * 
     * @param mainCharacters Rappresenta la lista degli oggetti di tipo MainCharacter con cui l'enemyManager deve interagire.
     * @param gameScreen  Rappresenta la game loop in cui l'enemy Manager deve agire.
     */
    public EnemyManager(List<MainCharacter> mainCharacters,GameScreen gameScreen){
        
        
        this.gameScreen = gameScreen;
        this.mainCharacters = mainCharacters;
        enemies = new ArrayList<>();
        imageCactus1 = Resource.getResourceImage(DEFAULT_ENEMIES_IMAGE_PATH+"cactus1.png");
        imageCactus2 = Resource.getResourceImage(DEFAULT_ENEMIES_IMAGE_PATH+"cactus2.png");
        pteraFly = new Animation(200);
        pteraFly.addFrame(Resource.getResourceImage(DEFAULT_ENEMIES_IMAGE_PATH+"ptera1.png"));
        pteraFly.addFrame(Resource.getResourceImage(DEFAULT_ENEMIES_IMAGE_PATH+"ptera2.png"));
        random = new Random();
        enemies.add(getRandom());
        
    }
    /**
     * metodo che fa un reset di tutti i nemici.
     */
    public void reset(){
        enemies.clear();
        enemies.add(getRandom());
    }
    /**
     * Metodo che viene chiamato ad ogni ciclo della loop di gioco. Che controlla se gli oggetti enemy contenuti al suo interno siano entrati in contatto con uno o più MainCharacter durante questo ciclo di loop.
     */
    public void update(){
        
        float cactusSpeed = gameScreen.getScreenSpeed();
        for(Enemy e:enemies){
            e.update();
            if(e.isOver() && !e.isScoreGot()){
                gameScreen.plusScore(20);
                
                gameScreen.setScreenSpeed(gameScreen.getScreenSpeed()+0.1f);
                
                //System.out.println("SPEED:"+cactusSpeed);
                e.setIsScoreGot(true);
            }
            for (MainCharacter dino: mainCharacters) {
                if(e.getBound().intersects(dino.getBound())){
                    dino.setAlive(false);
                
                }
                
                
            
            }
            
            
            
        }
        Enemy firstEnemy ;
        if(enemies.size()>0){
            firstEnemy = enemies.get(0);
            if(firstEnemy.isOutOfScreen()){
            enemies.remove(firstEnemy);
            enemies.add(getRandom());
            enemies.get(enemies.size()-1).setSpeed(cactusSpeed);
        }
        }else{
            
        }
        
        
        
        
        
        
    }
    /**
     * Metodo che disegna a schermo tutti gli oggetti Enemy contenuti all'interno di EnemyManager.
     * @param g 
     */
    public void draw(Graphics2D g){
        for(Enemy e:enemies){
           e.draw(g);
        }
    }
    /**
     * Getter di un nemico random da poter aggiungere alla lista di nemici.
     * @return 
     */
    private Enemy getRandom(){
        Cactus cactus;
        Ptera ptera;
        ptera = new Ptera(mainCharacters,gameScreen);
        
        cactus = new Cactus(mainCharacters,gameScreen);
        ptera.setX(1600);
        cactus.setX(1600);
        cactus.setY(265);
        if(random.nextBoolean()){
            cactus.setImage(imageCactus1);
            
        }else{
            if(random.nextBoolean()){
                ptera.setY(195);
                return ptera;
            }else{
                cactus.setY(275);
                cactus.setImage(imageCactus2);
                
            }
            
        }
        
        return cactus;
    }
    /**
     * Ritorna la lista di nemici attualmente nell'oggetto EnemyManager.
     * @return 
     */
    public ArrayList<Enemy> getEnemies(){
        return (ArrayList)enemies;
    }
}
