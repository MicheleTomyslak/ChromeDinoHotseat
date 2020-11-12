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
    /**
     * Lista delle immagini che compongono il terreno.
     */
    private List<ImageLand> listImage;
    /**
     * Generatore di numeri random per decidere casualmente che tile di terreno usare.
     */
    private Random rnd;
    /**
     * Il gameScreen a cui appartiene il corrente oggetto Land
     */
    private GameScreen gameScreen;
    
    
    /**
     * Instanzia un oggetto Land che genererà le immagini da usare come terreno casualmente.
     * @param gameScreen Il contesto di gioco.
     */
    public Land(GameScreen gameScreen){
        this.setDoubleBuffered(true);
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
    /**
     * Metodo che viene richiamato ad ogni aggiornamento della loop di gioco.
     */
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
    /**
     * Getter di un immagine casuale tra quelle disponibili in listImage.
     * @return Un immagine del terreno scelta casualmente.
     */
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
    /**
     * Metodo di painting che si occupa di disegnare ogni tile di terreno al posto corretto.
     * @param g 
     */
    public void draw(Graphics2D g){
        for (ImageLand imageLand : listImage) {
            g.drawImage(imageLand.img,imageLand.posx, (int)gameScreen.getGroundY()-20, null);

        }
        
    }
    /**
     * Classe privata che permette di gestire una immagine del terreno all'interno delle tiles del terrneo.
     */
    private class ImageLand{
        int posx;
        BufferedImage img;
    }
    
    
}
