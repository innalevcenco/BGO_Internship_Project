package pages;

import org.openqa.selenium.WebElement;

import java.util.Random;

public class NewsPage extends CommonActions {
    private static final String FIRST_ARTICLE ="//*[@id=\"block_left\"]/div/table/tbody/tr[3]/td/div/div[1]";
    private static final String LEFT_ARROW_DATEPICKER="//*[@id=\"datepicker\"]/div/div/a[1]";

    public static String getFirstArticle() { return FIRST_ARTICLE; }
    public static String getLeftArrowDatepicker() { return LEFT_ARROW_DATEPICKER; }


    public String generateRandomDateLink(){
        int randomRow= new Random().nextInt(4)+1;
        int randomColumn = new Random().nextInt(5)+1;
        String link = "//*[@id=\"datepicker\"]/div/table/tbody/tr["+randomRow+"]/td["+randomColumn+"]";
        return link;
    }
}
