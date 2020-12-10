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
public class OptionTest {
    
    public OptionTest() {
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
     * Test of getPlayerNumber method, of class Option.
     */
    @Test
    public void testGetPlayerNumber() {
        System.out.println("getPlayerNumber");
        Option instance = new Option();
        int expResult = 0;
        int result = instance.getPlayerNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPlayerNumber method, of class Option.
     */
    @Test
    public void testSetPlayerNumber() {
        System.out.println("setPlayerNumber");
        int playerNumber = 0;
        Option instance = new Option();
        instance.setPlayerNumber(playerNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJumpKey method, of class Option.
     */
    @Test
    public void testGetJumpKey() {
        System.out.println("getJumpKey");
        Option instance = new Option();
        int expResult = 0;
        int result = instance.getJumpKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJumpKey method, of class Option.
     */
    @Test
    public void testSetJumpKey() {
        System.out.println("setJumpKey");
        int jumpKey = 0;
        Option instance = new Option();
        instance.setJumpKey(jumpKey);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuckKey method, of class Option.
     */
    @Test
    public void testGetDuckKey() {
        System.out.println("getDuckKey");
        Option instance = new Option();
        int expResult = 0;
        int result = instance.getDuckKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuckKey method, of class Option.
     */
    @Test
    public void testSetDuckKey() {
        System.out.println("setDuckKey");
        int duckKey = 0;
        Option instance = new Option();
        instance.setDuckKey(duckKey);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
