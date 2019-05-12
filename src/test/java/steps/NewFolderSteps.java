package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CommonActions;
import pages.MoviePage;

import java.util.concurrent.TimeUnit;

public class NewFolderSteps extends CommonActions {

    @And("^user write the movie name (.*)$")
    public void userWriteTheMovieName(String folderTitle) {
        writeText(MoviePage.getAddMovieField(), folderTitle);
    }

    @And("^user chooses first movie field under search bar$")
    public void userChoosesFirstMovie() {
        click(MoviePage.getFirstDisplayedFieldUnderSearchbar());
    }

    @And("^user clicks on the checkbox for adding movie in 'new folder' list$")
    public void userClicksOnTheCheckBoxForAddingMovieInNewFolderList() {
        click(MoviePage.getMovieCheckbox());
    }

    @And("^user clicks on the checkbox for'automatically remove watched movies'$")
    public void userClicksOnTheCheckboxForAutomaticallyRemoveWatchedMovies() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        scrollTo(MoviePage.getCheckboxForDeleteWachedmovies());
        click(MoviePage.getCheckboxForDeleteWachedmovies());
    }

    @And("^user clicks on 'Save' button$")
    public void userClicksOnSaveButton() {
        click(MoviePage.getSaveNewCreatedFolder());
    }

    @And("^user clicks on 'Remove' movie button$")
    public void userClicksOnRemoveMovieButton() {
        clickOnHidenElement(MoviePage.getRemoveMovieFromFolder());
    }
}
