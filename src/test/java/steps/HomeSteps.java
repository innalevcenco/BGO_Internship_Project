package steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonActions;
import pages.HomePage;

import java.util.concurrent.TimeUnit;


public class HomeSteps extends CommonActions {

    public HomeSteps() {
    }

    @Given("^home page is open$")
    public void home_page_is_open() {
        String currentURL = HomePage.getHomePage();
        Assert.assertEquals ( currentURL, "https://www.kinopoisk.ru/" );
        System.out.println();
    }

    @When("^user searches for (.*) movie$")
    public void user_searches_for_movie(String text) {
        writeText ( HomePage.getSearchField(), text );
        System.out.println("Step 2");
    }

   @Given("^user clicks on 'Advanced filter' button$")
   public void getBla(){
       click(HomePage.getAdvancedSearchButton());
       System.out.println("Pass");
   }

    @When("^user clicks on (search) button$")
    public void user_clicks_on_search_button() {
        click(HomePage.getSearchButton());
    }

    @When("^user clicks on (Фильмы) button$")
    public void user_clicks_on_movie_button() {
        click (HomePage.getSearchButton());
    }

    @When("^user clicks on (profile) button$")
    public void user_clicks_on_profile_button() {
        click ( HomePage.getMyProfileButton() );
    }
}


