package lt.vcs;

import java.util.Scanner;

/**
 * 14a. Parašyti metodą kuris per parametrus pasiimtų tekstą
 * ir per grąžinamą reikšmę praneštų ar šiame tekste yra skaičių.
 */
public class App14a {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        NumberHandler numberHandler1 = new NumberHandler();
        String randomString = scanner.nextLine();
        if (numberHandler1.checkNumber(randomString)) {
            System.out.println("We have a number");
        } else {
            System.out.println(":( No number");
        }

    }

}
