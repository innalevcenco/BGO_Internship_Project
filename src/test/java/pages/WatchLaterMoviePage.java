package pages;

public class WatchLaterMoviePage {
    private static String FIRST_MOVIE_FROM_LIST="//*[@id=\"itemList\"]/li[1]/div[4]/a";

    public static String getFirstMovieFromList() {
        return FIRST_MOVIE_FROM_LIST;
    }
}
