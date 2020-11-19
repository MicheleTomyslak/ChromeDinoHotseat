/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

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
public class ScoreManagerTest {
    
    public ScoreManagerTest() {
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
     * Test of getScores method, of class ScoreManager.
     */
    @Test
    public void testGetScores() {
        System.out.println("getScores");
        ScoreManager instance = null;
        List<Score> expResult = null;
        List<Score> result = instance.getScores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScore method, of class ScoreManager.
     */
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        int index = 0;
        ScoreManager instance = null;
        Score expResult = null;
        Score result = instance.getScore(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ScoreManager.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ScoreManager instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderedScore method, of class ScoreManager.
     */
    @Test
    public void testGetOrderedScore() {
        System.out.println("getOrderedScore");
        ScoreManager instance = null;
        List<Score> expResult = null;
        List<Score> result = instance.getOrderedScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNamesByScore method, of class ScoreManager.
     */
    @Test
    public void testGetNamesByScore() {
        System.out.println("getNamesByScore");
        int score = 0;
        ScoreManager instance = null;
        List<String> expResult = null;
        List<String> result = instance.getNamesByScore(score);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScoresByName method, of class ScoreManager.
     */
    @Test
    public void testGetScoresByName() {
        System.out.println("getScoresByName");
        String name = "";
        ScoreManager instance = null;
        List<Integer> expResult = null;
        List<Integer> result = instance.getScoresByName(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class ScoreManager.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        ScoreManager instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportAsJSON method, of class ScoreManager.
     */
    @Test
    public void testExportAsJSON() {
        System.out.println("exportAsJSON");
        ScoreManager instance = null;
        String expResult = "";
        String result = instance.exportAsJSON();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
