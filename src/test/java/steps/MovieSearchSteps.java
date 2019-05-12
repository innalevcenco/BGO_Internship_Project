package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CommonActions;
import pages.HomePage;
import pages.MoviePage;
import pages.MovieSearchResultPages;

public class MovieSearchSteps extends CommonActions {
    public String movieTitle = "";
    MovieSearchResultPages movieSearchResultPages;

    @Then("^search results are displayed$")
    public void searchresultsAreDisplayed() {
        String currentURL = MovieSearchResultPages.getFirstDisplayedMovie();
        Assert.assertNotEquals(currentURL, "");
    }

    @And("^user clicks on the first link$")
    public void userChoosesFirstLink() {
        click(MovieSearchResultPages.getFirstDisplayedMovie());
    }

    @When("^user saves the title of the first displayed movie$")
    public void userSavesThTitleOfTheFirstDisplayedMovie() {
        movieTitle = getText(movieSearchResultPages.getFirstDisplayedMovieTitle());
    }

    @When("^user clicks on 'Will watch' button from movie page$")
    public void addMovieIntoWillWatchButtonFromMofiePage() {
        click(MoviePage.getWatchLaterButton());
    }

    @Then("^movie details are displayed$")
    public void movieDetailsAreDisplayed() {
        Assert.assertEquals("", "");

    }

    @And("^user clicks on 'Movies' button$")
    public void userClicksOnMoviesButton() {
        click(HomePage.getMoviesButton());
    }
}
