package userinterface;
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
 */
public class GameWindow extends JFrame {
    private GameScreen gameScreen;
    
    private JTextField textField;
    public GameWindow(){
        
        super("T Rex game");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //textField = new JTextField();
        //textField.setSize(100,50);
        
        //add(textField);
        
        gameScreen = new GameScreen();
        //verScreen = new OverScreen(gameScreen);
    //overScreen = new OverScreen(this.gameScreen);
        //overScreen.setVisible(true);
        
        //add(overScreen);
        add(gameScreen);
        //add(gameScreen);
        //add(overScreen);
        addKeyListener(gameScreen);
        //addKeyListener(overScreen);
        
    }
    
    public void getContent(){
        boolean flag=false;
        while(!flag){
            
        }
    }
    
    public void overToPlay(){
        //gameScreen = new GameScreen();
        //gameScreen.setVisible(true);
    }
    
    
    public void startGame(){
        gameScreen.startGame(); 
        //remove(overScreen);
    }
    
    public static void main(String[] args) {
        GameWindow gw = new GameWindow();
        
        
        gw.setVisible(true);
        
        //StartScreen startScreen = new StartScreen();
        //startScreen.repaint();
        gw.startGame();
        
        
        
    }
    
    
    
    
    
    public void startChoiceMenu(){
        //overScreen.setVisible(true);
        //overScreen.setSize(400,300);
    }

    
    
    
    
}
