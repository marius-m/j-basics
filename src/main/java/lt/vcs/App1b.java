package lt.vcs;


import java.util.Scanner;

/**
 * 1b. Programa leidžia įvesti vartotojo varda
 * ir jį atspausdina 5 kartus.
 */
public class App1b {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter input");
        String input = scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println("Output: " + input);
        }
    }
}
