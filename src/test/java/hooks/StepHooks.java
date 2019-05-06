package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import dataProvider.ConfigFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepHooks {

    WebDriver driver;
    ConfigFileReader configFileReader;

    public StepHooks() {

    }

//    public WebDriver getDriver() {
//        return driver;
//    }

    @Before
    public void launchChromeDriver() {
        configFileReader = new ConfigFileReader ();
        System.setProperty ( configFileReader.getDriverString (), configFileReader.getDriverPath () );
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
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
        driver.navigate ().to ( configFileReader.getWebSiteUrl () + "/?s=" + search + "&post_type=product" );
    }

    public void navigateTo_HomePage() {
        driver.get ( configFileReader.getWebSiteUrl () );
    }

//    public StepHooks(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements ( driver, this );
//        configFileReader = new ConfigFileReader ();
//    }

}


