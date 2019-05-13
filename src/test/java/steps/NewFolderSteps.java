package steps;

import commonActions.CommonActions;
import cucumber.api.java.en.And;
import pages.NewFolderPage;

import java.util.concurrent.TimeUnit;

public class NewFolderSteps extends CommonActions {

    @And("^user write the movie name (.*)$")
    public void userWriteTheMovieName(String folderTitle) {
        writeText(NewFolderPage.getAddMovieField(), folderTitle);
        log.info("The movie is displayed" );
    }

    @And("^user chooses first movie field under search bar$")
    public void userChoosesFirstMovie() {
        click(NewFolderPage.getFirstDisplayedFieldUnderSearchbar());
        log.info("first movie field under search bar is selected" );
    }

    @And("^user clicks on the checkbox for adding movie in 'new folder' list$")
    public void userClicksOnTheCheckBoxForAddingMovieInNewFolderList() {
        click(NewFolderPage.getMovieCheckbox());
        log.info("The checkbox for adding movie in 'new folder' list is clicked" );
    }

    @And("^user clicks on the checkbox for'automatically remove watched movies'$")
    public void userClicksOnTheCheckboxForAutomaticallyRemoveWatchedMovies() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        scrollTo(NewFolderPage.getCheckboxForDeleteWachedmovies());
        click(NewFolderPage.getCheckboxForDeleteWachedmovies());
        log.info("the checkbox for'automatically remove watched movies is clicked" );
    }

    @And("^user clicks on 'Save' button$")
    public void userClicksOnSaveButton() {
        click(NewFolderPage.getSaveNewCreatedFolder());
        log.info("'Save' button is clicked" );
    }
}
