package lt.vcs;

import java.util.Scanner;

/**
 * 16a. Parašyti klasę ir metodą kuris per parametrus pasiimtų
 * tekstą ir per grąžinamą reikšmę praneštų ar jame yra žodis “labas”.
 */
public class App16a {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        WordUtility wordUtility = new WordUtility();
        System.out.println("Please enter word:");
        String inputWord = scanner.nextLine();
        System.out.println("Please enter word to be checked");
        String wordToBeChecked = scanner.nextLine();

        boolean isWordInside = wordUtility.isWordInside(inputWord, wordToBeChecked);
        if (isWordInside) {
            System.out.println("Our word has '" + wordToBeChecked + "' in it");
        } else {
            System.out.println("Our word does not have '" + wordToBeChecked + "' in it");
        }

    }
}
