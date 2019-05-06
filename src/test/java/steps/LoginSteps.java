package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import hooks.Login;

public class LoginSteps {
    Login login;

    @Given("^the user logs in$")
    public void theUserLogsIn() throws Throwable {
        login.logInAction ();

    }
}
