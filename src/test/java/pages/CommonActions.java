package pages;

import hooks.StepHooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public abstract class CommonActions {

    public WebDriver driver = StepHooks.getDriver();
//    public WebDriverWait wait;

    //TODO like driver
    public WebDriverWait wait = new WebDriverWait(driver, 15);

//    //Constructor
//    public CommonActions(WebDriver driver, WebDriverWait wait) {
//        this.driver = driver;
//        this.wait = wait;
//    }

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

    //Write Text
    public void writeText(String elementBy, String text) {
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

    //check if page source contains element
    public boolean isPageSourceContaining(String element){
        if (driver.getPageSource().contains(element)){
            return true;
        }else{
            return false;
        }
    }
    //refresh
    public void refresh(){
        driver.navigate().refresh();
    }

    //Asserts
    public void assertEqualsElements(String elementBy, String expectedText) {
        waitVisibility(elementBy);
        Assert.assertEquals(readText(elementBy), expectedText);
    }


    public void assertEqualsURL(String currentURL, String expectedURL) {
        Assert.assertEquals(currentURL, expectedURL);
    }

    public void assertIsTrue(String textIfFalse,boolean element){
        assertTrue(textIfFalse,element);
    }
}