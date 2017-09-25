package lt.vcs;

/**
 * 3a. Turim masyvą skaičių [4, 5, 7, 11, 20, 11, 50, 55].
 * Programa turi išvesti šių skaičių sumą.
 */
public class App3a {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 7, 11, 20, 11, 50, 55};
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("Total: " + total);
    }
}
