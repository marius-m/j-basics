package lt.vcs;

import java.util.Scanner;

/**
 * 3e. Parašyti programą kuri paprašytų vartotojo įvesti 5 žodžius.
 * Po to kai bus įvesti visi žodžiai, jie turi būti atvaizduojami.
 */
public class App3e {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.nextLine();
        }

        for (String word : words) {
            System.out.println("Word: " + word);
        }
    }
}
