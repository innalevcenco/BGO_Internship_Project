package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdvancedFilterPage;
import pages.CommonActions;
import pages.HomePage;
import pages.RandomSearchPage;
import pages.MoviePage;

public class RandomMovieSearchSteps extends CommonActions{

    private RandomSearchPage randomSearchPage = new RandomSearchPage();
    private MoviePage moviePage= new MoviePage();

    @Given("^user accesses the random movie search feature$")
    public void userAccessesTheRandomMovieSearchFeature() {
        click(HomePage.getRandSearchButton());
        log.info("user accesses random movie search feature");
    }

    @And("^user adds a country$")
    public void userAddsACountry() {
        click(randomSearchPage.getChooseCountry());
        click(randomSearchPage.generateRandomCountry());
        log.info("user adds a random country");
    }

    @And("^user adds a genre$")
    public void userAddsAGenre() {
        click(randomSearchPage.getChooseGenre());
        click(randomSearchPage.generateRandomGenre());
        //click again on the genre title so the list will dissapear
        click(randomSearchPage.getChooseGenre());
        log.info("user adds a random genre");
    }

    @And("^user chooses a period of years$")
    public void userChoosesAPeriodOfYears() {
        randomSearchPage.chooseRandomFirstAndLastYear();
        log.info("user adds a period of years");

    }

    @Then("^user clicks on random movie search button$")
    public void userClicksOnTheSearchButton() {
        randomSearchPage.clickFindMovieButton();
        log.info("user clicks on random movie search button");
    }

    @Then("^movie is displayed$")
    public void movieIsDisplayed() {

        waitVisibility(randomSearchPage.getFoundMovieTitle());
        boolean exists= randomSearchPage.isMovieFound();
        assertIsTrue("Step failed: Movie was not found",exists);
        log.info("movie is displayed");
    }

    @And("^user clicks on the movie title$")
    public void userClicksOnTheMovieTitle(){
        click(randomSearchPage.getFoundMovieTitle());
        log.info("user clicks on the movie title");
    }

    @And("^user clicks on favourite button$")
    public void userClicksOnWatchLaterButton() {
        click(MoviePage.getFavoritesButton());
        log.info("user clicks on favourite button");
    }

    @Then("^the movie is added to favourite list$")
    public void theMovieIsAddedToWatchLaterList() {
        boolean exists = moviePage.checkIfMovieAddedToFavouriteList();
        assertIsTrue("Step failed: Movie was not added to favourite list",exists);
        log.info("the movie is added to favourite list");
    }


}
