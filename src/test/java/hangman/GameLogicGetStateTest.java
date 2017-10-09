package hangman;

import junit.framework.TestCase;

public class GameLogicGetStateTest extends TestCase {

    public void testHasWon() throws Exception {
        GameLogic gameLogic = new GameLogic("word");
        gameLogic.validWord = new char[]{
                'a', 'b', 'c'
        };
        gameLogic.guessWord = new char[]{
                'a', 'b', 'c'
        };
        assertEquals(GameState.WON, gameLogic.getGameState());
    }

    public void testInGame() throws Exception {
        GameLogic gameLogic = new GameLogic("word");
        gameLogic.validWord = new char[]{
                'a', 'b', 'c'
        };
        gameLogic.guessWord = new char[]{
                'a', '_', '_'
        };
        assertEquals(GameState.IN_GAME, gameLogic.getGameState());
    }

    public void testLost() throws Exception {
        GameLogic gameLogic = new GameLogic("word");
        gameLogic.validWord = new char[]{
                'a', 'b', 'c'
        };
        gameLogic.guessWord = new char[]{
                'a', '_', '_'
        };
        gameLogic.health = 0;
        assertEquals(GameState.LOST, gameLogic.getGameState());
    }

    public void testLost2() throws Exception {
        GameLogic gameLogic = new GameLogic("word");
        gameLogic.validWord = new char[]{
                'a', 'b', 'c'
        };
        gameLogic.guessWord = new char[]{
                'a', 'b', 'c'
        };
        gameLogic.health = 0;
        assertEquals(GameState.LOST, gameLogic.getGameState());
    }
}