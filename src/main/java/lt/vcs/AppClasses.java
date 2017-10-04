package lt.vcs;

public class AppClasses {

    public static void main(String[] args) {
        Movie[] lotsOfMovies = {
                new Movie("Batman", 5),
                new Movie("Twilight"),
                new Movie("Joker", 4),
                new Movie("House of cards", 3),
        };

        for (int i = 0; i < lotsOfMovies.length; i++) {
            System.out.println(
                    "My movie:"
                            + lotsOfMovies[i].getTitle()
                            + " / "
                            + lotsOfMovies[i].getRating()
            );
        }
    }
}
