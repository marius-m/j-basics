package hangman;

import lt.vcs.MyFileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        MyFileReader fileReader = new MyFileReader();
        ArrayList<String> lines = fileReader.read("words.txt");
        Random rand = new Random();
        int randomNumber  = rand.nextInt(lines.size()) + 1;
        WordPicker wordPicker = new WordPicker(lines);
    }
}
