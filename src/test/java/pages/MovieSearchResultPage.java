package pages;

public class MovieSearchResultPage {
    private static final String FIRST_DISPLAYED_MOVIE = "//*[@id='block_left_pad']/div/div[2]/div/div[2]/p/a";
    private static final String FIRST_DISPLAYED_MOVIE_TITLE = "//*[@id='film_535341']/div[4]/span[1]";
    private static final String MOVIE_NOTE_BUTTON = "//*[@id='viewFilmInfoWrapper']/ul[1]/li[3]";
    private static final String MOVIE_NOTE_FIELD = "//*[@id='ta_film_notice']/form/textarea";
    private static final String SAVE_NOTE_BUTTON = "//*[@value='сохранить']";


    public static String getFirstDisplayedMovieTitle() {
        return FIRST_DISPLAYED_MOVIE_TITLE;
    }

    public static String getFirstDisplayedMovie() {
        return FIRST_DISPLAYED_MOVIE;
    }

    public static String getMovieNoteButton() {
        return MOVIE_NOTE_BUTTON;
    }

    public static String getSaveNoteButton() {
        return SAVE_NOTE_BUTTON;
    }

    public static String getMovieNoteField() {
        return MOVIE_NOTE_FIELD;
    }
}
