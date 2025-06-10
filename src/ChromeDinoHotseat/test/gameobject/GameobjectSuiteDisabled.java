package gameobject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author tmich
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({EnemyManagerTest.class, CloudsTest.class, PteraTest.class, EnemyTest.class, MainCharacterTest.class, CactusTest.class, LandTest.class})
public class GameobjectSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
