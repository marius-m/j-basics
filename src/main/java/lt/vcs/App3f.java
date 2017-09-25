package lt.vcs;

import java.util.Scanner;

/**
 * 3f. Sukurti dvimatį masyvą kurio x ir y ašys būtų nuo 0 iki 10.
 * Programa priima iš vartotojo x ir y indeksus ir
 * atspausdina skaičių saugomą toje pozicijoje.
 */
public class App3f {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[][] array = new int[3][3];
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        // Saving new input
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.println("Enter input");
//                array[i][j] = scanner.nextInt();
//            }
//        }

        // Printing out values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("array[" + i + "][" + j + "] = " + array[i][j]);
            }
        }

        // Getting out values
        System.out.println("Enter index x");
        int x = scanner.nextInt();
        System.out.println("Enter index y");
        int y = scanner.nextInt();

        System.out.println("Value: " + array[x][y]);
    }
}
