package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonActions;
import pages.HomePage;

public class HomeSteps extends CommonActions {
    HomePage homePage = new HomePage ();

    public HomeSteps() {
    }
//
//    @Given("^home page is open$")
//    public void home_page_is_open() {
//        String currentURL = homePage.getHOME_PAGE ();
//        Assert.assertEquals ( currentURL, "https://www.kinopoisk.ru/" );
//    }
//
//    @When("^user searches for (.*) movie$")
//    public void user_searches_for_movie(String text) {
//        writeText ( homePage.getSEARCH_FIELD (), text );
//    }
//
//    @When("^user clicks on (search) button$")
//    public void user_clicks_on_search_button() {
//        click (homePage.getSEARCH_BUTTON ());
//    }
//
//    @When("^user clicks on (Фильмы) button$")
//    public void user_clicks_on_movie_button() {
//        click (homePage.getSEARCH_BUTTON ());
//    }
//
//    @When("^user clicks on (profile) button$")
//    public void user_clicks_on_profile_button() {
//        click ( homePage.getMY_PROFILE_BUTTON () );
//    }
}


