package lt.vcs;

/**
 * 15a. Parašyti metodą kuris per parametrus pasiimtų sąrašą
 * su žodžiais ir grąžintų tekstą kuriame apjungti visi žodžiai.
 */
public class App15a {

    public static String[] words = {
            "Jonas",
            "Petras",
            "Remis"
    };

    public static void main(String[] args) {
        Words myWords1 = new Words();
        System.out.println(myWords1.joiner("", words));
    }
}
