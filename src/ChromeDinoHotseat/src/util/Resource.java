package util;

import gameobject.MainCharacter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
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
    
    
    public static final String DEFAULT_PATH = "data/";
    
    
    
    
    
    
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
    
    public static List<Score> getScores(String path){
        List<String> content = null;
        List<Score> scores = new ArrayList<>();
        try{
            
            content =Files.readAllLines(Paths.get(path));
            String[] arrString;
            
            for(String line:content){
                //System.out.println(line);
                arrString= line.split(",");
               try{
                   String name = arrString[0];
                   int score = Integer.parseInt(arrString[1]);
                   long date = Long.parseLong(arrString[2]);
                   scores.add(new Score(name,score,date));
               }catch(NumberFormatException nfe){
                   Logger.getLogger(Resource.class.getName()).log(Level.INFO, nfe.toString());
               }catch(ArrayIndexOutOfBoundsException aioobe){
                   
               }
            }
            
            
            
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return scores;
    }
    
    
    
    public static void writeScore(String path,MainCharacter mainCharacter){
        String content = ""+mainCharacter.getName()+","+mainCharacter.getScore()+","+System.currentTimeMillis()+",\n";
        char[] c = content.toCharArray();
        byte[] b=new byte[c.length];
        int counter = 0;
        for(char cc:c){
            
            b[counter] = (byte)cc;
            counter++;    
        }
        //Files.write(Paths.get(path),b,APPEND);
        //Files.write(Paths.get(path),c,StandardOpenOption.APPEND);
        try {
            
            Files.write(Paths.get(path), b, StandardOpenOption.APPEND);
            
            //Files.writeString(Paths.get(path),content,APPEND);
        } catch (IOException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private static final Logger LOG = Logger.getLogger(Resource.class.getName());
    
    
}
