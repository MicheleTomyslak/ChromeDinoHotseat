package util;

import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author michele.tomyslak
 */
public class KeyManagerTest {

    /**
     * Test of getDuckKey method, of class KeyManager.
     */
    @Test
    public void testGetDuckKey() {
        KeyManager instance = new KeyManager();
        int result = instance.getDuckKey();
        assertEquals(KeyEvent.VK_DOWN, result);
    }

    /**
     * Test of getJumpKey method, of class KeyManager.
     */
    @Test
    public void testGetJumpKey() {
        KeyManager instance = new KeyManager();
        int result = instance.getJumpKey();
        assertEquals(KeyEvent.VK_SPACE, result);
    }
    
}
