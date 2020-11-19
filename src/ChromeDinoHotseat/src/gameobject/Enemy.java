package gameobject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author tmich
 */
public abstract class Enemy extends JComponent {
    public abstract Rectangle getBound();
    public abstract void draw(Graphics2D g);
    public abstract void update();
    public abstract boolean isOutOfScreen();
    public abstract boolean isOver();
    public abstract void setIsScoreGot(boolean isScoreGot);
    public abstract boolean isScoreGot();
    public abstract void setSpeed(float speed);
    public abstract float getSpeed();
    public abstract boolean getHitboxState();
    public abstract void setHitBoxState(boolean areHitBoxVisible);
}
