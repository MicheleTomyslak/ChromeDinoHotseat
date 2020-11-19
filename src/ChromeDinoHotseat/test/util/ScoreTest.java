/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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
public class ScoreTest {
    
    public ScoreTest() {
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
     * Test of getName method, of class Score.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Score instance = new Score();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScoredPoints method, of class Score.
     */
    @Test
    public void testGetScoredPoints() {
        System.out.println("getScoredPoints");
        Score instance = new Score();
        int expResult = 0;
        int result = instance.getScoredPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Score.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Score instance = new Score();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportAsJSON method, of class Score.
     */
    @Test
    public void testExportAsJSON() {
        System.out.println("exportAsJSON");
        Score instance = new Score();
        String expResult = "";
        String result = instance.exportAsJSON();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
