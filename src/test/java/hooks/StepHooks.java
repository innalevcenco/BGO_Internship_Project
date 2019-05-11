package hooks;

import browser.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class StepHooks {

    @Setter
    @Getter
    private static WebDriver driver;

    public StepHooks() {
    }

    @Before
    public void launchChromeDriver() {
        setDriver ( Driver.initializeDriver( ));
        getDriver ().manage ().window ().maximize ();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void afterScenario() {
//        driver.manage().deleteAllCookies();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getDriver ().close();
        getDriver().quit();
    }
}