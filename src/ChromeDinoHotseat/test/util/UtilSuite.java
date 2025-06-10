package util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    util.KeyManagerTest.class,
    util.ScoreManagerTest.class,
    util.AnimationTest.class,
    util.OptionTest.class,
    util.ResourceBubbleSortTest.class,
    util.ConfigTest.class,
    util.ScoreTest.class})
public class UtilSuite {
    
}
