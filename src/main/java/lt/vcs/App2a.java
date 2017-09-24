package lt.vcs;

import java.util.Scanner;

/**
 * 2a. Programa kur leidžia įvesti skaičių ir atspausdina
 * visus likusius skaičius iki 100.
 */
public class App2a {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number");
        int i = scanner.nextInt();
        if (i > 0 && i <= 100) {
//            while (i < 100) {
//                i++;
//                System.out.println("i = " + i);
//            }
            for (int k = (i + 1); k <= 100; k++) {
                System.out.println("k = " + k);
            }
        } else {
            System.out.println("Bad number");
        }
    }
}
