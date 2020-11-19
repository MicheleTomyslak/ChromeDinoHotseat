/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
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
public class PteraTest {
    
    public PteraTest() {
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
     * Test of update method, of class Ptera.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Ptera instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBound method, of class Ptera.
     */
    @Test
    public void testGetBound() {
        System.out.println("getBound");
        Ptera instance = null;
        Rectangle expResult = null;
        Rectangle result = instance.getBound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Ptera.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g = null;
        Ptera instance = null;
        instance.draw(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Ptera.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        int x = 0;
        Ptera instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Ptera.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        int y = 0;
        Ptera instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addImage method, of class Ptera.
     */
    @Test
    public void testAddImage() {
        System.out.println("addImage");
        BufferedImage image = null;
        Ptera instance = null;
        instance.addImage(image);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOutOfScreen method, of class Ptera.
     */
    @Test
    public void testIsOutOfScreen() {
        System.out.println("isOutOfScreen");
        Ptera instance = null;
        boolean expResult = false;
        boolean result = instance.isOutOfScreen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOver method, of class Ptera.
     */
    @Test
    public void testIsOver() {
        System.out.println("isOver");
        Ptera instance = null;
        boolean expResult = false;
        boolean result = instance.isOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isScoreGot method, of class Ptera.
     */
    @Test
    public void testIsScoreGot() {
        System.out.println("isScoreGot");
        Ptera instance = null;
        boolean expResult = false;
        boolean result = instance.isScoreGot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsScoreGot method, of class Ptera.
     */
    @Test
    public void testSetIsScoreGot() {
        System.out.println("setIsScoreGot");
        boolean isScoreGot = false;
        Ptera instance = null;
        instance.setIsScoreGot(isScoreGot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Ptera.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        float speed = 0.0F;
        Ptera instance = null;
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Ptera.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Ptera instance = null;
        float expResult = 0.0F;
        float result = instance.getSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHitboxState method, of class Ptera.
     */
    @Test
    public void testGetHitboxState() {
        System.out.println("getHitboxState");
        Ptera instance = null;
        boolean expResult = false;
        boolean result = instance.getHitboxState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHitBoxState method, of class Ptera.
     */
    @Test
    public void testSetHitBoxState() {
        System.out.println("setHitBoxState");
        boolean areHitBoxVisible = false;
        Ptera instance = null;
        instance.setHitBoxState(areHitBoxVisible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
