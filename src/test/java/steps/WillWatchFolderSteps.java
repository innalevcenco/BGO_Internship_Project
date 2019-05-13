package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import commonActions.CommonActions;
import org.junit.Assert;
import pages.MoviePage;
import pages.NewFolderPage;
import pages.WillWatchFolderPage;

import java.awt.*;

public class WillWatchFolderSteps extends CommonActions {

    @Given("^(.*) film is displayed in the Will watch list$")
    public void checkNewAddedFilmIsDisplayed(String movieTitle) {
        Assert.assertTrue("The movie is not displayed", getText(WillWatchFolderPage.getMovieTitle()).contains(movieTitle));
    }

    @Given("^user deletes the film from 'Will watch' list$")
    public void deleteNewAddedMoviesFromTheFolder() {
        clickOnHidenElement(NewFolderPage.getRemoveMovieFromFolder());
    }

    @And("^user clicks on 'Remove' folder button$")
    public void userClicksOnRemoveFolderButton() throws AWTException {
        clickOnHidenElement(WillWatchFolderPage.getRemoveFolder());
        clickOnEnterKey();
    }
}
