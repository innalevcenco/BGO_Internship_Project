package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import hooks.StepHooks;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginSteps {

    StepHooks stepHooks = new StepHooks();

    private WebDriver driver = stepHooks.getDriver();
    private LoginPage loginPage = new LoginPage(driver);

    @Given("^user is login on '(.*)' with '(.*)' username and '(.*)' password$")
    public void userLogin(String pageURL, String username, String password) {

        driver.get(pageURL);
        loginPage.buttonClick(loginPage.homeEnterButton());
        loginPage.setUsername(username);
        loginPage.buttonClick(loginPage.usernameEnterButton());
        loginPage.setPassword(password);
        loginPage.buttonClick(loginPage.passwordEnterButton());
        System.out.println("Login step passed");
    }
}