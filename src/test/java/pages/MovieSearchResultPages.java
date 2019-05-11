package pages;


public class MovieSearchResultPages {
    private static final String FIRST_DISPLAYED_MOVIE = "//*[@id='block_left_pad']/div/div[2]/div/div[2]/p/a";
    private static final String LOST_MOVIE_DETAILS = "https://www.kinopoisk.ru/film/104122/";
    private static final String BEAST_MOVIE_DETAILS = "https://www.kinopoisk.ru/film/996062/";
    private static final String MOVIES_BUTTON = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/div/div[2]/div/ul/div[2]/li[1]/a/div";
    private static final String MOVIE_NOTE_BUTTON = "//*[@id='viewFilmInfoWrapper']/ul[1]/li[3]";
    private static final String MOVIE_NOTE_FIELD = "//*[@id='ta_film_notice']/form/textarea";
    private static final String BADCOMEDIAN_MOVIE_DETAILS = "https://www.kinopoisk.ru/film/972889/";
    private static final String SAVE_NOTE_BUTTON = "//*[@id='btn_film_notice']";

    public static String getFirstDisplayedMovie() {
        return FIRST_DISPLAYED_MOVIE;
    }

    public static String getLostMovieDetails() {
        return LOST_MOVIE_DETAILS;
    }

    public static String getBeastMovieDetails() {
        return BEAST_MOVIE_DETAILS;
    }

    public static String getMoviesButton() { return MOVIES_BUTTON; }

    public static String getMovieNoteButton() { return MOVIE_NOTE_BUTTON; }

    public static String getBadcomedianMovieDetails() { return BADCOMEDIAN_MOVIE_DETAILS; }

    public static String getSaveNoteButton() { return SAVE_NOTE_BUTTON; }

    public static String getMovieNoteField() { return MOVIE_NOTE_FIELD; }
}
