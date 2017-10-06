package hangman;

public class GameLogic {

    String validWord;

    public GameLogic(String validWord) {
        this.validWord = validWord;
    }

    public void checkLetter(String letter) {
        if (letter.length() > 1) {
            System.out.println("Dude, only one letter");
            return;
        }
        if (letter.length() == 0) {
            System.out.println("ONLY ONE LETTER!!!!1");
            return;
        }
        // logic
    }

    public void displayLetters() {
        for (int i = 0; i < validWord.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println("");
    }

}
