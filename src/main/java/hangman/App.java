package hangman;

import lt.vcs.MyFileReader;

import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException {
        MyFileReader fileReader = new MyFileReader();
        ArrayList<String> lines = fileReader.read("words.txt");
        WordPicker wordPicker = new WordPicker(lines);
    }
}
