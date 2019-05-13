package steps;

import cucumber.api.java.en.And;
import commonActions.CommonActions;
import pages.MoviePage;
import pages.NewFolderPage;

import java.util.concurrent.TimeUnit;

public class NewFolderSteps extends CommonActions {

    @And("^user write the movie name (.*)$")
    public void userWriteTheMovieName(String folderTitle) {
        writeText(NewFolderPage.getAddMovieField(), folderTitle);
    }

    @And("^user chooses first movie field under search bar$")
    public void userChoosesFirstMovie() {
        click(NewFolderPage.getFirstDisplayedFieldUnderSearchbar());
    }

    @And("^user clicks on the checkbox for adding movie in 'new folder' list$")
    public void userClicksOnTheCheckBoxForAddingMovieInNewFolderList() {
        click(NewFolderPage.getMovieCheckbox());
    }

    @And("^user clicks on the checkbox for'automatically remove watched movies'$")
    public void userClicksOnTheCheckboxForAutomaticallyRemoveWatchedMovies() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        scrollTo(NewFolderPage.getCheckboxForDeleteWachedmovies());
        click(NewFolderPage.getCheckboxForDeleteWachedmovies());
    }

    @And("^user clicks on 'Save' button$")
    public void userClicksOnSaveButton() {
        click(NewFolderPage.getSaveNewCreatedFolder());
    }
}
