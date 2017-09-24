package lt.vcs;

import java.util.Scanner;

/**
 * 1e. Programa leidžia įvesti žodį ir parašo
 * ar jis prasideda fraze "foo"
 */
public class App1e {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter input");
        String word = scanner.nextLine();
        if (word.startsWith("foo")) {
            System.out.println("Starts with foo");
        } else {
            System.out.println("No foo");
        }
    }
}
