package lt.vcs;

import java.util.Scanner;

/**
 * 1d. Programa leidžia įvesti vardą ir skaičių.
 * Įvestas skaičius turi nurodyti raidę kuri yra žodyje.
 */
public class App1d {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter any word");
        String word = scanner.nextLine();
        System.out.println("Enter any number");
        int selectedLetterIndex = scanner.nextInt();

        if (selectedLetterIndex >= 0 && selectedLetterIndex <= word.length()) {
            char letterSelected = word.charAt(selectedLetterIndex - 1);
            System.out.println("Selected letter: " + letterSelected);
        } else {
            System.out.println("Bad index");
        }
    }
}
