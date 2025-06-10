package util;

import java.io.File;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceConfigTest {

    @Test
    public void testLoadDefaultConfig() {
        Config cfg = Resource.getResourceOptions("data/config/config.json");
        assertNotNull(cfg);
        assertEquals(Config.DEFAULT_JUMP_KEY_PLAYER_ONE, cfg.getOptions()[0].getJumpKey());
    }

    @Test
    public void testSetAndGetResourceOption() throws IOException {
        Config cfg = new Config();
        cfg.getOptions()[0].setJumpKey(65);
        File temp = File.createTempFile("config", ".json");
        temp.deleteOnExit();
        Resource.setResourceOption(temp.getPath(), cfg);
        Config loaded = Resource.getResourceOptions(temp.getPath());
        assertEquals(65, loaded.getOptions()[0].getJumpKey());
    }
}
