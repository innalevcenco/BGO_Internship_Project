package steps;

import commonActions.CommonActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;

public class CommentNewsPaperSteps extends CommonActions {

    NewsPage newsPage = new NewsPage();
    NewsArticlePage newsArticlePage = new NewsArticlePage();

    @Given("^user accesses news page$")
    public void userAccessesNewsPage() {
        click(HomePage.getMEDIA());
        log.info("User accesses news page");
    }

    @And("^user clicks on a date from the calendar$")
    public void userClicksOnADateFromTheCalendar() {
        click(NewsPage.getLeftArrowDatepicker());
        log.info("User clicks on the left arrow of calendarpicker");
        click(newsPage.generateRandomDateLink());
        log.info("user clicks on a random date from calendar picker");
    }

    @And("^user accesses the first article$")
    public void userAccessesTheFirstArticle() {
        click(NewsPage.getFirstArticle());
        log.info("user accesses the first article");
    }

    @When("^article is displayed$")
    public void articleIsDisplayed() {
        boolean exists= newsArticlePage.checkIfTitlePresent();
        assertIsTrue("Step failed: Article is not found or not displayed",exists);
        log.info("article is displayed");
    }

    @Then("^user writes the comment \"Текст:\" textfield$")
    public void userWritesTheComment() {
        newsArticlePage.addComment("Не вериться, Вообще то на 16 45 :)) ENDAVA");
        log.info("user clicks the comment textfield and writes text");
    }


    @And("^user clicks \"отправить\" button$")
    public void userClicksOтправитьButton(){
        newsArticlePage.sendComment();
        log.info("user clicks on send comment button");
    }


    @Then("^the comment is added$")
    public void theCommentIsAdded() {
        refresh();
        log.info("user refreshes the page");
        waitSpecificAmountOfTime(5);
        boolean exists=isPageSourceContaining("ENDAVA");
        assertIsTrue("Step failed: Comment was not added",exists);
        log.info("The comment was added");
    }
}
