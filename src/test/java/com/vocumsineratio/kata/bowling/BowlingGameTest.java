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
        for (int i = 0; i < 20; ++i) {
            g.roll(0);
        }

        Assert.assertEquals(g.score(), 0);
    }
}
class Game {

    public void roll(int i) {
        //TODO: To change body of created methods use File | Settings | File Templates.
    }

    public int score() {
        return 0;  //TODO: To change body of created methods use File | Settings | File Templates.
    }
}
