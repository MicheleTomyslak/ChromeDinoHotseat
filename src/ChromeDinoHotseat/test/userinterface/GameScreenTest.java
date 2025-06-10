package userinterface;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameScreenTest {

    @Test
    public void testInitialState() {
        GameScreen gs = new GameScreen();
        assertEquals(GameScreen.GAME_FIRST_STATE, gs.getState());
        assertEquals(0, gs.getScore());
    }

    @Test
    public void testPlusScore() {
        GameScreen gs = new GameScreen();
        gs.plusScore(10);
        assertEquals(10, gs.getScore());
    }

    @Test
    public void testPauseAndResume() {
        GameScreen gs = new GameScreen();
        gs.setGameState(GameScreen.GAME_PLAY_STATE);
        gs.pause();
        assertEquals(GameScreen.GAME_PAUSE_STATE, gs.getState());
        gs.resume();
        assertEquals(GameScreen.GAME_PLAY_STATE, gs.getState());
    }

    @Test
    public void testScreenSpeedSetterGetter() {
        GameScreen gs = new GameScreen();
        gs.setScreenSpeed(7.5f);
        assertEquals(7.5f, gs.getScreenSpeed(), 0.0f);
    }
}
