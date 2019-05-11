package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieSearchSteps extends CommonActions {
    MovieSearchResultPages movieSearchResultPages;
    public String movieTitle = "";


    @Then("^search results are displayed$")
    public void searchresultsAreDisplayed() {
        String currentURL = MovieSearchResultPages.getFirstDisplayedMovie();
        Assert.assertNotEquals ( currentURL, "" );
    }

    @And("^user clicks on the first link$")
    public void userChoosesFirstLink() {
        click ( MovieSearchResultPages.getFirstDisplayedMovie() );
    }

//    @When("^user saves th title of the first displayed movie$")
//    public void userSavesThTitleOfTheFirstDisplayedMovie() {
//        movieTitle = MovieSearchResultPages.getFirstDisplayedMovie().getText();
//        driver.getTitle();
//    }

//    @Then("^movie details are displayed$")
//    public void movie_details_are_displayed(String movieName) {
//        if (movieName == "Lost") {
//             MovieSearchResultPages.getLostMovieDetails();
//        } else if (movieName == "Beast") {
//            getElementByXpath (MovieSearchResultPages.getBeastMovieDetails() );
//        }
//    }

    @When("^user clicks on 'Will watch' button from movie page$")
    public void addMovieIntoWillWatchButtonFromMofiePage() {
        click (MoviePage.getWatchLaterButton());
    }

    @Then("^movie details are displayed$")
    public void movieDetailsAreDisplayed() {
        Assert.assertEquals("", "");

    }

    @And("^user clicks on 'Movies' button$")
    public void userClicksOnMoviesButton() {
        click (HomePage.getMoviesButton());
    }
}
