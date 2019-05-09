package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class CommonActions {
    public WebDriver driver;
    public WebDriverWait wait;

//    //Constructor
//    public CommonActions(WebDriver driver, WebDriverWait wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }

    public CommonActions() {
    }

    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until ( ExpectedConditions.visibilityOfAllElementsLocatedBy ( elementBy ) );
    }

    //Navigate to
    public void navigateTo(String url) {
        driver.navigate ().to ( url );
    }

    //Click Method
    public void clickOn(String elementBy) {
        waitVisibility ( By.xpath ( elementBy ) );
        driver.findElement ( By.xpath ( elementBy ) ).click ();
    }

    //Get text Method
    public String getText(String elementBy) {
        waitVisibility ( By.xpath ( elementBy ) );
        String text = driver.findElement ( By.xpath ( elementBy ) ).getText ();
        return text;
    }

    //Click Method
    public void getElementByXpath(String elementBy) {
        waitVisibility ( By.xpath ( elementBy ) );
        driver.findElement ( By.xpath ( elementBy ) );
    }

    //find Id element and Click
    public void findElementByIdAndClick(String elementBy) {
        waitVisibility ( By.id ( elementBy ) );
        driver.findElement ( By.id ( elementBy ) ).click ();
    }

    //Write Text
    public void writeText(String elementBy, String text) {
        waitVisibility ( By.xpath ( elementBy ) );
        driver.findElement ( By.xpath ( elementBy ) ).sendKeys ( text );
    }

    // Enter
    public void findElementByIdAndEnter(String elementBy, String text) {
        waitVisibility ( By.xpath ( elementBy ) );
        driver.findElement ( By.xpath ( elementBy ) ).sendKeys ( text );
    }

    //Read Text
    public String readText(String elementBy) {
        waitVisibility ( By.xpath ( elementBy ) );
        return driver.findElement ( By.xpath ( elementBy ) ).getText ();
    }

    //Asserts
    public void assertEqualsElements(String elementBy, String expectedText) {
        waitVisibility ( By.xpath ( elementBy ) );
        Assert.assertEquals ( readText ( elementBy ), expectedText );
    }

    public void assertEqualsURL(String currentURL, String expectedURL) {
        Assert.assertEquals ( currentURL, expectedURL );
    }

//WebElement webElement = wait.until ( ExpectedConditions.elementToBeClickable ( utilities.getWebElementByName ( page , "closeButton" ) ) );
//wait.until(ExpectedConditions.urlContains("SearchResults"));
}

