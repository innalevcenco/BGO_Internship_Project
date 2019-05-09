package hooks;

import browser.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepHooks {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        StepHooks.driver = driver;
    }

    public StepHooks() {
    }

    @Before
    public void launchChromeDriver() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@22");
        setDriver ( Driver.initializeDriver( ));
        getDriver ().manage ().window ().maximize ();
    }

    @After
    public void afterScenario() {
//        driver.manage().deleteAllCookies();
        getDriver ().close ();
        getDriver().quit();
    }
}