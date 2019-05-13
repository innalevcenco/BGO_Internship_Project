package steps;

import commonActions.CommonActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;


public class HomeSteps extends CommonActions {

    public HomeSteps() {
    }

    @Given("^home page is open$")
    public void verificationLocation() {
        waitVisibility(HomePage.getLogOutButton());
        assertEqualsURL(HomePage.getHomePage(), driver.getCurrentUrl());
        log.info("Home page is displayed");
    }

    @When("^user clicks on 'Search' button$")
    public void userClicksOnMovieButton() {
        click(HomePage.getRandSearchButton());
        log.info("Search button is clicked");
    }

    @When("^user clicks on profile button$")
    public void userClicksOnProfileButton() {
        click(HomePage.getMyProfileButton());
        log.info("Profile button is clicked");
    }

    @When("^user clicks on 'Will watch' button$")
    public void userClicksOnWillWatchButton() {
        click(HomePage.getWillWatchButton());
        log.info("Will watch button is clicked");
    }


    @And("^user clicks on the 'HomeSearch' button$")
    public void userClicksOnTheHomeSearchButton() {
        click(HomePage.getSearchButton());
        log.info("Search button is clicked");
    }

    @When("^user searches for '(.*)'$")
    public void user_searches_for_movie(String text) {
        writeText(HomePage.getSearchField(), text);
        log.info("Search information are displayed");
    }
}