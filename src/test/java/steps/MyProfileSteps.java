package steps;

        import cucumber.api.java.en.Given;
        import org.junit.Assert;
        import pages.UserFolders;

        import static sun.management.Agent.getText;

public class MyProfileSteps {

    @Given("^new added film is displayed first in the Will watch list$")
    public void checkNewAddedFilmIsDisplayed() {
//        Assert.assertTrue ( getText ( UserFolders.getFirstDisplayedMovie()).equals ( movieSearchSteps.movieTitle ) );
    }
}
