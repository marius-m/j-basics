package hangman;

public class GameLogic {

    public char[] validWord;
    private char[] guessWord;

    // '\' is a special symbol and needs to be 'escaped'. So we use '\\' to print out properly.
    // Source: https://github.com/imwithye/Hangman-in-Python/blob/master/Hangman.py
    String[] hangmanDisplay = {
            "\n         _____ " +
            "\n         |   | " +
            "\n         O   | " +
            "\n        /|\\  | " +
            "\n        / \\  | " +
            "\n             | " +
            "\n     ________|_",

            "\n         _____ " +
            "\n         |   | " +
            "\n         O   | " +
            "\n        /|\\  | " +
            "\n        /    | " +
            "\n             | " +
            "\n     ________|_",
            "\n         _____ " +
            "\n         |   | " +
            "\n         O   | " +
            "\n        /|\\  | " +
            "\n             | " +
            "\n             | " +
            "\n     ________|_",
            "\n         _____ " +
            "\n         |   | " +
            "\n         O   | " +
            "\n        /|   | " +
            "\n             | " +
            "\n             | " +
            "\n     ________|_",
            "\n         _____ " +
            "\n         |   | " +
            "\n         O   | " +
            "\n         |   | " +
            "\n             | " +
            "\n             | " +
            "\n     ________|_",
            "\n         _____ " +
            "\n         |   | " +
            "\n         O   | " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n     ________|_",
            "\n         _____ " +
            "\n         |   | " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n     ________|_",
            "\n         _____ " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n     ________|_",
            "\n               " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n             | " +
            "\n     ________|_",
            "\n               " +
            "\n               " +
            "\n               " +
            "\n               " +
            "\n               " +
            "\n               " +
            "\n     ________|_",
    };

    public GameLogic(String validWord) {
        this.validWord = new char[validWord.length()];
        this.guessWord = new char[validWord.length()];
        for (int i = 0; i < validWord.length(); i++) {
            this.validWord[i] = validWord.charAt(i);
            this.guessWord[i] = '_';
        }
    }

    public boolean checkLetter(String letter) {
        if (letter.length() > 1) {
            System.out.println("Dude, only one letter");
            return false;
        }
        if (letter.length() == 0) {
            System.out.println("ONLY ONE LETTER!!!!1");
            return false;
        }
        for (int i = 0; i < validWord.length; i++) {
            char guessLetter = letter.charAt(0);
            if (validWord[i] == guessLetter) {
                guessWord[i] = guessLetter;
            }
        }
        for (int i = 0; i < validWord.length; i++) {
            if (validWord[i] != guessWord[i]) {
                return false;
            }
        }
        return true;
    }

    public void displayLetters() {
        for (int i = 0; i < guessWord.length; i++) {
            System.out.print(guessWord[i] + " ");
        }
        System.out.println("");
    }

}
