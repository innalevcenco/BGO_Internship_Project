package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CommonActions;
import pages.HomePage;


public class HomeSteps extends CommonActions {

    public HomeSteps() {
    }

    @Given("^home page is open$")
    public void home_page_is_open() {
        String currentURL = HomePage.getHomePage();
        Assert.assertEquals(currentURL, "https://www.kinopoisk.ru/");
        System.out.println("step1");
    }

    @When("^user searches for (.*)$")
    public void user_search(String text) {
        writeText(HomePage.getSearchField(), text);
        System.out.println("Step 2");
    }

    @When("^user clicks on (Фильмы) button$")
    public void user_clicks_on_movie_button() {
        click(HomePage.getSearchButton());
    }

    @When("^user clicks on (profile) button$")
    public void user_clicks_on_profile_button() {
        click(HomePage.getMyProfileButton());
    }
}


