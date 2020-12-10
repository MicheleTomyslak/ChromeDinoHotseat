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
        ScoreManager instance = new ScoreManager();
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
        ScoreManager instance = new ScoreManager();
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
        ScoreManager instance = new ScoreManager();
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
        ScoreManager instance = new ScoreManager();
        instance.getOrderedScore();
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
        ScoreManager instance = new ScoreManager();
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
        ScoreManager instance = new ScoreManager();
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
        ScoreManager instance = new ScoreManager();
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of orderScores method, of class ScoreManager.
     */
    @Test
    public void testOrderScores() {
        System.out.println("orderScores");
        ScoreManager s = null;
        ScoreManager instance = new ScoreManager();
        ScoreManager expResult = null;
        ScoreManager result = instance.orderScores(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exportAsJSON method, of class ScoreManager.
     */
    @Test
    public void testExportAsJSON() {
        System.out.println("exportAsJSON");
        ScoreManager instance = new ScoreManager();
        String expResult = "";
        String result = instance.exportAsJSON();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveData method, of class ScoreManager.
     */
    @Test
    public void testSaveData() {
        System.out.println("saveData");
        ScoreManager instance = new ScoreManager();
        instance.saveData();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFromJSON method, of class ScoreManager.
     */
    @Test
    public void testGetDataFromJSON() {
        System.out.println("getDataFromJSON");
        ScoreManager expResult = null;
        ScoreManager result = ScoreManager.getDataFromJSON();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addScore method, of class ScoreManager.
     */
    @Test
    public void testAddScore() {
        System.out.println("addScore");
        Score s = null;
        ScoreManager instance = new ScoreManager();
        instance.addScore(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListOfScores method, of class ScoreManager.
     */
    @Test
    public void testAddListOfScores() {
        System.out.println("addListOfScores");
        List<Score> scores = null;
        ScoreManager instance = new ScoreManager();
        instance.addListOfScores(scores);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
