package pages;

import hooks.StepHooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class CommonActions {

    StepHooks stepHooks = new StepHooks();
    public WebDriver driver = stepHooks.getDriver();
//    public WebDriverWait wait;

    //TODO like driver
    public WebDriverWait wait = new WebDriverWait(driver, 15);

    //Wait Wrapper Method
    public void waitVisibility(String elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(elementBy)));
    }

    //wait specific time
    public void waitSpecificAmountOfTime(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    //Click Method
    public void click(String elementBy) {
        waitVisibility(elementBy);
        driver.findElement(By.xpath(elementBy)).click();
    }

    //Submit Method
    public void submit(String elementBy) {
        waitVisibility(elementBy);
        driver.findElement(By.xpath(elementBy)).submit();
    }

    //Write Text
    public void writeText(String elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(By.xpath(elementBy)).clear();
        waitVisibility(elementBy);
        driver.findElement(By.xpath(elementBy)).sendKeys(text);
    }

    //Read Text
    public String readText(String elementBy) {
        waitVisibility(elementBy);
        return driver.findElement(By.xpath(elementBy)).getText();
    }

    //IsDisplayed
    public void isDisplayed(String elementBy) {
        waitVisibility(elementBy);
        driver.findElement(By.xpath(elementBy)).isDisplayed();
        Assert.assertTrue(driver.findElement(By.xpath(elementBy)).isDisplayed());
    }

    //Asserts
    public void assertEqualsElements(String elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    //Enter
    public void enter(String elementBy) {
        waitVisibility(elementBy);
        driver.findElement(By.id(elementBy)).sendKeys(Keys.ENTER);
    }

    public void assertEqualsURL(String currentURL, String expectedURL) {
        Assert.assertEquals(currentURL, expectedURL);
    }

    //IsTextPresent
    public boolean isTextPresent(String text) {
        boolean textFound = false;
        try {
            driver.getPageSource().contains(text);
            textFound = true;
        } catch (Exception e) {
            textFound = false;
        }
        return textFound;
    }
    //Work with dropDown Lists
    public void dropDownList(String elementBy, String text){
        Select select = new Select(driver.findElement(By.xpath(elementBy)));
    }
}