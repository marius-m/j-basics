package lt.vcs;

import java.util.Scanner;

/**
 * 2b. Parašyti programą kuri paprašytų vartotojo įvesti žodį
 * ir jį iš karto atvaizduotų, tada vėl paprašytų įvesti kitą žodį,
 * jį atvaizduotų, * ir procesą kartotų tol,
 * kol nebus įvestas žodis „pabaiga“.
 */
public class App2b {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter input");

        // 1st try
//        while (true) {
//            String word = scanner.nextLine();
//            System.out.println("Word: " + word);
//            if (word.equals("pabaiga")) {
//                break;
//            }
//        }

        // 2nd try
//        String word = scanner.nextLine();
//        while (!word.equals("pabaiga")) {
//            System.out.println("Word: " + word);
//            word = scanner.nextLine();
//        }

        // 3rd
        String word;
        do {
            word = scanner.nextLine();
            System.out.println("Word: " + word);
        } while (!word.equals("pabaiga"));
    }
}
