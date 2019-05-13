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
        System.out.println("Home page is displayed");
    }

    @When("^user clicks on 'Search' button$")
    public void userClicksOnMovieButton() {
        click(HomePage.getRandSearchButton());
    }

    @When("^user clicks on profile button$")
    public void userClicksOnProfileButton() {
        click(HomePage.getMyProfileButton());
    }

    @When("^user clicks on 'Will watch' button$")
    public void userClicksOnWillWatchButton() {
        click(HomePage.getWillWatchButton());
    }

    @When("^user searches for '(.*)'$")
    public void user_searches_for_movie(String text) {
        writeText(HomePage.getSearchField(), text);
        System.out.println("User searches for");
    }

    @And("^user clicks on the 'HomeSearch' button$")
    public void userClicksOnTheHomeSearchButton() {
        click(HomePage.getSearchButton());
    }
}