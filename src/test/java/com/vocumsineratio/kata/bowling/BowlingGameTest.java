package com.vocumsineratio.kata.bowling;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

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

        Arrays.fill(ballsThrown, pinsKnockedDown);

        Game g = new Game();
        for (int pins : ballsThrown) {
            g.roll(pins);
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
