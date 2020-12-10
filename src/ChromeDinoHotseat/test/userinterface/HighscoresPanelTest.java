/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.Score;

/**
 *
 * @author michele.tomyslak
 */
public class HighscoresPanelTest {
    
    public HighscoresPanelTest() {
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
     * Test of addScore method, of class HighscoresPanel.
     */
    @Test
    public void testAddScore() {
        System.out.println("addScore");
        Score s = null;
        HighscoresPanel instance = new HighscoresPanel();
        instance.addScore(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
