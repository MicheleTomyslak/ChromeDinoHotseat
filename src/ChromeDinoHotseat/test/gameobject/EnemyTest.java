/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

import java.awt.Graphics2D;
import java.awt.Rectangle;
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
public class EnemyTest {
    
    public EnemyTest() {
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
     * Test of getBound method, of class Enemy.
     */
    @Test
    public void testGetBound() {
        System.out.println("getBound");
        Enemy instance = new EnemyImpl();
        Rectangle expResult = null;
        Rectangle result = instance.getBound();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Enemy.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g = null;
        Enemy instance = new EnemyImpl();
        instance.draw(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Enemy.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Enemy instance = new EnemyImpl();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOutOfScreen method, of class Enemy.
     */
    @Test
    public void testIsOutOfScreen() {
        System.out.println("isOutOfScreen");
        Enemy instance = new EnemyImpl();
        boolean expResult = false;
        boolean result = instance.isOutOfScreen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOver method, of class Enemy.
     */
    @Test
    public void testIsOver() {
        System.out.println("isOver");
        Enemy instance = new EnemyImpl();
        boolean expResult = false;
        boolean result = instance.isOver();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsScoreGot method, of class Enemy.
     */
    @Test
    public void testSetIsScoreGot() {
        System.out.println("setIsScoreGot");
        boolean isScoreGot = false;
        Enemy instance = new EnemyImpl();
        instance.setIsScoreGot(isScoreGot);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isScoreGot method, of class Enemy.
     */
    @Test
    public void testIsScoreGot() {
        System.out.println("isScoreGot");
        Enemy instance = new EnemyImpl();
        boolean expResult = false;
        boolean result = instance.isScoreGot();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Enemy.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        float speed = 0.0F;
        Enemy instance = new EnemyImpl();
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Enemy.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Enemy instance = new EnemyImpl();
        float expResult = 0.0F;
        float result = instance.getSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHitboxState method, of class Enemy.
     */
    @Test
    public void testGetHitboxState() {
        System.out.println("getHitboxState");
        Enemy instance = new EnemyImpl();
        boolean expResult = false;
        boolean result = instance.getHitboxState();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHitBoxState method, of class Enemy.
     */
    @Test
    public void testSetHitBoxState() {
        System.out.println("setHitBoxState");
        boolean areHitBoxVisible = false;
        Enemy instance = new EnemyImpl();
        instance.setHitBoxState(areHitBoxVisible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class EnemyImpl extends Enemy {

        public Rectangle getBound() {
            return null;
        }

        public void draw(Graphics2D g) {
        }

        public void update() {
        }

        public boolean isOutOfScreen() {
            return false;
        }

        public boolean isOver() {
            return false;
        }

        public void setIsScoreGot(boolean isScoreGot) {
        }

        public boolean isScoreGot() {
            return false;
        }

        public void setSpeed(float speed) {
        }

        public float getSpeed() {
            return 0.0F;
        }

        public boolean getHitboxState() {
            return false;
        }

        public void setHitBoxState(boolean areHitBoxVisible) {
        }
    }
    
}
