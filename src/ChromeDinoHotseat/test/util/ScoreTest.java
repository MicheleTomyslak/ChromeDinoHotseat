package util;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreTest {

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
