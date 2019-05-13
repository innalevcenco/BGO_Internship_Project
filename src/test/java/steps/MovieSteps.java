package steps;

import commonActions.CommonActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MoviePage;
import pages.MovieSearchResultPage;


public class MovieSteps extends CommonActions {

    @And("^user clicks on 'create folder' button$")
    public void userClicksOnNewFolderButton() {
        click(MoviePage.getCreateNewFolder());
        log.info("'Create folder' button is displayed" );
    }

    @When("^user clicks on 'Note' folder$")
    public void clickOnNoteFolder() {
        click(MoviePage.getNoteFolder());
        log.info("'Note' folder is displayed" );
    }

    @When("^user clicks on the created 'New folder'$")
    public void userClicksOnTheNewCreatedFolder() {
        click(MoviePage.getFirstCreatedFolder());
        log.info("New created folder is displayed" );
    }

    @And("^user fills 'Note' field with: (.*)$")
    public void addNote(String note) {
        writeText(MovieSearchResultPage.getMovieNoteField(), note);
        log.info("'Note' field is filled" );
    }

    @Then("^the (.*) movie is saved in the created folder$")
    public void allModificationsAreSavedInTheBestMovieFolder(String movieTitle) {
        Assert.assertTrue("The movie is not displayed", getText(MovieSearchResultPage.getFirstDisplayedMovieTitle()).contains(movieTitle));
        log.info("The created folder is saved" );
    }

    @When("^(.*) is added to the movie$")
    public void addNewCommentToTheMovie(String note) {
        Assert.assertTrue("New added note is not displayed", getText(MoviePage.getMovieComment()).contains(note));
        log.info("The created folder is saved" );
    }
}
