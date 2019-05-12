package pages;

import hooks.StepHooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static junit.framework.TestCase.assertTrue;

public abstract class CommonActions {

    StepHooks stepHooks = new StepHooks();
    public WebDriver driver = stepHooks.getDriver();
//    public WebDriverWait wait;

    //TODO like driver
    public WebDriverWait wait = new WebDriverWait(driver, 30);

    //Wait Wrapper Method
    public void waitVisibility(String elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(elementBy)));
    }

    //wait specific time
    public void waitSpecificAmountOfTime(int seconds){
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    //Wait element to be clickable
    public void waitClickable(String elementBy) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementBy)));
    }

    //Click Method
    public void click(String elementBy) {
        waitClickable(elementBy);
        driver.findElement(By.xpath(elementBy)).click();
    }

    //Scroll Method
    public void scrollTo(String elementBy) {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(driver.findElement(By.xpath(elementBy)));
//        actions.perform();

//        webElement = driver.findElement(By.xpath("bla-bla-bla"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(elementBy)));
//        WebElement element= driver.findElement(By.xpath(elementBy));
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

    public void assertIsTrue(String textIfFalse, boolean element) {
        assertTrue(textIfFalse, element);
    }
}