package util;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConfigTest {

    /**
     * Verifica che il costruttore imposti correttamente le opzioni di default.
     */
    @Test
    public void testDefaultOptions() {
        Config instance = new Config();
        Option[] result = instance.getOptions();
        assertEquals(4, result.length);
        assertEquals(Config.DEFAULT_JUMP_KEY_PLAYER_ONE, result[0].getJumpKey());
        assertEquals(Config.DEFAULT_DUCK_KEY_PLAYER_ONE, result[0].getDuckKey());
        assertEquals(1, result[0].getPlayerNumber());
    }

    /**
     * Test of setOptions method, of class Config.
     */
    @Test
    public void testSetOptions() {
        Config instance = new Config();
        Option[] options = new Option[] { new Option(5, 10, 11) };
        instance.setOptions(options);
        assertSame(options, instance.getOptions());
    }
    
}
