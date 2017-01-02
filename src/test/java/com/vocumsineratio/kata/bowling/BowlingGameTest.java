package com.vocumsineratio.kata.bowling;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Danil Suits (danil@vast.com)
 */
public class BowlingGameTest {

    @Test
    public void testGutterGame() {
        final int ballsPerGame = 20;
        final int pinsKnockedDown = 0;
        final int expectedScore = Game.INITIAL_SCORE;
        int[] ballsThrown = new int[ballsPerGame];

        Game g = new Game();
        for (int i : ballsThrown) {
            g.roll(pinsKnockedDown);
        }

        Assert.assertEquals(g.score(), expectedScore);
    }
}

class Game {
    static final int INITIAL_SCORE = 0;

    public void roll(int pinsKnockedDown) {
        //TODO: To change body of created methods use File | Settings | File Templates.
    }

    public int score() {
        final int finalScore = INITIAL_SCORE;
        return finalScore;
    }
}
