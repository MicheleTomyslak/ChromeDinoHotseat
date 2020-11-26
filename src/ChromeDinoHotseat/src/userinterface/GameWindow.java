package userinterface;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.TextField;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author tmich
 * GameWindow rappresenta il JFrame dove è contenuto il gioco
 * Al suo interno contiene un oggetto GameScreen (che sarebbe il gioco in se).
 * che a sua volta contiene altri oggetti di gioco.
 */
public class GameWindow extends JFrame implements Runnable{
    
    /**
     * Il pannello di gioco.
     */
    private GameScreen gameScreen;
    /**
     * Campo di testo di default.
     */
    private JTextField textField;
    
    
    private Thread pgNamesThread ;
    public GameWindow(){
        
        super("T Rex game");
        
        
        /*pgNamesThread = new Thread(this);
        namePanel = new NamePanel();
        this.setLayout(new BorderLayout());
        this.add(namePanel);
        Thread t = new Thread(namePanel);
        t.start();*/
        this.pack();
        setSize(1300,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //textField = new JTextField("ciao"); 
        //textField.setLayout(new BorderLayout());
        //add(textField);
        
        
        
        
        gameScreen = new GameScreen();
        
        add(gameScreen);
        
        addKeyListener(gameScreen);
        
        
    }
    
    
    
    
    
    
    
    
    public void startGame(){
        gameScreen.startGame(); 
        //remove(overScreen);
    }
    
    public static void main(String[] args) {
        GameWindow gw = new GameWindow();
        gw.setVisible(true);
        gw.startGame();
        
        
        
        
    }
    
    
    
    
    
    public void startChoiceMenu(){
        //overScreen.setVisible(true);
        //overScreen.setSize(400,300);
    }

    @Override
    public void run() {
        while(this.textField.isVisible()){
            
        }
    }

    

    
    
    
    
}
