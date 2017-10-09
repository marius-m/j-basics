package hangman;

import junit.framework.TestCase;

/**
 * @author mariusmerkevicius
 * @since 2017-10-09
 */
public class GameLogicTest extends TestCase {

    public void testPrintAllElements() throws Exception {
        GameLogic gameLogic = new GameLogic("word");

        for (int i = 0; i < gameLogic.hangmanDisplay.length; i++) {
            System.out.println(gameLogic.hangmanDisplay[i]);
        }
    }
}