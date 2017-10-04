package lt.vcs;

public class Movie {
    private String title;
    private int rating = 3;

    public Movie(String movieTitle, int movieRating) {
        title = movieTitle;
        rating = movieRating;
    }

    public Movie(String movieTitle) {
        title = movieTitle;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        }
    }

    public int getRating() {
        return rating;
    }
}
