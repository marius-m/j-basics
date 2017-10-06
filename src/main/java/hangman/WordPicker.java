package hangman;

import lt.vcs.MyFileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class WordPicker {

    ArrayList<String> lines;

    public WordPicker(ArrayList<String> lines) {
        this.lines = lines;
    }

    public String pick() throws IOException {
        Random rand = new Random();
        int randomNumber  = rand.nextInt(lines.size()) + 1;
        return lines.get(randomNumber);
    }

    public int randomNumber() {
        Random rand = new Random();
        int randomNumber  = rand.nextInt(10) + 1;
        return randomNumber;
    }

}
