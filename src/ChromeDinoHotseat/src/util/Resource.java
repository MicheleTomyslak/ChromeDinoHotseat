package util;
import java.util.Arrays;
import gameobject.MainCharacter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import org.json.*;



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
    
    public static void getOrdered(){
        
    }
    
    public static  void testLibJson(String path){
        JSONObject jo = new JSONObject();
        try {
            
            ArrayList<String> l = (ArrayList)Files.readAllLines(Paths.get("data/scores.json"));
            StringBuilder sb = new StringBuilder();
            for(String c:l){
                sb.append(c);
            }
            JSONArray jarray = new JSONArray();
            
            Object o = JSONObject.stringToValue(sb.toString());
            String content = o.toString();
            char[] c = content.toCharArray();
            byte[] b=new byte[c.length];
            int counter = 0;
            for(char cc:c){
            
                b[counter] = (byte)cc;
                counter++;    
            }
            Files.write(Paths.get(path), b, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(jo.toString());
    }
    
    
    private static final Logger LOG = Logger.getLogger(Resource.class.getName());
    
    public static void main(String[] args) {
        testLibJson("data/scores.json");
    }
}
