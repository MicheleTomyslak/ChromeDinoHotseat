package util;
import gameobject.MainCharacter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import flexjson.*;
import flexjson.JSONSerializer;
import java.awt.Font;
import java.net.URL;


/**
 *
 * @author Michele Tomyslak
 */
public class Resource  {
    
    /**
     * Costante che definisce il percorso di default dei dati di gioco come Scores, risorse come immagini, audio  e configurazione del gioco
     */
    public static final String DEFAULT_PATH = "data/";
    
    /**
     * Costante che definisce il percorso di default dove vengono salvati gli scores, cioè "data/scores.json"
     */
          
    public static final String DEFAULT_SCORES_PATH = DEFAULT_PATH+"scores.json";
    
    
    /**
     * Ritorna una risorsa di tipo Immagine dal percorso path, ritornando un oggetto BufferedImage.
     * @param path Il percorso da cui leggere l'immagine e convertirla in una BufferedImage.
     * @return L'immagine al percorso path in un oggetto BufferedImage.
     */
    public static BufferedImage getResourceImage(String path){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return img;
    }
    /**
     * Metodo che il contenuto di un file in una lista di stringhe
     * @param path Il percorso da cui leggere il file.
     * @return Il contenuto del file in una  lista di stringhe.
     */
    public static List<String> getResourceFileContent(String path){
        List<String> ls = new ArrayList<>();
        
        try {
            ls = Files.readAllLines(Paths.get(path));
        
        } catch (IOException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ls;
    }
    
    
    
    /**
     * Metodo che imposta la configurazione config e lo serializza sul file del percorso del parametro path.
     * @param path Il percorso dove è locato il file di configurazione del gioco
     * @param config La configurazione da impostare.
     */
    public static void setResourceOption(String path,Config config){
        JSONSerializer jsons = new JSONSerializer();
        String s = jsons.include("options","options.playerNumber","options.jumpKey","options.duckKey").serialize(config);
        Resource.writeString(path, s);
        
    }
    /**
     * Metodo che scrive una stringa content in un file path
     * @param path Il percorso dove salvare la stringa.
     * @param content Il contenuto da scrivere nel file.
     */
    public static void writeString(String path,String content){
        char[] chars = content.toCharArray();
        byte[] bytes = new byte[chars.length];
        int indx=0;
        for (byte b:bytes) {
            bytes[indx] = (byte)chars[indx];
            indx++;
        }
        
        try {
            Files.write(Paths.get(path), bytes, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Metodo che ritorna la configurazione del gioco in un oggetto di tipo Config, leggendo il file nel percorso path.
     * @param path Il percorso da dove leggere il file di configurazione.
     * @return La configurazione del gioco.
     */
    public static Config getResourceOptions(String path){
        JSONDeserializer jsond = new JSONDeserializer();
        StringBuilder sb = new StringBuilder();
        for(String s:Resource.getResourceFileContent(path)){
            sb.append(s);
        }
        jsond.use(Config.class, null);
        jsond.use(Option.class,null);

        return (Config)jsond.deserialize(sb.toString());
        
    }
    public static Font getFont(String fileName) throws Exception {
        String path = "data/fonts/originalFont/" + fileName;
        URL url = new URL(path);
        return Font.createFont(Font.TRUETYPE_FONT, new File(url.toURI()));
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
    
    
    public static void writeJsonScore(String path,MainCharacter dino){
        Path p  =Paths.get(path);
        JSONSerializer jsons = new JSONSerializer();
        String s = jsons.serialize(new Score(dino.getName(),dino.getScore(),System.currentTimeMillis()));
        char[] c = s.toCharArray();
        byte[] b = new byte[c.length];
        int counter = 0;
        for (char cc:c) {
            b[counter] = (byte) cc;
            counter++;
        }
        try {
            Files.write(p,b , StandardOpenOption.WRITE);
        } catch (IOException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
    /**
     * Serializza l'oggetto object in una stringa in formato JSON.
     * @param object l'oggetto da serializzare.
     * @return la stringa in formato JSON.
     */
    public static  String serializeJson(Object object){
        JSONSerializer jsons = new JSONSerializer();
        String s =jsons.include("dinos").serialize(object);  
        return s;
    }
    
    /**
     * Deserializza la stringa s in una lista di Score.
     * @param s La string da deserializzare nella lista di score
     * @return La lista degli score deserializzati dalla stringa s.
     */
    public static List<Score> deserializeJSONtoScore(String s){
        JSONDeserializer jsond = new JSONDeserializer();
        ArrayList<Score> o = (ArrayList<Score>) jsond.use("data/scores.json", Score.class).deserialize(s);
        return o;
    }
    
    
    
    
    
    private static final Logger LOG = Logger.getLogger(Resource.class.getName());
    
    public static void main(String[] args) {
        Resource.setResourceOption("data/config/config.json", new Config());
        
        
        
    }
    
    
    
    /**
     * Ritorna un array contenente 2 oggetti Animation, cioè le animazioni per la corsa del dinosauro, e le animazioni per la corsa da accovacciato
     * Controlla se il parametro path è una cartella o meno.
     * Se è una cartella lista tutti i file contenuti in essa,
     * cercando specificamente solo immagini che contengano l'identiifcatore del file di animazione.
     * di default {
     *     1 - immagine animazione corsa normale 1
     *     2 - immagine animazione corsa normale 2
     *     3 - immagine salto 
     *     4 - immagine del  dinosauro quando è morto
     *     5 - immagine animazione corsa abbassata 1
     *     6 - immagine animazione corsa abbassata 2
     * 
     * }
     * 
     * @param path Il percorso in cui cercare le Animation.
     * @return Un array di 2 elementi contenti la characterRun animation e la duckRun animation.
     */
    public static Animation[] getDataFolder(String path){
        Animation[] animationsArray= new Animation[2];
        Path p = Paths.get(path);
        if(Files.isDirectory(p)){
            File f = new File(path);
            Animation characterRun = new Animation(200);
            Animation duckRun = new Animation(200);
            BufferedImage deadImage;
            for(File s :f.listFiles()){
                if(s.getName().contains("1")){
                    characterRun.addFrame(getResourceImage(s.getAbsolutePath()));
                }else if(s.getName().contains("2")){
                    characterRun.addFrame(getResourceImage(s.getAbsolutePath()));
                }else if(s.getName().contains("3")){
                    deadImage =getResourceImage(s.getAbsolutePath());
                }else if(s.getName().contains("4")){
                    deadImage = getResourceImage(s.getAbsolutePath());
                }
                else if(s.getName().contains("5")){
                    duckRun.addFrame(getResourceImage(s.getAbsolutePath()));
                    
                }else if(s.getName().contains("6")){
                    duckRun.addFrame(getResourceImage(s.getAbsolutePath()));
                    
                }else{
                    Logger.getLogger(Resource.class.getName()).log(Level.INFO, s.toString());;
                }
                
            }
            ArrayList<Animation> animations = new ArrayList();
            animations.add(characterRun);
            animations.add(duckRun);
            animations.toArray(animationsArray);
        
        }
        
        return animationsArray;
        
        
    }
    
    /**
     * Ritorna tutte le directory compatibili con le definizioni interne per definire una cartella che contiene le skin del dino
     * La cartella deve contenere i caratteri "dino" per poter essere riconosciuta come cartella compatibile.
     * Questo viene fatto tramite il controllo della parola "dino" (di default) nel nome del file
     * 
     * @param path Il percorso in cui cercare le cartelle per le skin dei dinosauri.
     * @return L'array contenente il nome di tutti le directory compatibili.
     */
    public static  String[] getDinosSkinDirectory(String path){
        File f = new File(path);
        String[] checkedDirs= new String[2];
        List<String> strings = new ArrayList<>();
        
        String[] fileCompatibili = f.list();
        for(String s  :fileCompatibili){
            if(s.contains("dino")){
                strings.add(s);
            }
        }
        
        return strings.toArray(checkedDirs);
        
    }
    
    
    
    /**
     * Ritorna una stringa in formato json dell'oggetto ScoreManager.
     * @param sm Lo score manager da trasformare in JSON.
     * @return la stringa contenente l'oggetto sm serializzato in JSON.
     */
    public static String getJSONFromScoreManager(ScoreManager sm){
        JSONSerializer jsons = new JSONSerializer().include("scores","scores.scoredPoints");
        //String s = jsons.deepSerialize(sm);
        String b = new JSONSerializer().include("scores","scores.nome","scores.punteggio","scores.date").deepSerialize(sm);
        return b;
    }
    
    
    /**
     * Metodo che scrive nel file contenuto nella costante Resource.DEFAULT_SCORES_PATH, la classe ScoreManager che viene passata come parametro.
     * @param sm Lo ScoreManager da serializzare e scrivere sul file.
     */
    public static void writeJSONScoreData(ScoreManager sm){
        String s = Resource.getJSONFromScoreManager(sm);
        try {
            char[] chars = s.toCharArray();
            byte[] bytes = new byte[s.length()];
            int indx=0;
            for(char c : chars){
                bytes[indx] = (byte)c;
                indx++;
            }
            Files.write(Paths.get(Resource.DEFAULT_SCORES_PATH), bytes, StandardOpenOption.WRITE);
        } catch (IOException ex) {
            Logger.getLogger(Resource.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * Metodo che ritorna un oggetto di tipo ScoreManager, a partire da una stringa json che viene deserializzata in un oggetto java utlilizzabile per creare la classifica, e salvare i dati di gicoo.
     * @param s La stringa in formato JSON (di default viene presa da Resource.DEFAULT_SCORES_PATH), da cui viene deserializzata.
     * @return l'oggetto ScoreManager rappresentante i dati contenuti nella stringa s.
     */
    public static ScoreManager getScoreManagerFromJSON(String s){
        JSONDeserializer jsond = new JSONDeserializer();
        List<String> ls = Resource.getResourceFileContent(Resource.DEFAULT_SCORES_PATH);
        StringBuilder sb = new StringBuilder();
        for(String line:ls){
            sb.append(line);
        }
        ScoreManager sm =  (ScoreManager) new JSONDeserializer().use(ScoreManager.class, null).deserialize(sb.toString());
        //Score sbunzi = sm.getScore(0);
        //System.out.println("sbunzi:"+sbunzi);
        return sm;
        //String s =jsond.use(Score.class, null).deserialize(sb.toString());
    }
}
