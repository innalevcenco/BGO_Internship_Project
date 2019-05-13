package pages;

import hooks.StepHooks;
import org.openqa.selenium.WebDriver;

public class WillWatchFolderPage {
    private static final String MOVIE_TITLE = "//*[@class='info']/span";
    private static String FIRST_MOVIE_FROM_LIST = "//*[@id='itemList']/li[1]/div[4]/a";
    private static final String REMOVE_FOLDER = "//*[@id='folder_10291']/div";
    public WebDriver driver = StepHooks.getDriver();

    public static String getFirstMovieFromList() {
        return FIRST_MOVIE_FROM_LIST;
    }

    public static String getMovieTitle() {
        return MOVIE_TITLE;
    }

    public static String getRemoveFolder() {
        return REMOVE_FOLDER; }
}