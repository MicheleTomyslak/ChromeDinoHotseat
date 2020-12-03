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
    /**
     * Ritorna l'area di collisione dell'oggetto Enemy, con un MainCharacter.
     * @return Le hitbox dell'oggetto Enemy.
     */
    public abstract Rectangle getBound();
    /**
     * Metodo che si occupa di disegnare a schermo l'oggetto Enemy, con eventuali proprietà o condizioni.
     * @param g Il contesto grafico in cui disegnare questo oggetto.
     */
    public abstract void draw(Graphics2D g);
    /**
     * Metodo che viene richiamato ad ogni ciclo della loop di gioco.
     */
    public abstract void update();
    /**
     * Metodo che controlla se un Enemy è ancora all'interno dello schermo o meno.
     * @return un boolan che rappresenta lo stato dell'enemy, se sia visibile o è fuori dallo schermo. 
     */
    public abstract boolean isOutOfScreen();
    /**
     * Metodo che controlla se un MainCharacter è sopra all'oggetto Enemy.
     * @return se un MainCharacter è sopra questo oggetto o meno.
     */
    public abstract boolean isOver();
    
    public abstract void setIsScoreGot(boolean isScoreGot);
    public abstract boolean isScoreGot();
    /**
     * Setter della velocità dell'oggetto Enemy
     * @param speed  La velocità dell'oggetto Enemy nel gioco.
     */
    public abstract void setSpeed(float speed);
    /**
     * Getter della velocità dell'oggetto Enemy.
     * @return La velocità dell'oggetto Enemy nel gioco.
     */
    public abstract float getSpeed();
    /**
     * Getter dello stato delle hitbox, true=visibili, false= non visibili.
     * @return Lo stato della visibilità delle hitbox dell'oggetto Enemy in gioco.
     */
    public abstract boolean getHitboxState();
    /**
     * ¨Setter dello stato di visibilità delle hitbox, true = visibili, false = non visibili.
     * @param areHitBoxVisible Il parametro che definisce se le hitbox dell'Enemy sono visibili o meno.
     */
    public abstract void setHitBoxState(boolean areHitBoxVisible);
}
