package lt.vcs;

import java.util.Scanner;

/**
 * 1c. Programa leidžia įvesti skaičių nuo 0 iki 21 ir parašo skirtumą tarp šių skaičių.
 * (pvz.: 19 -> 2, 21 = 0).
 * Programa neturi leisti įvesti skaičių mažiau nei 0 ir daugiau nei 21.
 */
public class App1c {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter input");
        int i = scanner.nextInt();
        if (i >= 0 && i <= 21) {
            int k = 21 - i;
            System.out.println("Result: " + k);
        } else {
            System.out.println("Bad number :(");
        }
    }
}
