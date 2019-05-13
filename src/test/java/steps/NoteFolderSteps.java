package steps;

import cucumber.api.java.en.And;
import commonActions.CommonActions;
import pages.NoteFolderPage;

import java.awt.*;

public class NoteFolderSteps extends CommonActions {

    @And("^user clicks on 'Remove' button$")
    public void userClicksOnRemoveButton() throws AWTException {
        click(NoteFolderPage.getRemoveNoteButton());
        clickOnEnterKey();
    }

}
