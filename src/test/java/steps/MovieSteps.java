package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonActions;
import pages.MoviePage;
import pages.MovieSearchResultPages;


public class MovieSteps extends CommonActions {

    @And("^user clicks on 'create folder' button$")
    public void userClicksOnNewFolderButton() {
        click(MoviePage.getCreateNewFolder());
    }

    @When("^user clicks on 'Note' folder$")
    public void clickOnNoteFolder() {
        click(MoviePage.getNoteFolder());
    }

    @When("^user clicks on the created 'New folder'$")
    public void userClicksOnTheNewCreatedFolder() {
        click(MoviePage.getFirstCreatedFolder());
    }

    @Then("^the (.*) movie is saved in the created folder$")
    public void allModificationsAreSavedInTheBestMovieFolder(String movieTitle) {
        assertIsTrue("The movie is not displayed", getText(MovieSearchResultPages.getFirstDisplayedMovieTitle()).contains(movieTitle));
    }

    @Then("^(.*) is added to the movie$")
    public void newCommentIsAddedToTheMovie(String note) {
        assertIsTrue("New added note is not displayed", getText(MoviePage.getMovieComment()).contains(note));
    }
}
