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



    @Given("^user accesses the random movie search feature$")
    public void userAccessesTheRandomMovieSearchFeature() {
        click(HomePage.getRandSearchButton());
    }

    @And("^user adds a country$")
    public void userAddsACountry() {
        click(randomSearchPage.getChooseCountry());
        click(randomSearchPage.generateRandomCountry());
    }

    @And("^user adds a genre$")
    public void userAddsAGenre() {
        click(randomSearchPage.getChooseGenre());
        click(randomSearchPage.generateRandomGenre());
        //click again on the genre title so the list will dissapear
        click(randomSearchPage.getChooseGenre());
    }

    @And("^user chooses a period of years$")
    public void userChoosesAPeriodOfYears() {
        randomSearchPage.chooseRandomFirstAndLastYear();
    }

    @Then("^user clicks on random movie search button$")
    public void userClicksOnTheSearchButton() {
        randomSearchPage.clickFindMovieButton();
    }

    @Then("^movie is displayed$")
    public void movieIsDisplayed() {
        waitVisibility(randomSearchPage.getFoundMovieTitle());
    }

    @And("^user clicks on the movie title$")
    public void userClicksOnTheMovieTitle(){
        click(randomSearchPage.getFoundMovieTitle());
    }

    @And("^user clicks on favourite button$")
    public void userClicksOnWatchLaterButton(){
        click(MoviePage.getFavoritesButton());
    }

    @Then("^the movie is added to favourite list$")
    public void theMovieIsAddedToWatchLaterList() {
        checkIfMovieAddedToFavouriteList();
        //remove from favourites list
        click(MoviePage.getFavoritesButton());
    }


}
