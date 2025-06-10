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

    @Test
    public void testConstructorAndGetters() {
        long now = System.currentTimeMillis();
        Score s = new Score("Alice", 10, now);
        assertEquals("Alice", s.getName());
        assertEquals(10, s.getScoredPoints());
        assertEquals(now, s.getDate());
    }

    /**
     * Test of getScoredPoints method, of class Score.
     */
    @Test
    public void testSetDate() {
        Score s = new Score();
        s.setDate(123L);
        assertEquals(123L, s.getDate());
    }

    /**
     * Test of getDate method, of class Score.
     */




    /**
     * Test of exportAsJSON method, of class Score.
     */
    @Test
    public void testToStringAndJson() {
        long ts = 0L;
        Score s = new Score("Bob", 50, ts);
        String expectedString = "Bob,50," + new java.util.Date(ts).toString();
        assertEquals(expectedString, s.toString());

        String json = s.exportAsJSON();
        assertTrue(json.contains("\"Bob\""));
        assertTrue(json.contains("50"));
    }
    
}
