package lt.vcs;

/**
 * 3c. Paimti masyvą iš 3a ir atspausdinti visų skaičių vidurkį.
 */
public class App3c {

    public static void main(String[] args) {
        double[] numbers = {4, 5, 7, 11, 20, 11, 50, 55};
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double avg = total / numbers.length;
        System.out.println("Avg: " + avg);
    }
}
