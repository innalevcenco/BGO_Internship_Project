package steps;

import UI.HomeUI;
import UI.LoginUI;
import cucumber.api.java.en.Given;
import dataProvider.ConfigFileReader;
import hooks.Login;
import hooks.StepHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {
    Login login;
    StepHooks stepHooks;
    ConfigFileReader configFileReader;
    LoginUI loginUI;
    WebDriver driver =  stepHooks.getDriver ();

    @Given("^the user logs in$")
    public void theUserLogsIn() throws Throwable {
      WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get ( configFileReader.getHomeUrl () );
        wait.until( ExpectedConditions.elementToBeClickable(By.xpath ( HomeUI.LOG_IN_BUTTON )));
        driver.findElement( By.xpath ( HomeUI.LOG_IN_BUTTON ) ).click ();
        wait.until( ExpectedConditions.elementToBeClickable(By.id ( LoginUI.USERNAME_FIELD )));
        driver.findElement ( By.id ( LoginUI.USERNAME_FIELD ) ).sendKeys ( "alexandrugrama" );
        driver.findElement ( By.xpath ( LoginUI.SUBMIT_USERNAME_BUTTON ) ).click ();
        wait.until( ExpectedConditions.elementToBeClickable(By.id ( LoginUI.PASSWORD_FIELD )));
        driver.findElement ( By.id ( LoginUI.PASSWORD_FIELD ) ).sendKeys ( "cablu21" );
        driver.findElement ( By.xpath ( LoginUI.SUBMIT_PASSWORD_BUTTON ) ).click ();

    }
}
