package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import pages.UserLists;

import static sun.management.Agent.getText;

public class MyProfileSteps {
    UserLists userList;
    MovieSearchSteps movieSearchSteps;

    @Given("^new added film is displayed first in the (Буду смотреть) list$")
    public void checkNewAddedFilmIsDisplayed() {
        Assert.assertTrue ( getText ( userList.getFIRST_DISPLAYED_MOVIE () ).equals ( movieSearchSteps.movieTitle ) );
    }
}
