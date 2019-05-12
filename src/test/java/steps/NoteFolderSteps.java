package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CommonActions;
import pages.MoviePage;

import java.awt.*;

public class NoteFolderSteps extends CommonActions {

    @Then("^the new comment is displayed on the 'Note' folder$")
    public void moviePageIsDisplayed() {
        System.out.println("Have to add an Assert");
    }

    @And("^user clicks on 'Remove' button$")
    public void userClicksOnRemoveButton() throws AWTException {
        click(MoviePage.getRemoveNoteButton());
        clickOnEnterKey();
    }
}
