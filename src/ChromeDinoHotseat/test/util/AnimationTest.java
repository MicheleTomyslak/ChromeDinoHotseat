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

    @Test
    public void testAnimationCycle() throws Exception {
        Animation animation = new Animation(0);
        BufferedImage img1 = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        BufferedImage img2 = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        animation.addFrame(img1);
        animation.addFrame(img2);

        assertEquals(img1, animation.getFrame());
        animation.update();
        Thread.sleep(1);
        animation.update();
        assertEquals(img2, animation.getFrame());
        Thread.sleep(1);
        animation.update();
        assertEquals(img1, animation.getFrame());
        assertEquals(2, animation.getNumberOfFrame());
    }
    
}
