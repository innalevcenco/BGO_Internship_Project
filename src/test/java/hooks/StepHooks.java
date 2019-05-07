package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProvider.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepHooks {

    private static WebDriver driver = null;
    ConfigFileReader configFileReader;

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
        configFileReader = new ConfigFileReader();
        System.setProperty(configFileReader.getDriverString(), configFileReader.getDriverPath());
        if (configFileReader.getDriverPath().contains("chrome")) {
            setDriver(new ChromeDriver());
        }
        getDriver().manage().window().maximize();
    }

    @After
    public void afterScenario() {
        driver.close();
        driver.quit();
    }

}


