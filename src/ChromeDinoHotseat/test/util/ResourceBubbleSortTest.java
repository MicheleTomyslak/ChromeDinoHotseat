package util;

import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceBubbleSortTest {
    @Test
    public void testBubbleSortOrdersDescending() {
        ScoreManager sm = new ScoreManager();
        sm.addScore(new Score("a", 10, 1));
        sm.addScore(new Score("b", 30, 1));
        sm.addScore(new Score("c", 20, 1));

        ScoreManager sorted = Resource.bubbleSort(sm);
        assertEquals(30, sorted.getScore(0).getScoredPoints());
        assertEquals(20, sorted.getScore(1).getScoredPoints());
        assertEquals(10, sorted.getScore(2).getScoredPoints());
    }
}
