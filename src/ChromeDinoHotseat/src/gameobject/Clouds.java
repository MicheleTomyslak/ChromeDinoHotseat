package gameobject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import util.Resource;

/**
 *
 * @author tmich
 */
public class Clouds {
    
    private BufferedImage cloudImage;
    
    private List<Cloud> clouds;
    public Clouds(){
        cloudImage = Resource.getResourceImage("data/cloud.png");
        clouds = new ArrayList<>();
        
        Cloud cloud1 = new Cloud();
        cloud1.posX=100;
        cloud1.posY = 50;
        
        clouds.add(cloud1);
        cloud1 = new Cloud();
        cloud1.posX=250;
        cloud1.posY = 230;
        
        clouds.add(cloud1);
        cloud1 = new Cloud();
        cloud1.posX=300;
        cloud1.posY = 80;
        
        clouds.add(cloud1);
        cloud1 = new Cloud();
        cloud1.posX=500;
        cloud1.posY = 140;
        
        clouds.add(cloud1);
        cloud1 = new Cloud();
        cloud1.posX=800;
        cloud1.posY = 40;
        
        clouds.add(cloud1);
    }
    
    public void update(){
        for(Cloud cloud:clouds){
            cloud.posX-=1;
        }
        Cloud firstCloud = clouds.get(0);
        if(firstCloud.posX +cloudImage.getWidth()<0){
            firstCloud.posX = 600;
            clouds.remove(0);
            clouds.add(firstCloud);
            
        }
    }
    
    public void draw(Graphics2D g){
        for(Cloud cloud:clouds){
            g.drawImage(cloudImage, (int)cloud.posX, (int)cloud.posY, null);

        }
        
    }
    
    
    private class Cloud{
        float posX;
        float posY;
    }
}
