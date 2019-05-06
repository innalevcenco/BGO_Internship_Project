package steps;

import UI.HomeUI;
import cucumber.api.java.en.Given;
import hooks.StepHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeSteps {
    StepHooks stepHooks;
    HomeUI homeUI;
    WebDriver driver;

    @Given("^user searches for (.*) movie$")
    public void user_searches_for_movie(String movieName) {
        driver.findElement ( By.id ( homeUI.getSearchField () ) ).sendKeys ( movieName );
        driver.findElement ( By.xpath ( homeUI.getSearchButton () ) ).click ();

    }

    @Given("^search results are displayed$")
    public void search_results_are_displayed() {

    }

}
