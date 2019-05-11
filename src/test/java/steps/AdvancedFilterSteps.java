package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdvancedFilterPage;
import pages.CommonActions;
import pages.HomePage;
import pages.MovieSearchResultPages;

import java.util.concurrent.TimeUnit;

public class AdvancedFilterSteps extends CommonActions {

    @When("^user clicks on 'Advanced Filter' button$")
    public void userClicksOnAdvancedFilterButton() {
        click(HomePage.getSearchButton());
        System.out.println("User clicks on search button");
    }

    @Then("^'Advanced filter' page is displayed$")
    public void advancedFilterPageIsDisplayed() {
        waitVisibility(AdvancedFilterPage.getActorField());
        assertEqualsURL(AdvancedFilterPage.getAdvancedSearchPageUrl(), driver.getCurrentUrl());
        System.out.println("Advanced filter page is displayed");
    }

    @When("^user fills field with '(.*)' name")
    public void userFillsActorFieldWithActorName(String text) {
        writeText(AdvancedFilterPage.getActorField(), text);
        System.out.println("Actor is entered");
    }

    //TODO need to change
    @And("^user select '(.*)' country")
    public void userSelectCountryCountry(int text) {
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='country']"));
//        //*[@id="country"]/option[3]
        Select select = new Select(dropdown);
        select.selectByValue(String.valueOf(text));
    }

    @And("^user clicks on the 'Search' button$")
    public void userClicksOnTheSearchButton() {
        click(AdvancedFilterPage.getSearchButton());
        System.out.println("Click on search button");
    }

    @Then("^the list of the films is displayed$")
    public void theListOfTheFilmsIsDisplayed() {
        isDisplayed(AdvancedFilterPage.getResultOfSearchBlock());
        System.out.println("Result of search page is displayed");
    }

    @When("^user clicks on 'country' field$")
    public void clicksOnCountryField() {
        click(AdvancedFilterPage.getCountryFiled());
    }

    @When("^user select 'Russia' field$")
    public void clicksOnSecondOptionField() {
        click(AdvancedFilterPage.getRussiaOptionField());
    }

    @When("^user clicks on 'genre' field$")
    public void clicksOnGenreField() {
        click(AdvancedFilterPage.getGenreField());
    }

    @When("^user chooses 'comedy' option$")
    public void choosesOptionComedy() {
        click(AdvancedFilterPage.getComedyOptionField());
    }

    @And("^user clicks on the checkbox$")
    public void userClicksOnCheckbox() {
        click(AdvancedFilterPage.getComedyOptionField());
    }

    @Then("^movie page is displayed$")
    public void moviePageIsDisplayed() {
        String filmURL = "https://www.kinopoisk.ru/film/972889/";
        Assert.assertEquals(MovieSearchResultPages.getBadcomedianMovieDetails(), filmURL);
    }

    @When("^user clicks on 'Note' button from displayed movie$")
    public void clickOnNote() {
        click(MovieSearchResultPages.getMovieNote());
    }

    @When("^user fills 'Note' field$")
    public void addComment() {
        writeText(MovieSearchResultPages.getMovieNote(), "I will watch this film later");
    }

    @And("^user clicks on 'Save' note button$")
    public void userClicksOnSaveNoteButton() {
        click(MovieSearchResultPages.getSaveNoteButton());
    }

    @Then("^new note is displayed$")
    public void newNoteIsDisplayed() {
        Assert.assertNotEquals("Should Add an assert", "");
    }
}