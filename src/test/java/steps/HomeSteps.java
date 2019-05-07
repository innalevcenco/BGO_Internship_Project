package steps;

import cucumber.api.java.en.Given;
import dataProvider.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

public class HomeSteps {
    HomePage homeUI;
    WebDriver driver;
    ConfigFileReader configFileReader;

//    public HomeSteps(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//        configFileReader = new ConfigFileReader();
//    }

    @Given("^user searches for (.*) movie$")
    public void user_searches_for_movie(String movieName) {
        driver.findElement(By.id(homeUI.SEARCH_FIELD)).sendKeys(movieName);
        driver.findElement(By.xpath(homeUI.SEARCH_BUTTON)).click();
    }

    @Given("^search results are displayed$")
    public void search_results_are_displayed() {
    }

    public void userClicksOn(String arg1, String arg2) {
        driver.findElement(By.xpath(arg1)).sendKeys(arg2);
    }

    public void navigate_To_HomePage() {
        driver.get(HomePage.HOME_PAGE);
    }


}
