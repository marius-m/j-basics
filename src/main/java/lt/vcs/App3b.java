package lt.vcs;

/**
 * 3b. Paimti masyvą iš 3a ir atspausdinti tik
 * tuos skaičius kurie yra lyginiai.
 */
public class App3b {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 7, 11, 20, 11, 50, 55};
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0) {
                System.out.println("Number is eq: " + currentNumber);
            }
        }
    }
}
