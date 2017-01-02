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
        for (int i = 0; i < ballsPerGame; ++i) {
            final int scoreForGutterBall = 0;
            g.roll(scoreForGutterBall);
        }

        final int expectedScore = 0;
        Assert.assertEquals(g.score(), expectedScore);
    }
}
class Game {

    public void roll(int i) {
        //TODO: To change body of created methods use File | Settings | File Templates.
    }

    public int score() {
        final int finalScore = 0;
        return finalScore;
    }
}
