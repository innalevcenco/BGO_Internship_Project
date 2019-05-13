package hooks;

import browser.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class StepHooks {

    @Before
    public void launchChromeDriver() {
        Driver.initializeDriver();
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void afterScenario() {

        Driver.quit();
    }
}