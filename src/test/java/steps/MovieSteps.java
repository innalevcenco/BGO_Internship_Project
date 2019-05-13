package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import commonActions.CommonActions;
import org.junit.Assert;
import pages.MoviePage;
import pages.MovieSearchResultPage;


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

    @And("^user fills 'Note' field with: (.*)$")
    public void addNote(String note) {
        writeText(MovieSearchResultPage.getMovieNoteField(), note);
    }

    @Then("^the (.*) movie is saved in the created folder$")
    public void allModificationsAreSavedInTheBestMovieFolder(String movieTitle) {
        Assert.assertTrue("The movie is not displayed", getText(MovieSearchResultPage.getFirstDisplayedMovieTitle()).contains(movieTitle));
    }

    @When("^(.*) is added to the movie$")
    public void addNewCommentToTheMovie(String note) {
        Assert.assertTrue("New added note is not displayed", getText(MoviePage.getMovieComment()).contains(note));
    }
}
