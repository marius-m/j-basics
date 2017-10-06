package hangman;

import lt.vcs.MyFileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class WordPicker {

    ArrayList<String> lines;

    public WordPicker(ArrayList<String> lines) {
        this.lines = lines;
        if (lines.size() == 0) {
            throw new IllegalStateException("No elements");
        }
    }

    public String pick(int i) throws IOException {
        if (i < 0) {
            return lines.get(0);
        }
        if (i >= lines.size()) {
            return lines.get(lines.size() - 1);
        }
        return lines.get(i);
    }

    public int randomNumber() {
        Random rand = new Random();
        int randomNumber  = rand.nextInt(10) + 1;
        return randomNumber;
    }

}
