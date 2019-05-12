package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.CommonActions;
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

    @When("^user searches for '(.*)'$")
    public void user_searches_for_movie(String text) {
        writeText(HomePage.getSearchField(), text);
        System.out.println("User searches for");
    }

    @When("^user clicks on (Фильмы) button$")
    public void user_clicks_on_movie_button() {
        click(HomePage.getSearchButton());
    }

    @When("^user clicks on (profile) button$")
    public void user_clicks_on_profile_button() {
        click(HomePage.getMyProfileButton());
    }

    @And("^user clicks on the 'HomeSearch' button$")
    public void userClicksOnTheHomeSearchButton() {
        click(HomePage.getSearchButton());
    }
}