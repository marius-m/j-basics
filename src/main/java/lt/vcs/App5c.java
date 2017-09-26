package lt.vcs;

import java.util.Scanner;

/**
 * 4b. Paprašyti vartotojo nurodyti kiek skaičių jis ketina įvesti,
 * tuomet duoti jam įvesti tiek skaičių, kiek jis pasirinko.
 * Po įvedimo atvaizduoti tik tuos skaičius kurie buvo didesni nei 100.
 *
 * 5c. Realizuoti 4b užduotį panaudojant metodą kurio
 * parametras būtų vartotojo įvestų skaičių masyvas ir skaičių
 * didesnių nei 100 atvaizdavimas vyktų pačiame metode.
 */
public class App5c {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter number of input");
        int numberCount = scanner.nextInt();
        int[] numbers = new int[numberCount];
        for (int i = 0; i < numberCount; i++) {
            System.out.println("Please enter input");
            numbers[i] = scanner.nextInt();
        }

        // Outputting numbers bigger than 100
        printNumbersBiggerThan100(numbers);
    }

    public static void printNumbersBiggerThan100(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                System.out.println("Number " + array[i] + " is bigger than 100");
            }
        }
    }

}
