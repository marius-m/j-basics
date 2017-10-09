package hangman;

import lt.vcs.MyFileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        MyFileReader fileReader = new MyFileReader();
        ArrayList<String> lines = fileReader.read("words.txt");

        Random rand = new Random();
        int randomNumber  = rand.nextInt(lines.size()) + 1;

        WordPicker wordPicker = new WordPicker(lines);
//        GameLogic gameLogic = new GameLogic(wordPicker.pick(randomNumber));
        GameLogic gameLogic = new GameLogic(wordPicker.pick(0));

        String inputLetter;
        GameState gameState = GameState.UNKNOWN;
        do {
            gameLogic.displayHealth();
            gameLogic.displayGuessedWord();
            System.out.println("Input letter");
            inputLetter = scanner.nextLine();
            gameLogic.checkLetter(inputLetter);
            gameState = gameLogic.getGameState();
            switch (gameState) {
                case IN_GAME:
                    break;
                case WON:
                    System.out.println("You won");
                    break;
                case LOST:
                    System.out.println("You lost");
                    break;
            }
        } while (!"exit".equals(inputLetter) && gameState == GameState.IN_GAME);
    }
}
