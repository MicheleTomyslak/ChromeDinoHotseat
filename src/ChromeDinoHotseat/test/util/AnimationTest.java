/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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
public class AnimationTest {
    
    public AnimationTest() {
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
     * Test of update method, of class Animation.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Animation instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFrame method, of class Animation.
     */
    @Test
    public void testAddFrame() {
        System.out.println("addFrame");
        BufferedImage frame = new BufferedImage(0,0,0);
        Animation instance = new Animation(1);
        
        instance.addFrame(frame);
        if(instance.getNumberOfFrame()==1){
            
        }else{
            fail("The test case is a prototype.");
        }
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getFrame method, of class Animation.
     */
    @Test
    public void testGetFrame() {
        System.out.println("getFrame");
        Animation instance = new Animation(10);
        BufferedImage expResult = new BufferedImage(0,0,0);
        BufferedImage result = instance.getFrame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
