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
        GameLogic gameLogic = new GameLogic(wordPicker.pick(randomNumber));

        String inputLetter;
        do {
            inputLetter = scanner.nextLine();
            gameLogic.displayLetters();
            gameLogic.checkLetter(inputLetter);
        } while (!"exit".equals(inputLetter));
    }
}
