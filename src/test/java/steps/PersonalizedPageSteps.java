package steps;

import commonActions.CommonActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.PersonalizedPage;

public class PersonalizedPageSteps extends CommonActions {

    @Then("^the list of actors is displayed$")
    public void theListOfActorsIsDisplayed() {
        waitVisibility(PersonalizedPage.getBlockWithResultSearch());
        Assert.assertTrue(isTextPresent("Скорее всего, вы ищете:"));
        log.info("the list of actors is displayed");
    }

    @Then("^user redirected on the '(.*)' page$")
    public void userIsRedirectedOnTheActorPage(String text) {
        waitVisibility(PersonalizedPage.getPhotoInfoTable());
        Assert.assertTrue(isTextPresent(text));
        log.info("user is redirected on the page");
    }

    @When("^user clicks on the 'Actors' folder$")
    public void userClicksOnTheActorsList() {
        click(PersonalizedPage.getArrow());
        click(PersonalizedPage.getAddToCategoryActorsButton());
        log.info("user clicks on the 'Actors' list");
    }

    @Then("^folder '(.*)' appears on the page$")
    public void folderIsAppearOnThePage(String text) {
        waitVisibility(PersonalizedPage.getActorsFolder());
        Assert.assertTrue(isTextPresent(text));
        log.info("folder " + text + " is appear on the page");
        //delete added actor from folder
        click(PersonalizedPage.getAddToCategoryActorsButton());
    }
}