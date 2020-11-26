package gameobject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import util.Resource;

/**
 *
 * @author tmich
 */
public class Clouds extends JComponent {
    /**
     * Rappresenta l'immagine della nuvola in un oggetto BufferedImage che è possibile stampare a schermo.
     */
    private BufferedImage cloudImage;
    /**
     * Costante che definisce il percorso di default dell'immagine della nuvola "stock" del gioco.
     */
    public static String DEFAULT_CLOUD_PATH = "data/clouds/cloud.png";
    /**
     * ¨Rappresenta una lista di nuvole, cioè una lista di oggetti Cloud, da poi poter rappresentare a schermo.
     */
    private List<Cloud> clouds;
    
    /**
     * Costruttore vuoto di Clouds che imposta il doubleBuffer, le immagini di default delle nuvole, e la loro posizione e movimento a schermo
     */
    public Clouds(){
        this.setDoubleBuffered(true);
        cloudImage = Resource.getResourceImage(DEFAULT_CLOUD_PATH);
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
        
        cloud1 = new Cloud();
        cloud1.posX=100;
        cloud1.posY = 200;
        
        clouds.add(cloud1);
    }
    /***
     * Metodo che viene richiamato ad ogni ciclo della loop di gioco durante la partita, per poter far muovere le nuvole.
     */
    public void update(){
        for(Cloud cloud:clouds){
            cloud.posX-=1;
        }
        Cloud firstCloud = clouds.get(0);
        if(firstCloud.posX +cloudImage.getWidth()<0){
            firstCloud.posX = 1000;
            clouds.remove(0);
            clouds.add(firstCloud);
            
        }
    }
    /**
     * Metodo che effettivamente disegna le nuvole.
     * @param g Il contesto grafico in cui deve essere disegnato.
     */
    public void draw(Graphics2D g){
        for(Cloud cloud:clouds){
            g.drawImage(cloudImage, (int)cloud.posX, (int)cloud.posY, null);

        }
        
    }
    
    /**
     * Classe privata che rappresenta astrattamente una nuvola singola, con le sue coordinate. da poi poter utilizzare nella classe Clouds per disegnarle a schermo.
     */
    private class Cloud{
        float posX;
        float posY;
    }
}
