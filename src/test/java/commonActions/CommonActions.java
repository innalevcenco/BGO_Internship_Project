package commonActions;

import browser.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static junit.framework.TestCase.assertTrue;

public abstract class CommonActions {

    public WebDriver driver = Driver.getDriver();

    public WebDriverWait wait = new WebDriverWait(driver, 50);

    //Wait Wrapper Method
    public void waitVisibility(String elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(elementBy)));
    }

    //Wait element to be clickable
    public void waitClickable(String elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementBy)));
    }

    //wait specific time
    public void waitSpecificAmountOfTime(int seconds) {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    //Click Method
    public void click(String elementBy) {
        waitClickable(elementBy);
        driver.findElement(By.xpath(elementBy)).click();
    }

    //Click Method
    public void clickOnHidenElement(String elementBy) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(By.xpath(elementBy)));
    }

    //Scroll Method
    public void scrollTo(String elementBy) {

        boolean isElementPresent;
        for (int i = 0; i < 40; i++) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,20)", "");
            try {
                driver.findElement(By.xpath(elementBy));
                isElementPresent = true;
            } catch (org.openqa.selenium.NoSuchElementException e) {
                isElementPresent = false;
            }
            if (isElementPresent) {
                break;
            }
        }
    }

    //Write Text
    public String writeText(String elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(By.xpath(elementBy)).clear();
        driver.findElement(By.xpath(elementBy)).sendKeys(text);
        return elementBy;
    }

    //Write Text
    public String getText(String elementBy) {
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
    public boolean isPageSourceContaining(String element) {
        if (driver.getPageSource().contains(element)) {
            return true;
        } else {
            return false;
        }
    }

    //refresh
    public void refresh() {
        driver.navigate().refresh();
    }

    //enter Key
    public void clickOnEnterKey() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
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

    public void assertIsTrue(String textIfFalse, boolean element) {
        assertTrue(textIfFalse, element);
    }
}