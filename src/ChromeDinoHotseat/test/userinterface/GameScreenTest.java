/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import gameobject.MainCharacter;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author michele.tomyslak
 */
public class GameScreenTest {
    
    public GameScreenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setState method, of class GameScreen.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        int state = 0;
        GameScreen instance = new GameScreen();
        instance.setState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGameState method, of class GameScreen.
     */
    @Test
    public void testSetGameState() {
        System.out.println("setGameState");
        int state = 0;
        GameScreen instance = new GameScreen();
        instance.setGameState(state);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class GameScreen.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        GameScreen instance = new GameScreen();
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resetGame method, of class GameScreen.
     */
    @Test
    public void testResetGame() {
        System.out.println("resetGame");
        GameScreen instance = new GameScreen();
        instance.resetGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setScreenSpeed method, of class GameScreen.
     */
    @Test
    public void testSetScreenSpeed() {
        System.out.println("setScreenSpeed");
        float speed = 0.0F;
        GameScreen instance = new GameScreen();
        instance.setScreenSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScreenSpeed method, of class GameScreen.
     */
    @Test
    public void testGetScreenSpeed() {
        System.out.println("getScreenSpeed");
        GameScreen instance = new GameScreen();
        float expResult = 0.0F;
        float result = instance.getScreenSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startGame method, of class GameScreen.
     */
    @Test
    public void testStartGame() {
        System.out.println("startGame");
        GameScreen instance = new GameScreen();
        instance.startGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class GameScreen.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        GameScreen instance = new GameScreen();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clearScore method, of class GameScreen.
     */
    @Test
    public void testClearScore() {
        System.out.println("clearScore");
        GameScreen instance = new GameScreen();
        instance.clearScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class GameScreen.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        GameScreen instance = new GameScreen();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showSaveGameOption method, of class GameScreen.
     */
    @Test
    public void testShowSaveGameOption() {
        System.out.println("showSaveGameOption");
        GameScreen instance = new GameScreen();
        instance.showSaveGameOption();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFPS method, of class GameScreen.
     */
    @Test
    public void testGetFPS() {
        System.out.println("getFPS");
        GameScreen instance = new GameScreen();
        int expResult = 0;
        int result = instance.getFPS();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plusScore method, of class GameScreen.
     */
    @Test
    public void testPlusScore() {
        System.out.println("plusScore");
        int score = 0;
        GameScreen instance = new GameScreen();
        instance.plusScore(score);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pause method, of class GameScreen.
     */
    @Test
    public void testPause() {
        System.out.println("pause");
        GameScreen instance = new GameScreen();
        instance.pause();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resume method, of class GameScreen.
     */
    @Test
    public void testResume() {
        System.out.println("resume");
        GameScreen instance = new GameScreen();
        instance.resume();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintComponent method, of class GameScreen.
     */
    @Test
    public void testPaintComponent() {
        System.out.println("paintComponent");
        Graphics g = null;
        GameScreen instance = new GameScreen();
        instance.paintComponent(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawAdditionalInfo method, of class GameScreen.
     */
    @Test
    public void testDrawAdditionalInfo() {
        System.out.println("drawAdditionalInfo");
        Graphics2D g = null;
        GameScreen instance = new GameScreen();
        instance.drawAdditionalInfo(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawHighscores method, of class GameScreen.
     */
    @Test
    public void testDrawHighscores() {
        System.out.println("drawHighscores");
        Graphics2D g = null;
        GameScreen instance = new GameScreen();
        instance.drawHighscores(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyTyped method, of class GameScreen.
     */
    @Test
    public void testKeyTyped() {
        System.out.println("keyTyped");
        KeyEvent e = null;
        GameScreen instance = new GameScreen();
        instance.keyTyped(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStateAsString method, of class GameScreen.
     */
    @Test
    public void testGetStateAsString() {
        System.out.println("getStateAsString");
        int state = 0;
        GameScreen instance = new GameScreen();
        String expResult = "";
        String result = instance.getStateAsString(state);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyPressed method, of class GameScreen.
     */
    @Test
    public void testKeyPressed() {
        System.out.println("keyPressed");
        KeyEvent e = null;
        GameScreen instance = new GameScreen();
        instance.keyPressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of keyReleased method, of class GameScreen.
     */
    @Test
    public void testKeyReleased() {
        System.out.println("keyReleased");
        KeyEvent e = null;
        GameScreen instance = new GameScreen();
        instance.keyReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroundY method, of class GameScreen.
     */
    @Test
    public void testGetGroundY() {
        System.out.println("getGroundY");
        GameScreen instance = new GameScreen();
        int expResult = 0;
        int result = instance.getGroundY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class GameScreen.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        GameScreen instance = new GameScreen();
        int expResult = 0;
        int result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharacter method, of class GameScreen.
     */
    @Test
    public void testGetCharacter() {
        System.out.println("getCharacter");
        int index = 0;
        GameScreen instance = new GameScreen();
        MainCharacter expResult = null;
        MainCharacter result = instance.getCharacter(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharacters method, of class GameScreen.
     */
    @Test
    public void testGetCharacters() {
        System.out.println("getCharacters");
        GameScreen instance = new GameScreen();
        List<MainCharacter> expResult = null;
        List<MainCharacter> result = instance.getCharacters();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseClicked method, of class GameScreen.
     */
    @Test
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent e = null;
        GameScreen instance = new GameScreen();
        instance.mouseClicked(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mousePressed method, of class GameScreen.
     */
    @Test
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent e = null;
        GameScreen instance = new GameScreen();
        instance.mousePressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseReleased method, of class GameScreen.
     */
    @Test
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent e = null;
        GameScreen instance = new GameScreen();
        instance.mouseReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseEntered method, of class GameScreen.
     */
    @Test
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent e = null;
        GameScreen instance = new GameScreen();
        instance.mouseEntered(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseExited method, of class GameScreen.
     */
    @Test
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent e = null;
        GameScreen instance = new GameScreen();
        instance.mouseExited(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformed method, of class GameScreen.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        GameScreen instance = new GameScreen();
        instance.actionPerformed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
