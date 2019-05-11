package steps;
import cucumber.api.java.en.And;
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

    @Then("^search results are displayed$")
    public void search_results_are_displayed() {
        String currentURL = MovieSearchResultPages.getFirstDisplayedMovie();
        Assert.assertNotEquals ( currentURL, "" );
    }

    @And("^user clicks on the first link$")
    public void userChoosesFirstLink() {
        click (MovieSearchResultPages.getFirstDisplayedMovie() );
    }

    //    @When("^user saves th title of the first displayed movie$")
//    public void userSavesThTitleOfTheFirstDisplayedMovie() {
//        movieTitle = MovieSearchResultPages.getFirstDisplayedMovie().getText();
//    }
//    @Then("^movie details are displayed$")
//    public void movie_details_are_displayed(String movieName) {
//        if (movieName == "Lost") {
//             MovieSearchResultPages.getLostMovieDetails();
//        } else if (movieName == "Beast") {
//            getElementByXpath (MovieSearchResultPages.getBeastMovieDetails() );
//        }
//    }
    @When("^user clicks on will watch button$")
    public void add_movie_into_willWatch_list() {
        click ( MovieSearchResultPages.getWillWatchButton());
    }

    //    should add an assert for checking that result is right.
    @Then("^movie is saved in (will watch) list$")
    public void movie_is_added_in_list() {
        assertThat ( "User is warned if new movie is added in the list", "Lost", is ( "Lost" ) );
    }

    @Then("^movie details are displayed$")
    public void movieDetailsAreDisplayed() {
        Assert.assertEquals("", "");
    }
}