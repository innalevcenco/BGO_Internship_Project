package steps;

import commonActions.CommonActions;
import cucumber.api.java.en.And;
import pages.NoteFolderPage;

import java.awt.*;

public class NoteFolderSteps extends CommonActions {

    @And("^user clicks on 'Remove' button$")
    public void userClicksOnRemoveButton() throws AWTException {
        click(NoteFolderPage.getRemoveNoteButton());
        clickOnEnterKey();
        log.info("'Remove' button is clicked" );
    }

}
