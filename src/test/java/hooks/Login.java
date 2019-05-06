package hooks;

import UI.LoginUI;
import dataProvider.ConfigFileReader;
import hooks.StepHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Login {
    static WebDriver driver;

    // In order to use the PageFactory, first declare some fields on a PageObject that are WebElements
    StepHooks stepHooks;
    ConfigFileReader configFileReader;
    LoginUI loginUI;
    static WebElement log;
    static WebElement pwd;
    static WebElement submit;

    public void logInAction() throws InterruptedException {
        driver.get ( "https://www.kinopoisk.ru/" );
        log.findElement ( By.xpath ( loginUI.getLoginPage () ) );
        log.findElement ( By.xpath ( LoginUI.getUsernameField () ) ).sendKeys ( "alexandrugrama" );
        log.findElements ( By.xpath ( LoginUI.getGetinButton () ) );
        log.click ();
        pwd.findElement ( By.xpath ( LoginUI.getPasswordField () ) ).sendKeys ( "cablu21" );
        submit.click ();

//
//        // In order for this code to work and not throw a NullPointerException because
//
//        // the "log", "pwd" nd "submit" fields aren't instantiated, we need to initialise the PageObject
//
//        PageFactory.initElements ( driver, Login.class );
//
//        // Once Instantiated, we can now use the above created WebElements
//
//        log.sendKeys ( "alexandrugrama" );
//
//        pwd.sendKeys ( "cablu21" );
//
//        submit.click ();
//
//        driver.quit ();

    }
}
