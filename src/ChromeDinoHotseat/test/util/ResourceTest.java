/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import gameobject.MainCharacter;
import java.awt.Font;
import java.awt.image.BufferedImage;
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
public class ResourceTest {
    
    public ResourceTest() {
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
     * Test of getResourceImage method, of class Resource.
     */
    @Test
    public void testGetResourceImage() {
        System.out.println("getResourceImage");
        String path = "";
        BufferedImage expResult = null;
        BufferedImage result = Resource.getResourceImage(path);
        assertEquals(expResult, result);
        if(expResult!=result)
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResourceFileContent method, of class Resource.
     */
    @Test
    public void testGetResourceFileContent() {
        System.out.println("getResourceFileContent");
        String path = "";
        List<String> expResult = null;
        List<String> result = Resource.getResourceFileContent(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResourceOption method, of class Resource.
     */
    @Test
    public void testSetResourceOption() {
        System.out.println("setResourceOption");
        String path = "";
        Config config = null;
        Resource.setResourceOption(path, config);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeString method, of class Resource.
     */
    @Test
    public void testWriteString() {
        System.out.println("writeString");
        String path = "";
        String content = "";
        Resource.writeString(path, content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResourceOptions method, of class Resource.
     */
    @Test
    public void testGetResourceOptions() {
        System.out.println("getResourceOptions");
        String path = "";
        Config expResult = null;
        Config result = Resource.getResourceOptions(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScores method, of class Resource.
     */
    @Test
    public void testGetScores() {
        System.out.println("getScores");
        String path = "";
        List<Score> expResult = null;
        List<Score> result = Resource.getScores(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeJsonScore method, of class Resource.
     */
    @Test
    public void testWriteJsonScore() {
        System.out.println("writeJsonScore");
        String path = "";
        MainCharacter dino = null;
        Resource.writeJsonScore(path, dino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeScore method, of class Resource.
     */
    @Test
    public void testWriteScore() {
        System.out.println("writeScore");
        String path = "";
        MainCharacter mainCharacter = null;
        Resource.writeScore(path, mainCharacter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrdered method, of class Resource.
     */
    @Test
    public void testGetOrdered() {
        System.out.println("getOrdered");
        Resource.getOrdered();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of serializeJson method, of class Resource.
     */
    @Test
    public void testSerializeJson() {
        System.out.println("serializeJson");
        Object object = null;
        String expResult = "";
        String result = Resource.serializeJson(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deserializeJSONtoScore method, of class Resource.
     */
    @Test
    public void testDeserializeJSONtoScore() {
        System.out.println("deserializeJSONtoScore");
        String s = "";
        List<Score> expResult = null;
        List<Score> result = Resource.deserializeJSONtoScore(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Resource.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Resource.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataFolder method, of class Resource.
     */
    @Test
    public void testGetDataFolder() {
        System.out.println("getDataFolder");
        String path = "";
        Animation[] expResult = null;
        Animation[] result = Resource.getDataFolder(path);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDinosSkinDirectory method, of class Resource.
     */
    @Test
    public void testGetDinosSkinDirectory() {
        System.out.println("getDinosSkinDirectory");
        String path = "";
        String[] expResult = null;
        String[] result = Resource.getDinosSkinDirectory(path);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJSONFromScoreManager method, of class Resource.
     */
    @Test
    public void testGetJSONFromScoreManager() {
        System.out.println("getJSONFromScoreManager");
        ScoreManager sm = null;
        String expResult = "";
        String result = Resource.getJSONFromScoreManager(sm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeJSONScoreData method, of class Resource.
     */
    @Test
    public void testWriteJSONScoreData() {
        System.out.println("writeJSONScoreData");
        ScoreManager sm = null;
        Resource.writeJSONScoreData(sm);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScoreManagerFromJSON method, of class Resource.
     */
    @Test
    public void testGetScoreManagerFromJSON() {
        System.out.println("getScoreManagerFromJSON");
        String s = "";
        ScoreManager expResult = null;
        ScoreManager result = Resource.getScoreManagerFromJSON(s);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFont method, of class Resource.
     */
    @Test
    public void testGetFont() throws Exception {
        System.out.println("getFont");
        String fileName = "";
        Font expResult = null;
        Font result = Resource.getFont(fileName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bubbleSort method, of class Resource.
     */
    @Test
    public void testBubbleSort() {
        System.out.println("bubbleSort");
        ScoreManager sm = null;
        ScoreManager expResult = null;
        ScoreManager result = Resource.bubbleSort(sm);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
