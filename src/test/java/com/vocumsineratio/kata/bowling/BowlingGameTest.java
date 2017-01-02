package com.vocumsineratio.kata.bowling;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Danil Suits (danil@vast.com)
 */
public class BowlingGameTest {

    @Test
    public void testGutterGame () {
        Game g = new Game();
        final int ballsPerGame = 20;
        int [] ballsThrown = new int[ballsPerGame];
        for (int i : ballsThrown) {
            final int pinsKnockedDown = 0;

            g.roll(pinsKnockedDown);
        }

        final int expectedScore = Game.INITIAL_SCORE;
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
