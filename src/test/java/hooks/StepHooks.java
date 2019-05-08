package hooks;

import browser.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
public class StepHooks {

    private WebDriver driver = null;

    public StepHooks() {

    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Before
    public void launchChromeDriver() {
        setDriver(Driver.initializeDriver());
        getDriver().manage().window().maximize();
    }

    @After
    public void afterScenario() {
        getDriver().close();
    }
}