package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CommonActions;
import pages.HomePage;


public class HomeSteps extends CommonActions {

    public HomeSteps() {
    }

    @Given("^home page is open$")
    public void homePageIsOpen() {
        HomePage.getHomePage();
    }

    @When("^user searches for (.*)$")
    public void userSearch(String text) {
        writeText(HomePage.getSearchField(), text);
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
}


