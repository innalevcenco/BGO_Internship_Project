package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActions {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public CommonActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void click(String elementBy) {
        waitVisibility(By.xpath(elementBy));
        driver.findElement(By.xpath(elementBy)).click();
    }

    //Write Text
    public void writeText(String elementBy, String text) {
        waitVisibility(By.xpath(elementBy));
        driver.findElement(By.xpath(elementBy)).sendKeys(text);
    }

    //Read Text
    public String readText(String elementBy) {
        waitVisibility(By.xpath(elementBy));
        return driver.findElement(By.xpath(elementBy)).getText();
    }

    //Asserts
    public void assertEqualsElements(String elementBy, String expectedText) {
        waitVisibility(By.xpath(elementBy));
        Assert.assertEquals(readText(elementBy), expectedText);
    }

    public void assertEqualsURL(String currentURL, String expectedURL) {
        Assert.assertEquals(currentURL, expectedURL);
    }
}
