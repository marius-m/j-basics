package lt.vcs;

/**
 * 15b. Parašyti metodą kuris per parametrus pasiimtų
 * sąrašą su žodžiais ir grąžintų tekstą kuriame apjungti
 * visi žodžiai prasidedantys raide ‘A’.
 */
public class App15b {

    public static String[] words = {
            "Jonas",
            "Petras",
            "Azija",
            "Remis",
            "Antanas",
    };

    public static void main(String[] args) {
        Words myWords = new Words();
        System.out.println(myWords.joiner("A", words));
    }
}
