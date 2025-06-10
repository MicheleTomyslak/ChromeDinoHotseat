package gameobject;

import java.awt.Graphics2D;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmich
 */
public class EnemyManagerTest {
    
    public EnemyManagerTest() {
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
     * Test of reset method, of class EnemyManager.
     */
    @Test
    public void testReset() {
        System.out.println("reset");
        EnemyManager instance = null;
        instance.reset();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EnemyManager.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        EnemyManager instance = null;
        instance.update();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class EnemyManager.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Graphics2D g = null;
        EnemyManager instance = null;
        instance.draw(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemies method, of class EnemyManager.
     */
    @Test
    public void testGetEnemies() {
        System.out.println("getEnemies");
        EnemyManager instance = null;
        ArrayList<Enemy> expResult = null;
        ArrayList<Enemy> result = instance.getEnemies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
