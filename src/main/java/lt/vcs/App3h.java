package lt.vcs;

import java.util.Scanner;

/**
 * 3h. Suskaičiuoti kiek yra masyve kiekvieno elemento pasikartojimų
 * (pvz.: (1, 2, 2, 3) -> 1=1, 2=2, 3=1)
 */
public class App3h {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array1 = { 0, 2, 2, 3, 2, 4, 4, 20 };

        int maxNumber = maxNumber(array1);

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

    public static int maxNumber(int[] anyArray) {
        int maxNumber = 0;
        for (int i = 0; i < anyArray.length; i++) {
            if (maxNumber < anyArray[i]) {
                maxNumber = anyArray[i];
            }
        }
        return maxNumber;
    }

}
