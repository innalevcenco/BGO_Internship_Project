package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProvider.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepHooks {

    public static WebDriver driver = null;
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
        configFileReader = new ConfigFileReader ();
        System.setProperty ( configFileReader.getDriverString (), configFileReader.getDriverPath () );
        if (configFileReader.getDriverPath ().contains ( "chrome" )) {
            setDriver ( new ChromeDriver () );
        }
        getDriver().manage ().window ().maximize ();
    }

    @After
    public void afterScenario() {
        driver.close ();
        driver.quit ();
    }

    public void userClicksOn(String arg1) {
        driver.findElement ( By.xpath ( arg1 ) ).sendKeys ( arg1 );

    }


    public void perform_Search(String search) {
        driver.navigate ().to ( configFileReader.getHomeUrl () + "/?s=" + search + "&post_type=product" );
    }

    public void navigateTo_HomePage() {
        driver.get ( configFileReader.getHomeUrl () );
    }

//    public StepHooks(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements ( driver, this );
//        configFileReader = new ConfigFileReader ();
//    }

}


