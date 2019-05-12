package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.CommonActions;
import pages.MoviePage;
import pages.WillWatchPage;

import java.awt.*;

public class WillWatchFolderSteps extends CommonActions {

    @Given("^(.*) film is displayed in the Will watch list$")
    public void checkNewAddedFilmIsDisplayed(String movieTitle) {
        assertIsTrue("The movie is not displayed", getText(WillWatchPage.getMovieTitle()).contains(movieTitle));
    }

    @Given("^user deletes the film from 'Will watch' list$")
    public void deleteNewAddedMoviesFromTheFolder() {
        clickOnHidenElement(MoviePage.getRemoveMovieFromFolder());
    }

    @And("^user clicks on 'Remove' folder button$")
    public void userClicksOnRemoveFolderButton() throws AWTException {
        clickOnHidenElement(MoviePage.getRemoveFolder());
        clickOnEnterKey();
    }
}
