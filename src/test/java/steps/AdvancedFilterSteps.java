package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdvancedFilterPage;
import pages.CommonActions;
import pages.HomePage;

public class AdvancedFilterSteps extends CommonActions {

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

    //TODO need to change
    @And("^user select '(.*)' country")
    public void userSelectsCountry(String text) {
        click(AdvancedFilterPage.getCountryFiled());
        WebElement dropdown = driver.findElement(By.xpath("//*[@id='country']"));

//        //*[@id="country"]/option[3]
        Select select = new Select(dropdown);
//        select.selectByValue(String.valueOf(text));
        select.selectByVisibleText("США");
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
}