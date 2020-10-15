package util;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author tmich
 */
public class Resource  {
    public static BufferedImage getResourceImage(String path){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return img;
    }
    
    
    public static List<String> getResourceOptions(String path){
        List<String> content = null;
        try{
            content =Files.readAllLines(Paths.get(path));
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return content;
    }
}
