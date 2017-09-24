package lt.vcs;

import java.util.Scanner;

/**
 * 2c. Parašyti programą, kuri paprašytų vesti skaičius tol,
 * kol bus įvestas skaičius 0. Pabaigoje turi būti atvaizduojama
 * įvestų skaičių suma.
 */
public class App2c {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 1st
//        int sum = 0;
//        System.out.println("Enter number");
//        int i = scanner.nextInt();
//        while (i != 0) {
//            sum = sum + i;
//            System.out.println("Enter number");
//            i = scanner.nextInt();
//        }
//        System.out.println("Sum = " + sum);

        // 2nd
        int sum = 0;
        int i = 0;
        do {
            sum = sum + i;
            System.out.println("Enter number");
            i = scanner.nextInt();
        } while (i != 0);
        System.out.println("Sum = " + sum);

    }
}
