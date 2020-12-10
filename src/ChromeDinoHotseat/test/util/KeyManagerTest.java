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
public class KeyManagerTest {
    
    public KeyManagerTest() {
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
     * Test of getDuckKey method, of class KeyManager.
     */
    @Test
    public void testGetDuckKey() {
        System.out.println("getDuckKey");
        KeyManager instance = new KeyManager();
        int expResult = 0;
        int result = instance.getDuckKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJumpKey method, of class KeyManager.
     */
    @Test
    public void testGetJumpKey() {
        System.out.println("getJumpKey");
        KeyManager instance = new KeyManager();
        int expResult = 0;
        int result = instance.getJumpKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
