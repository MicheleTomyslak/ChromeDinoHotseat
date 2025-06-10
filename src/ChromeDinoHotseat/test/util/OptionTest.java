package util;

import org.junit.Test;
import static org.junit.Assert.*;

public class OptionTest {

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
