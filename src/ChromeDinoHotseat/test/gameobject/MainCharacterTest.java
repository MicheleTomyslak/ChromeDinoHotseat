/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import userinterface.GameScreen;
import util.KeyManager;

/**
 *
 * @author michele.tomyslak
 */
public class MainCharacterTest {
    
    public MainCharacterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());
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
     * Test of update method, of class MainCharacter.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        MainCharacter instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setState method, of class MainCharacter.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        int state = 0;
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());
        instance.setState(state);
        
        
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getState method, of class MainCharacter.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());
        int expResult = 0;
        int result = instance.getState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBound method, of class MainCharacter.
     */
    @Test
    public void testGetBound() {
        System.out.println("getBound");
        MainCharacter instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.getBound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class MainCharacter.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g = null;
        MainCharacter instance = null;
        instance.draw(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jump method, of class MainCharacter.
     */
    @Test
    public void testJump() {
        System.out.println("jump");
        MainCharacter instance = null;
        instance.jump();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of kill method, of class MainCharacter.
     */
    @Test
    public void testKill() {
        System.out.println("kill");
        MainCharacter instance = null;
        instance.kill();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHitboxState method, of class MainCharacter.
     */
    @Test
    public void testGetHitboxState() {
        System.out.println("getHitboxState");
        MainCharacter instance = null;
        boolean expResult = false;
        boolean result = instance.getHitboxState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHitboxState method, of class MainCharacter.
     */
    @Test
    public void testSetHitboxState() {
        System.out.println("setHitboxState");
        boolean areHitBoxVisible = false;
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());
        instance.setHitboxState(areHitBoxVisible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of down method, of class MainCharacter.
     */
    @Test
    public void testDown() {
        System.out.println("down");
        MainCharacter instance = null;
        instance.down();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXM method, of class MainCharacter.
     */
    @Test
    public void testGetXM() {
        System.out.println("getXM");
        MainCharacter instance = null;
        float expResult = 0.0F;
        float result = instance.getXM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class MainCharacter.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        float x = 0.0F;
        MainCharacter instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYM method, of class MainCharacter.
     */
    @Test
    public void testGetYM() {
        System.out.println("getYM");
        MainCharacter instance = null;
        float expResult = 0.0F;
        float result = instance.getYM();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class MainCharacter.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        MainCharacter instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class MainCharacter.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        float y = 0.0F;
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());;
        instance.setY(y);
        if(instance.getYM()!=y){
            fail("Y non è stata settata.");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSpeedY method, of class MainCharacter.
     */
    @Test
    public void testGetSpeedY() {
        System.out.println("getSpeedY");
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());;
        float expResult = 0.0F;
        float result = instance.getSpeedY();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeedY method, of class MainCharacter.
     */
    @Test
    public void testSetSpeedY() {
        System.out.println("setSpeedY");
        float speedY = 0.0F;
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());;
        instance.setSpeedY(speedY);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAlive method, of class MainCharacter.
     */
    @Test
    public void testSetAlive() {
        System.out.println("setAlive");
        boolean alive = false;
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());;
        instance.setAlive(alive);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlive method, of class MainCharacter.
     */
    @Test
    public void testGetAlive() {
        System.out.println("getAlive");
        MainCharacter instance = new MainCharacter(new GameScreen(),new KeyManager());
        boolean expResult = false;
        boolean result = instance.getAlive();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Errore.");
    }

    /**
     * Test of getHeight method, of class MainCharacter.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        MainCharacter instance = null;
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getImage method, of class MainCharacter.
     */
    @Test
    public void testGetImage() {
        System.out.println("getImage");
        MainCharacter instance = null;
        instance.getImage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabelVisible method, of class MainCharacter.
     */
    @Test
    public void testSetLabelVisible() {
        System.out.println("setLabelVisible");
        boolean choice = false;
        MainCharacter instance = null;
        instance.setLabelVisible(choice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKeyManager method, of class MainCharacter.
     */
    @Test
    public void testGetKeyManager() {
        System.out.println("getKeyManager");
        MainCharacter instance = null;
        KeyManager expResult = null;
        KeyManager result = instance.getKeyManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKeyManager method, of class MainCharacter.
     */
    @Test
    public void testSetKeyManager() {
        System.out.println("setKeyManager");
        KeyManager keyManager = null;
        MainCharacter instance = null;
        instance.setKeyManager(keyManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class MainCharacter.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        MainCharacter instance = null;
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Test fallito.");
    }

    /**
     * Test of setJTextFieldVisible method, of class MainCharacter.
     */
    @Test
    public void testSetJTextFieldVisible() {
        System.out.println("setJTextFieldVisible");
        boolean choice = false;
        MainCharacter instance = null;
        instance.setJTextFieldVisible(choice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseClicked method, of class MainCharacter.
     */
    @Test
    public void testMouseClicked() {
        System.out.println("mouseClicked");
        MouseEvent e = null;
        MainCharacter instance = null;
        instance.mouseClicked(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mousePressed method, of class MainCharacter.
     */
    @Test
    public void testMousePressed() {
        System.out.println("mousePressed");
        MouseEvent e = null;
        MainCharacter instance = null;
        instance.mousePressed(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of nextSkin method, of class MainCharacter.
     */
    @Test
    public void testNextSkin() {
        System.out.println("nextSkin");
        GameScreen gameScreen = new GameScreen();
        MainCharacter instance = new MainCharacter(gameScreen,new KeyManager());
        
        
        
        
        instance.nextSkin();
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of previousSkin method, of class MainCharacter.
     */
    @Test
    public void testPreviousSkin() {
        System.out.println("previousSkin");
        MainCharacter instance = null;
        instance.previousSkin();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseReleased method, of class MainCharacter.
     */
    @Test
    public void testMouseReleased() {
        System.out.println("mouseReleased");
        MouseEvent e = null;
        MainCharacter instance = null;
        instance.mouseReleased(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseEntered method, of class MainCharacter.
     */
    @Test
    public void testMouseEntered() {
        System.out.println("mouseEntered");
        MouseEvent e = null;
        MainCharacter instance = null;
        instance.mouseEntered(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mouseExited method, of class MainCharacter.
     */
    @Test
    public void testMouseExited() {
        System.out.println("mouseExited");
        MouseEvent e = null;
        MainCharacter instance = null;
        instance.mouseExited(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLeftButton method, of class MainCharacter.
     */
    @Test
    public void testGetLeftButton() {
        System.out.println("getLeftButton");
        MainCharacter instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.getLeftButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRightButton method, of class MainCharacter.
     */
    @Test
    public void testGetRightButton() {
        System.out.println("getRightButton");
        MainCharacter instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.getRightButton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
