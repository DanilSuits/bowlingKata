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
        int[] ballsThrown = new int[ballsPerGame];
        Arrays.fill(ballsThrown, pinsKnockedDown);

        final int expectedScore = Game.INITIAL_SCORE;

        // Everything that happens above this break is just specification design

        Specification gutterGameSpec = new Specification(ballsThrown, expectedScore);

        verify(gutterGameSpec);
    }

    private void verify(Specification gutterGameSpec) {
        // GIVEN
        Game g = new Game();

        // WHEN
        for (int pins : gutterGameSpec.ballsThrown) {
            g.roll(pins);
        }

        // THEN
        Assert.assertEquals(g.score(), gutterGameSpec.expectedScore);
    }
}
class Specification {
    final int [] ballsThrown;
    final int expectedScore;

    Specification(int[] ballsThrown, int expectedScore) {
        this.ballsThrown = ballsThrown;
        this.expectedScore = expectedScore;
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
