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
        log.info("Film is displayed in the Will watch list" );
    }

    @Given("^user deletes the film from 'Will watch' list$")
    public void deleteNewAddedMoviesFromTheFolder() {
        clickOnHidenElement(NewFolderPage.getRemoveMovieFromFolder());
        log.info("The film is deleted from 'Will watch' list" );
    }

    @And("^user clicks on 'Remove' folder button$")
    public void userClicksOnRemoveFolderButton() throws AWTException {
        clickOnHidenElement(WillWatchFolderPage.getRemoveFolder());
        clickOnEnterKey();
        log.info("'Remove' folder button is clicked" );
    }
}
