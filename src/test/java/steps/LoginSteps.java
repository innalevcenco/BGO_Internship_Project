package steps;

import cucumber.api.java.en.Given;
import hooks.StepHooks;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {

    WebDriver driver =  StepHooks.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("^user is login on '(.*)' with '(.*)' username and '(.*)' password$")
    public void userLogin(String pageURL, String username, String password) {
        driver.get(pageURL);
        loginPage.buttonClick(loginPage.homeEnterButton());
        loginPage.setUsername(username);
        loginPage.buttonClick(loginPage.usernameEnterButton());
        loginPage.setPassword(password);
        loginPage.buttonClick(loginPage.passwordEnterButton());
    }
}