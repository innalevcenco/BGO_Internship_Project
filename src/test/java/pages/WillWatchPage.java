package pages;

import hooks.StepHooks;
import org.openqa.selenium.WebDriver;

public class WillWatchPage {
    private static final String MOVIE_TITLE = "//*[@class='info']/span";
    public WebDriver driver = StepHooks.getDriver();

    public static String getMovieTitle() {
        return MOVIE_TITLE;
    }
}