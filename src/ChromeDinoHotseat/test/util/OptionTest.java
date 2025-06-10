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
     * Verifica i valori iniziali restituiti da un'istanza senza parametri.
     */
    @Test
    public void testDefaultValues() {
        Option instance = new Option();
        assertEquals(0, instance.getPlayerNumber());
        assertEquals(0, instance.getJumpKey());
        assertEquals(0, instance.getDuckKey());
    }

    /**
     * Test of setPlayerNumber method, of class Option.
     */
    @Test
    public void testSetters() {
        Option instance = new Option();
        instance.setPlayerNumber(2);
        instance.setJumpKey(65);
        instance.setDuckKey(66);

        assertEquals(2, instance.getPlayerNumber());
        assertEquals(65, instance.getJumpKey());
        assertEquals(66, instance.getDuckKey());
    }

}
