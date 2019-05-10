package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
        driver.findElement ( By.xpath ( HomePage.getSearchField () )).sendKeys ( Keys.ENTER );
    }

    @When("^user clicks on Movies button$")
    public void user_clicks_on_movie_button() {
        click(HomePage.getMoviesButton ());
    }

    @When("^user clicks on profile button$")
    public void user_clicks_on_profile_button() {
        click(HomePage.getMyProfileButton());
    }

//    @And("^user clicks on the (Enter)$")
//    public void userClicksOnTheEnter() {
//        driver.findElement ( By.xpath ( HomePage.getSearchField () )).sendKeys ( Keys.ENTER );
//        System.out.println ("https://www.kinopoisk.ru/");
//    }
}


