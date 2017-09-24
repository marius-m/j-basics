package lt.vcs;

import java.util.Scanner;

/**
 * 1a. Programa leidžia įvesti vartotojui
 * norimą skaičių ir pasako ar jis teigiamas ar neigiamas
 */
public class App1a {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter input");
        int i = scanner.nextInt();
        if (i > 0) {
            System.out.println("Skaicius teigiamas");
        } else if (i < 0) {
            System.out.println("Skaicius neigiamas");
        } else {
            System.out.println("Skaicius = 0");
        }
    }
}
