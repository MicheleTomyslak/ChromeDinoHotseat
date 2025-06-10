package util;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreManagerTest {

    @Test
    public void testAddAndGetScore() {
        ScoreManager sm = new ScoreManager();
        Score s = new Score("Alice", 100, 1L);
        sm.addScore(s);
        assertEquals(1, sm.getScores().size());
        assertEquals(s, sm.getScore(0));
    }

    @Test
    public void testOrderScores() {
        ScoreManager sm = new ScoreManager();
        sm.addScore(new Score("A", 50, 1));
        sm.addScore(new Score("B", 150, 1));
        sm.addScore(new Score("C", 100, 1));
        ScoreManager ordered = sm.orderScores(sm);
        assertEquals(150, ordered.getScore(0).getScoredPoints());
        assertEquals(100, ordered.getScore(1).getScoredPoints());
        assertEquals(50, ordered.getScore(2).getScoredPoints());
    }

    @Test
    public void testGetNamesAndScores() {
        ScoreManager sm = new ScoreManager();
        sm.addScore(new Score("Alice", 50, 1));
        sm.addScore(new Score("Bob", 100, 2));
        sm.addScore(new Score("Alice", 70, 3));

        assertEquals(Arrays.asList("Bob"), sm.getNamesByScore(100));
        assertEquals(Arrays.asList(50, 70), sm.getScoresByName("Alice"));
    }

    @Test
    public void testExportAsJSON() {
        ScoreManager sm = new ScoreManager();
        sm.addScore(new Score("Alice", 20, 1));
        String json = sm.exportAsJSON();
        assertTrue(json.contains("Alice"));
        assertTrue(json.contains("20"));
    }
}
