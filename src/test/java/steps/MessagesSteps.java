package steps;

import commonActions.CommonActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.MessagesPage;

import static pages.MessagesPage.*;

public class MessagesSteps extends CommonActions {

    @When("^user clicks on 'Logo' button$")
    public void userClicksOnLogoButton() {
        click(HomePage.getLogOutButton());
        log.info("Button 'Logo' is clicked");
    }

    @Then("^dropdown list is displayed$")
    public void elementIsDisplayed() {
        isDisplayed(HomePage.getMessagesButton());
        log.info("Element 'Message link' is displayed");
    }

    @When("^user clicks on 'Messages' link$")
    public void userClicksOnMessagesLink() {
        click(HomePage.getMessagesButton());
        log.info("Button 'Logo' is clicked");
    }

    @Then("^user is redirected to the inbox page$")
    public void redirectedMethod() {
        waitVisibility(getNewMessageLink());
        assertEqualsURL(getInboxPageUrl(), driver.getCurrentUrl());
        log.info("Inbox page is displayed");
    }

    @When("^user clicks on the 'new message' link$")
    public void userClicksOnTheNewMessageLink() {
        click(getNewMessageLink());
        log.info("New message link is clicked");
    }

    @Then("^user redirects on the 'Send Message' page$")
    public void userIsRedirectedOnTheSendMessagePage() {
        waitVisibility(getNewMessageText());
        Assert.assertTrue(isTextPresent("Новое сообщение"));
        log.info("Send Message page is displayed");
    }

    @When("^user enters '(.*)' and '(.*)'$")
    public void userEntersReceivers(String receiver, String message) {
        writeText(getRECEIVER(),receiver);
        writeText(getMessageField(), message);
        System.out.println("user enters '"+receiver+"' and '"+message+"'");
    }

    @And("^user clicks on 'Send' button$")
    public void userClicksOnSendButton() {
        waitVisibility(getSendButton());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath(getSendButton())).click();
        log.info("Send button is clicked");
    }

    @Then("^'(.*)' is displayed on current page$")
    public void messageIsDisplayedOnCurrentPage(String text) {
        Assert.assertTrue(isTextPresent(text));
        log.info("Message "+text+" is displayed");
    }

    @Then("^send button is disable$")
    public void buttonIsDisable(){
        Assert.assertFalse(driver.findElement(By.xpath(MessagesPage.getSendButton())).isEnabled());
        log.info("Send button is disable");
    }
}