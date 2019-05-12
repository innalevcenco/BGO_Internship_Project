package hooks;

import browser.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

public class StepHooks {

    private static WebDriver driver;

    public StepHooks() {
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        StepHooks.driver = driver;
    }

    @Before
    public void launchChromeDriver() {
        setDriver(Driver.initializeDriver());
        getDriver().manage().window().maximize();
    }

    @After
    public void afterScenario() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}