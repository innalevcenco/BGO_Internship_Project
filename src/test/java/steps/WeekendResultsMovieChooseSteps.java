package steps;

import commonActions.CommonActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.HomePage;
import pages.MoviePage;
import pages.WeekendResultsPage;

public class WeekendResultsMovieChooseSteps extends CommonActions {
    WeekendResultsPage weekendResultsPage = new WeekendResultsPage();
    MoviePage moviePage = new MoviePage();

    @Given("^user accesses the weekend results$")
    public void userAccessesTheWeekendResults() {
        click(HomePage.getWeekendResults());
    }

    @And("^user chosses to see the results in dollars$")
    public void userChoosesToSeeInDollars() {
        click(WeekendResultsPage.getResultsInDollars());
    }

    @And("^user filters table descendently for all profits$")
    public void userFiltersTableDescendentlyForAllProfits() {
        int fundsBeforeFiltering = weekendResultsPage.parseIntFromAllFundsTopList();
        click(WeekendResultsPage.getFilterByAllFunds());
        log.info("user filters table by all funds");

        waitSpecificAmountOfTime(4);
        int fundsAfterFiltering = weekendResultsPage.parseIntFromAllFundsTopList();
        assertIsTrue("Step failed: table was not filtered/was not filtered correclty ",fundsAfterFiltering>=fundsBeforeFiltering);
        log.info("table is filtered");

    }

    @Then("^user accesses the first listed movie$")
    public void userAccessesTheFirstListedMovie() {
        click(WeekendResultsPage.getFirstMovieFromList());
        log.info("user accesses the first listed movie");
    }

    @And("^user clicks on watch later$")
    public void userClicksOnWatchLater() {
        click(MoviePage.getWatchLaterButton());
        log.info("user clicks on watch later button");
    }

    @Then("^movie is added to watch later$")
    public void movieIsAddedToWatchLater(){
        refresh();
        waitSpecificAmountOfTime(5);
        boolean exists= moviePage.checkIfMovieAddedToWatchLaterList();
        moviePage.removeFromWAtchLaterList();
        waitSpecificAmountOfTime(5);
        assertIsTrue("Step failed: movie was not added to watch later list ",exists);
        log.info("movie is added to watch later list");

    }
}