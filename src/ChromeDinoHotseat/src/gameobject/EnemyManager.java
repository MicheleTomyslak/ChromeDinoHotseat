package gameobject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import userinterface.GameScreen;
import util.Resource;

/**
 *
 * @author tmich
 */
public class EnemyManager {
    private List<Enemy> enemies;
    private Random random;
    private BufferedImage imageCactus1,imageCactus2;
    private MainCharacter mainCharacter;
    private GameScreen gameScreen;
    
    public EnemyManager(MainCharacter mainCharacter,GameScreen gameScreen){
        this.gameScreen = gameScreen;
        this.mainCharacter = mainCharacter;
        enemies = new ArrayList<>();
        imageCactus1 = Resource.getResourceImage("data/cactus1.png");
        imageCactus2 = Resource.getResourceImage("data/cactus2.png");
        random = new Random();
        enemies.add(getRandom());
        
        
    }
    
    public void reset(){
        enemies.clear();
        enemies.add(getRandom());
    }
    
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
            
            if(e.getBound().intersects(mainCharacter.getBound())){
                mainCharacter.setAlive(false);
                
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
    
    public void draw(Graphics2D g){
        for(Enemy e:enemies){
           e.draw(g);
        }
    }
    
    private Cactus getRandom(){
        Cactus cactus;
        cactus = new Cactus(mainCharacter,gameScreen);
        cactus.setX(600);
        cactus.setY(265);
        if(random.nextBoolean()){
            cactus.setImage(imageCactus1);
            
        }else{
            cactus.setImage(imageCactus2);
            cactus.setY(275);
        }
        
        return cactus;
    }
    
    public ArrayList<Enemy> getEnemies(){
        return (ArrayList)enemies;
    }
}
