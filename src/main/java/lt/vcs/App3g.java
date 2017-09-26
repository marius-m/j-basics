package lt.vcs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 3g. Sukurti masyvą ir jį užpildyti Fibonaci skaičių seka.
 * (0 1 1 2 3 5 8 13 21 34)
 */
public class App3g {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first number");
        int first = scanner.nextInt();
        System.out.println("Enter second number");
        int second = scanner.nextInt();
        System.out.println("Enter array length");
        int arrayLength = scanner.nextInt();

        int[] array = new int[arrayLength];
        array[0] = first;
        array[1] = second;

        for (int i = 2; i < arrayLength; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println("Array: " + Arrays.toString(array));
    }
}
