package lt.vcs;

import java.util.Random;
import java.util.Scanner;

/**
 * 6a. Sukurti žaidimą kurio tikslas atspėti skaičių nuo 1 iki 10.
 * Kaskart spėjant skaičių ir neatspėjus yra generuojamas naujas skaičius.
 * Žaidimas baigiasi kuomet skaičius yra atspėjamas arba vartotojas
 * kaip spėjamą skaičių įveda 0.
 */
public class App6a {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int userInput;
        int randomNumber;

        do {
            userInput = scanner.nextInt();
            randomNumber = randomNumber();
            if (userInput == 0) {
                break;
            }
            if (randomNumber == userInput) {
                System.out.println("You won");
                break;
            } else {
                System.out.println("You lost");
            }
        } while (true);

    }

    public static int randomNumber() {
        Random rand = new Random();
        int randomNumber  = rand.nextInt(10) + 1;
        return randomNumber;
    }

}
