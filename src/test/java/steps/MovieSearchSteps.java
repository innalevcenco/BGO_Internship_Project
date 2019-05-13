package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import commonActions.CommonActions;
import pages.HomePage;
import pages.MoviePage;
import pages.MovieSearchResultPage;

public class MovieSearchSteps extends CommonActions {

    @Then("^search results are displayed$")
    public void searchresultsAreDisplayed() {
        String currentURL = MovieSearchResultPage.getFirstDisplayedMovie();
        Assert.assertNotEquals(currentURL, "");
        log.info("Search results are displayed");
    }

    @And("^user clicks on the first link$")
    public void userChoosesFirstLink() {
        click(MovieSearchResultPage.getFirstDisplayedMovie());
        log.info("First link is displayed");
    }

    @When("^user saves the title of the first displayed movie$")
    public void userSavesTheTitleOfTheFirstDisplayedMovie() {
        getText(MovieSearchResultPage.getFirstDisplayedMovieTitle());
        log.info("The title of the first displayed movie is displayed");
    }

    @When("^user clicks on 'Will watch' button from movie page$")
    public void addMovieIntoWillWatchButtonFromMoviePage() {
        click(MoviePage.getWatchLaterButton());
        log.info("'Will watch' button from movie page is displayed");
    }

    @And("^user clicks on 'Movies' button$")
    public void userClicksOnMoviesButton() {
        click(HomePage.getMoviesButton());
    }
}
