package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdvancedFilterPage;
import pages.CommonActions;
import pages.HomePage;
import pages.MovieSearchResultPages;

public class AdvancedFilterSteps extends CommonActions {

    Actions actions = new Actions(driver);

    @When("^user clicks on 'Advanced Filter' button$")
    public void userClicksOnAdvancedFilterButton() {
        click(HomePage.getAdvancedSearchButton());
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

    @And("^user select '(.*)' country")
    public void userSelectsCountry(String country) {
        click(AdvancedFilterPage.getCountryFiled());
        Select select = new Select(driver.findElement(By.xpath(AdvancedFilterPage.getCountryFiled())));
        select.selectByVisibleText(country);
    }

    @And("^user enters '(.*)' year$")
    public void userEntersYear(String year) {
        writeText(AdvancedFilterPage.getYearField(), year);
        Assert.assertTrue(isTextPresent(year));
        System.out.println("Year is entered");
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

    @When("^user chooses 'an option' from option field$")
    public void chooseOption() {
        click(AdvancedFilterPage.getComedyOptionField2());
    }

    @And("^user clicks on the checkbox$")
    public void userClicksOnCheckbox() {
        click(AdvancedFilterPage.getComedyOptionField2());
    }

    @When("^user clicks on 'genre' field$")
    public void clicksOnGenreField() {
        click(AdvancedFilterPage.getGenreField());
    }

    @And("^user clicks on 'Note' button$")
    public void clickNoteButton() {
        click(MovieSearchResultPages.getMovieNoteButton());
    }

    @And("^user fills 'Note' field with: (.*)$")
    public void addComment(String note) {
        writeText(MovieSearchResultPages.getMovieNoteField(), note);
    }

    @And("^user clicks on 'Save' note button$")
    public void userClicksOnSaveNoteButton() {
        click(MovieSearchResultPages.getSaveNoteButton());
    }
}