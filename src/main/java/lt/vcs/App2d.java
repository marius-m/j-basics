package lt.vcs;

/**
 * 2d. Parašyti programa kuri praeitų skaičius nuo 2000 iki 3200 ir
 * atspausdintų tuos skaičius, kurie dalinasi iš 7 be liekanos,
 * ir nesidalina iš 5.
 */
public class App2d {

    public static void main(String[] args) {
        for (int i = 2000; i <= 3200; i++) {
            if (i % 7 == 0 && i % 5 > 0) {
                System.out.println(
                        "Number divides from 7, and does not from 5: " + i
                );
            }
        }
    }
}
