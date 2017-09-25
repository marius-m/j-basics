package lt.vcs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3d. Parašyti programą, kuri paprašytų įvesti 5 skaičius.
 * Baigus skaičių įvedimą, turi būti atvaizduojama įvestų
 * skaičių suma ir visi įvesti skaičiai.
 */
public class App3d {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number with index: " + i);
            array[i] = scanner.nextInt();
            total += array[i];
        }
        System.out.println("Sum: " + total);
        System.out.println("All elements: " + Arrays.toString(array));
    }
}
