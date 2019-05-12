package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonActions;
import pages.MoviePage;

import java.util.concurrent.TimeUnit;


public class MovieSteps extends CommonActions {
    MovieSearchResultPages movieSearchResultPages;
//    public String movieTitle = "";

    @And("^user clicks on 'create folder' button$")
    public void userClicksOnNewFolderButton() {
        click(MoviePage.getCreateNewFolder());
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
        click(MoviePage.getFirstCreatedFolder());
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
        scrollTo(MoviePage.getCheckboxForDeleteWachedmovies());
        click(MoviePage.getCheckboxForDeleteWachedmovies());
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

    @Given("^new added film is displayed in the Will watch list$")
    public void checkNewAddedFilmIsDisplayed() {
//        getText ( movieSearchResultPages.getFirstDisplayedMovie());
//        Assert.assertTrue ( getText ( UserFolders.getFirstDisplayedMovie()).equalTo ( movieSearchSteps.movieTitle ) );
        System.out.println("should add an assert");
    }

    @Given("^the films are deleted from 'Will watch' list$")
    public void deleteNewAddedMoviesFromTheFolder() {
        if(MoviePage.getRemoveMovieFromFolder() != null) {
            click(MoviePage.getRemoveMovieFromFolder());
        }
        else refresh();
    }

    @When("^user clicks on 'Note' folder$")
    public void clickOnNoteFolder() {
        click(MoviePage.getNoteFolder());
    }


    @Then("^the new comment is displayed on the 'Note' folder$")
    public void moviePageIsDisplayed(){
        System.out.println("Have to add an Assert");
    }

}
