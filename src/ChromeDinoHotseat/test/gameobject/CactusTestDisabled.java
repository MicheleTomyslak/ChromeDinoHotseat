package gameobject;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
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
 * @author tmich
 */
public class CactusTest {
    
    private GameScreen gameScreen;
    private KeyManager keyManager;
    private List<MainCharacter> dinos;
    public CactusTest() {
        gameScreen = new GameScreen();
        keyManager = new KeyManager();
        dinos = new ArrayList<>();
        dinos.add(new MainCharacter(gameScreen,keyManager));
        dinos.add(new MainCharacter(gameScreen,keyManager));
        dinos.add(new MainCharacter(gameScreen,keyManager));
        dinos.add(new MainCharacter(gameScreen,keyManager));
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
     * Test of update method, of class Cactus.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Cactus instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBound method, of class Cactus.
     */
    @Test
    public void testGetBound() {
        System.out.println("getBound");
        Cactus instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.getBound();
        assertEquals(expResult, result);
        if(expResult!=result)
        // TODO review the generated test code and remove the default call to fail.
        fail("Il valore era "+result+", invece di "+expResult);
    }

    /**
     * Test of draw method, of class Cactus.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g = null;
        Cactus instance = null;
        instance.draw(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Cactus.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Cactus instance = new Cactus(dinos,gameScreen);
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Cactus.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Cactus instance = new Cactus(dinos,gameScreen);
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setImage method, of class Cactus.
     */
    @Test
    public void testSetImage() {
        System.out.println("setImage");
        BufferedImage image = null;
        Cactus instance = new Cactus(dinos,gameScreen);
        instance.setImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOutOfScreen method, of class Cactus.
     */
    @Test
    public void testIsOutOfScreen() {
        System.out.println("isOutOfScreen");
        Cactus instance = null;
        boolean expResult = false;
        boolean result = instance.isOutOfScreen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOver method, of class Cactus.
     */
    @Test
    public void testIsOver() {
        System.out.println("isOver");
        
        Cactus instance = new Cactus(dinos,gameScreen);
        boolean expResult = false;
        boolean result = instance.isOver();
        assertEquals(expResult, result);
        if(expResult!=result)
        // TODO review the generated test code and remove the default call to fail.
        fail("Il valore era "+result+", invece di "+expResult);
    }

    /**
     * Test of isScoreGot method, of class Cactus.
     */
    @Test
    public void testIsScoreGot() {
        System.out.println("isScoreGot");
        Cactus instance = new Cactus(dinos,gameScreen);
        boolean expResult = false;
        boolean result = instance.isScoreGot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsScoreGot method, of class Cactus.
     */
    @Test
    public void testSetIsScoreGot() {
        System.out.println("setIsScoreGot");
        boolean isScoreGot = false;
        Cactus instance = new Cactus(dinos,gameScreen);
        instance.setIsScoreGot(isScoreGot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Cactus.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        float speed = 0.0F;
        Cactus instance = new Cactus(dinos,gameScreen);
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Cactus.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Cactus instance = new Cactus(dinos,gameScreen);
        float expResult = 0.0F;
        float result = instance.getSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHitboxState method, of class Cactus.
     */
    @Test
    public void testGetHitboxState() {
        System.out.println("getHitboxState");
        Cactus instance = new Cactus(dinos,gameScreen);
        boolean expResult = false;
        boolean result = instance.getHitboxState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHitBoxState method, of class Cactus.
     * 
     */
    @Test
    public void testSetHitBoxState() {
        System.out.println("setHitBoxState");
        boolean areHitBoxVisible = false;
        Cactus instance = new Cactus(dinos,gameScreen);
        instance.setHitBoxState(areHitBoxVisible);
        if(instance.getHitboxState()!=areHitBoxVisible)
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
