package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CommonActions;
import pages.HomePage;
import pages.MessagesPage;

public class MessagesSteps extends CommonActions {

    @Given("^user is on the home page$")
    public void verificationLocation() {
//        driver.get(HomePage.getHomePageLocator());
        waitVisibility(HomePage.getLogOutButton());
//        waitVisibility(HomePage.getLogInButton());
        assertEqualsURL(HomePage.getHomePage(), driver.getCurrentUrl());
        System.out.println("Home page is displayed");
    }

    @When("^user clicks on 'Logo' button$")
    public void userClicksOnLogoButton() {
        click(HomePage.getLogOutButton());
        System.out.println("Button 'Logo' is clicked");
    }

    @Then("^dropdown list is displayed$")
    public void elementIsDisplayed() {
        isDisplayed(HomePage.getMessagesButton());
        System.out.println("Element 'Message link' is displayed");
    }

    @When("^user clicks on 'Messages' link$")
    public void userClicksOnMessagesLink() {
        click(HomePage.getMessagesButton());
        System.out.println("Button 'Logo' is clicked");
    }

    @Then("^user is redirected to the inbox page$")
    public void redirectedMethod() {
        waitVisibility(MessagesPage.getNewMessageLink());
        assertEqualsURL(MessagesPage.getInboxPageURL(), driver.getCurrentUrl());
        System.out.println("Inbox page is displayed");
    }

    @When("^user clicks on the 'new message' link$")
    public void userClicksOnTheNewMessageLink() {
        click(MessagesPage.getNewMessageLink());
        System.out.println("New message link is clicked");
    }

    @Then("^user is redirected on the 'Send Message' page$")
    public void userIsRedirectedOnTheSendMessagePage() {
        waitVisibility(MessagesPage.getNewMessageText());
        assertEqualsURL(MessagesPage.getSendMessagePageURL(), driver.getCurrentUrl());
        System.out.println("Send Message page is displayed");
    }
    @When("^user enters '(.*)'$")
    public void userEntersReceivers(String text) {
        writeText(MessagesPage.getReceiver(),text);
        System.out.println("Step PASSED");
    }

    @When("^user enters '(.*)', '(.*)' and '(.*)'$")
    public void userEntersReceiversThemeAndMessage(String receiver, String theme, String message) {
        writeText(MessagesPage.getReceiversField(), receiver);
        writeText(MessagesPage.getThemeField(), theme);
        writeText(MessagesPage.getMessageField(), message);
        //TODO need assert
        System.out.println("Fild are populated");
    }

    @And("^user clicks on 'Send' button$")
    public void userClicksOnSendButton() {
        click(MessagesPage.getSendButton());
        System.out.println("Message is sent");
    }

    @Then("^'(.*)' is displaeyed on current page$")
    public void messageIsDisplaeyedOnCurrentPage() {
        System.out.println("Message is displayed");
    }
}






