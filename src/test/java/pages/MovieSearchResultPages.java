package pages;

public class MovieSearchResultPages {

    private static final String FIRST_DISPLAYED_MOVIE = "//*[@id='block_left_pad']/div/div[2]/div/div[2]/p/a";
    private static final String LOST_MOVIE_DETAILS = "https://www.kinopoisk.ru/film/104122/";
    private static final String BEAST_MOVIE_DETAILS = "https://www.kinopoisk.ru/film/996062/";
    private static final String WILL_WATCH_BUTTON = "//*[@id='select_104122']/span[1]/b";

    public static String getFirstDisplayedMovie() {
        return FIRST_DISPLAYED_MOVIE;
    }

    public static String getLostMovieDetails() {
        return LOST_MOVIE_DETAILS;
    }

    public static String getBeastMovieDetails() {
        return BEAST_MOVIE_DETAILS;
    }

    public static String getWillWatchButton() {
        return WILL_WATCH_BUTTON;
    }

    public MovieSearchResultPages() {
    }
}