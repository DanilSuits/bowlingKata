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

        final int expectedScore = BowlingRules.INITIAL_SCORE;

        // Everything that happens above this break is just specification design

        Specification gutterGameSpec = new Specification(ballsThrown, expectedScore);

        verify(gutterGameSpec);
    }

    private void verify(Specification gutterGameSpec) {
        // GIVEN
        SUT systemUnderTest = new Adapter();

        // WHEN
        for (int pins : gutterGameSpec.ballsThrown) {
            systemUnderTest.roll(pins);
        }

        // THEN
        Assert.assertEquals(systemUnderTest.score(), gutterGameSpec.expectedScore);
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
interface SUT {
    void roll(int pinsKnockedDown);
    int score();
}
class BowlingRules {
    // TODO: This may need to find a home.
    static final int INITIAL_SCORE = 0;
}
class Adapter implements SUT {
    Game theGame = new Game();

    public void roll(int pinsKnockedDown) {
        theGame.roll(pinsKnockedDown);
    }

    public int score() {
        return theGame.score().value;
    }
}
class Game {
    public void roll(int pinsKnockedDown) {
        // TODO
    }

    public Score score () {
        final Score initialScore = new Score(BowlingRules.INITIAL_SCORE);
        return initialScore;
    }
}
class Score {
    final int value;

    Score(int value) {
        this.value = value;
    }
}
