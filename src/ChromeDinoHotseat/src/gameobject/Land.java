package gameobject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JComponent;
import userinterface.GameScreen;

import util.Resource;

/**
 *
 * @author tmich
 */
public class Land extends JComponent {
    private BufferedImage imageLand1,imageLand2,imageLand3;
    private List<ImageLand> listImage;
    private Random rnd;
    private GameScreen gameScreen;
    
    public Land(GameScreen gameScreen){
        rnd = new Random();
        imageLand1 = Resource.getResourceImage("data/land1.png");
        imageLand2 = Resource.getResourceImage("data/land2.png");
        imageLand3 = Resource.getResourceImage("data/land3.png");
        listImage = new ArrayList<>();
        this.gameScreen = gameScreen;
        int numberOfLandTitle = 1000/imageLand1.getWidth()+2;
        for (int i = 0; i < numberOfLandTitle; i++) {
            ImageLand imageLand = new ImageLand();
            imageLand.posx = (int) i* imageLand1.getWidth();
            imageLand.img = getImageLand();
            listImage.add(imageLand);
            
        }
    }
    
    public void update(){
        for (ImageLand imageLand:listImage) {
            imageLand.posx-=gameScreen.getScreenSpeed();
        }
        ImageLand firstElement = listImage.get(0);
        if(firstElement.posx + imageLand1.getWidth()<0){
            firstElement.posx = listImage.get(listImage.size()-1 ).posx + imageLand1.getWidth();
            listImage.add(firstElement);
            listImage.remove(0);
        }
    }
    
    private BufferedImage getImageLand(){
        int i = rnd.nextInt(9); //random da 0 a 3
        switch(i){
            case 0:
                return imageLand1;
            case 1:
                return imageLand3;
            default:
                return imageLand2;
        }
    }
    
    public void draw(Graphics2D g){
        for (ImageLand imageLand : listImage) {
            g.drawImage(imageLand.img,imageLand.posx, (int)gameScreen.getGroundY()-20, null);

        }
        
    }
    private class ImageLand{
        int posx;
        BufferedImage img;
    }
    
    
}
