package util;

import java.awt.image.BufferedImage;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnimationTest {

    @Test
    public void testAnimationCycle() throws Exception {
        Animation animation = new Animation(0);
        BufferedImage img1 = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        BufferedImage img2 = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        animation.addFrame(img1);
        animation.addFrame(img2);

        assertEquals(img1, animation.getFrame());
        animation.update();
        Thread.sleep(1);
        animation.update();
        assertEquals(img2, animation.getFrame());
        Thread.sleep(1);
        animation.update();
        assertEquals(img1, animation.getFrame());
        assertEquals(2, animation.getNumberOfFrame());
    }
    
}
