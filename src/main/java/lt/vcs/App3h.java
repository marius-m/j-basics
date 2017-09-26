package lt.vcs;

import java.util.Arrays;

/**
 * 3h. Suskaičiuoti kiek yra masyve kiekvieno elemento pasikartojimų
 * (pvz.: (1, 2, 2, 3) -> 1=1, 2=2, 3=1)
 */
public class App3h {

    public static void main(String[] args) {
        int[] array1 = { 0, 2, 2, 3, 2, 4, 4, 20 };

        int maxNumber = 0;
        for (int i = 0; i < array1.length; i++) {
            if (maxNumber < array1[i]) {
                maxNumber = array1[i];
            }
        }

        int[] count = new int[maxNumber + 1];
        for (int i = 1; i < array1.length; i++) {
            int number = array1[i];
            count[number] = count[number] + 1;
        }

        for (int i = 0; i < count.length; i++) {
            int number = i;
            int numberCount = count[i];
            if (numberCount == 0) {
                continue;
            }
            System.out.println("Number " + number + " has occured " + numberCount + " times.");
        }
    }
}
