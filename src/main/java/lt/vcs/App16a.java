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

        boolean isLabasInside = wordUtility.isLabasInside(inputWord);
        if (isLabasInside) {
            System.out.println("Our word has 'labas' in it");
        } else {
            System.out.println("Our word does not have 'labas' in it");
        }

    }
}
