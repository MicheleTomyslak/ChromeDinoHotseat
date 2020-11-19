/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameobject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author michele.tomyslak
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({gameobject.EnemyManagerTest.class, gameobject.CloudsTest.class, gameobject.PteraTest.class, gameobject.EnemyTest.class, gameobject.MainCharacterTest.class, gameobject.CactusTest.class, gameobject.LandTest.class})
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
