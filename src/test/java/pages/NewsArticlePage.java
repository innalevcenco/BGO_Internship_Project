package pages;

import hooks.StepHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsArticlePage {
    public WebDriver driver = StepHooks.getDriver();

    private static final String COMMENT_TEXTFIELD_BY_CLASS="comment-form__textarea";
    private static final String SEND_COMMENT_BUTTON_BY_CLASS="comment-form__button-label";
    public void addComment(String text){
        driver.findElement(By.className(COMMENT_TEXTFIELD_BY_CLASS)).sendKeys(text);
    }
    public void sendComment(){
        driver.findElement(By.className(SEND_COMMENT_BUTTON_BY_CLASS)).click();
    }

    public boolean checkIfTitlePresent(){
        String word = driver.findElement(By.className("media-post-title_theme_desktop")).getText();
        if (word.length()>0){
            return true;
        }else{
            return false;
        }
    }
}
