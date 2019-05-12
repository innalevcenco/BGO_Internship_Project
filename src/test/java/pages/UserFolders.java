package pages;

public class UserFolders {

    private static final String FIRST_DISPLAYED_MOVIE = "//*[@id=\"film_542484\"]/div[4]/a";

    public static String getFirstDisplayedMovie() {
        return FIRST_DISPLAYED_MOVIE;
    }

    public UserFolders() {
    }
}
