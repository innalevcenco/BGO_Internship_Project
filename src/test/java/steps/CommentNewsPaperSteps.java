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
    }

    @And("^user clicks on a date from the calendar$")
    public void userClicksOnADateFromTheCalendar() {
        click(NewsPage.getLeftArrowDatepicker());
        click(newsPage.generateRandomDateLink());
    }

    @And("^user accesses the first article$")
    public void userAccessesTheFirstArticle() {
        click(NewsPage.getFirstArticle());
    }

    @When("^article is displayed$")
    public void articleIsDisplayed() {
        boolean exists= newsArticlePage.checkIfTitlePresent();
        assertIsTrue("Step failed: Article is not found or not displayed",exists);
    }

    @Then("^user writes the comment \"Текст:\" textfield$")
    public void userWritesTheComment() {
        newsArticlePage.addComment("Не вериться, Вообще то на 16 45 :)) ENDAVA");
    }


    @And("^user clicks \"отправить\" button$")
    public void userClicksOтправитьButton(){
        newsArticlePage.sendComment();
    }


    @Then("^the comment is added$")
    public void theCommentIsAdded() {
        refresh();
        waitSpecificAmountOfTime(5);
        boolean exists=isPageSourceContaining("alexandrugrama");
        assertIsTrue("Step failed: Comment was not added",exists);
    }
}
