package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonActions;
import pages.MoviePage;
import pages.MyProfilePage;

import java.util.concurrent.TimeUnit;

public class MovieSteps extends CommonActions {

    @Given("^new added film is displayed in the Will watch list$")
    public void checkNewAddedFilmIsDisplayed() {
//        Assert.assertTrue ( getText ( UserFolders.getFirstDisplayedMovie()).equals ( movieSearchSteps.movieTitle ) );
    }

    @And("^user clicks on 'create folder' button$")
    public void userClicksOnNewFolderButton() {
        click(MyProfilePage.getCreateNewFolder());
    }

    @And("^user write the movie name (.*)$")
    public void userWriteTheMovieNameTheBestMovies(String folderTitle) {
        writeText(MoviePage.getAddMovieField(), folderTitle);
    }

    @Then("^the new folder is displayed$")
    public void theNewFolderIsDisplayed() {
//        Should write an assert
        System.out.println("Should write an assert");
    }

    @When("^user clicks on the created 'New folder'$")
    public void userClicksOnTheNewCreatedFolder() {
        click(MyProfilePage.getFirstCreatedFolder());
    }

    @And("^user chooses first movie field under search bar$")
    public void userChoosesFirstMovie() {
        click(MoviePage.getFirstDisplayedFieldUnderSearchbar());
    }

    @And("^user clicks on the check mark for adding movie in 'new folder' list$")
    public void userClicksOnTheCheckMarkForAddingMovieInNewFolderList() {
        click(MoviePage.getMovieCheckbox());
    }

    @And("^user clicks on the check mark for'automatically remove watched movies'$")
    public void userClicksOnTheCheckMarkForAutomaticallyRemoveWatchedMovies() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        scrollTo(MoviePage.getMovieCheckboxForDeleteWachedmovies());
        click(MoviePage.getMovieCheckboxForDeleteWachedmovies());
    }

    @And("^user clicks on 'Save' button$")
    public void userClicksOnSaveButton() {
        click(MoviePage.getSaveNewCreatedFolder());
    }

    @Then("^all modifications are saved in 'New folder'$")
    public void allModificationsAreSavedInTheBestMovieFolder() {
        //should add an assert
        System.out.println("should add an assert");
    }
}
