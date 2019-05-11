package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonActions;
import pages.MyProfilePage;


public class MyProfileSteps extends CommonActions {
    @When("^user clicks on 'Note' folder$")
    public void clickOnNoteFolder() {
        click(MyProfilePage.getNoteFolder());
    }


    @Then("^the new comment is displayed on the 'Note' folder$")
    public void moviePageIsDisplayed(){
        System.out.println("Have to add an Assert");
    }

}
