package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CommonActions;
import pages.MovieSearchResultPages;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieSearchSteps extends CommonActions {
    MovieSearchResultPages movieSearchResultPages;
    public String movieTitle = "";
//    public MovieSearchSteps(WebDriver driver, WebDriverWait wait) {
//        super ( driver, wait );
//    }
//    should work on this method
//    @Then("^search results are displayed$")
//    public void search_results_are_displayed() {
//        String currentURL = movieSearchResultPages.getFIRST_DISPLAYED_MOVIE ();
//        Assert.assertNotEquals ( currentURL, "" );
//    }
//
//    @When("^user clicks on the first (link) movie$")
//    public void userChoosesMovie() {
//        click ( movieSearchResultPages.getFIRST_DISPLAYED_MOVIE () );
//    }
//
//    @When("^user saves th title of the first displayed movie$")
//    public void userSavesThTitleOfTheFirstDisplayedMovie() {
//        movieTitle = getText ( movieSearchResultPages.getFIRST_DISPLAYED_MOVIE () );
//    }
//
//    @Then("^movie details are displayed$")
//    public void movie_details_are_displayed(String movieName) {
//        if (movieName == "Lost") {
//            getElementByXpath ( movieSearchResultPages.getLOST_MOVIE_DETAILS () );
//        } else if (movieName == "Beast") {
//            getElementByXpath ( movieSearchResultPages.getBEAST_MOVIE_DETAILS () );
//        }
//    }
//
//    @When("^user clicks on (will watch) button for adding the movie in (Буду смотреть) list$")
//    public void add_movie_into_willWatch_list() {
//        click ( movieSearchResultPages.getБуду_смотреть_BUTTON () );
//    }
//
//    //    should add an assert for checking that result is right.
//    @Then("^movie is saved in (Буду смотреть) list$")
//    public void movie_is_added_in_list() {
//        assertThat ( "User is warned if new movie is added in the list", "Lost", is ( "Lost" ) );
//
//    }
}
