package pages;

import hooks.StepHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CommonActions;

import java.util.Random;

public class RandomSearchPage extends CommonActions {

    public WebDriver driver = StepHooks.getDriver();
    private static final String CHOOSE_COUNTRY = "//*[@id=\"countryListTitle\"]";
    private static final String CHOOSE_GENRE = "//*[@id=\"genreListTitle\"]";
    private static final String LEFT_ARROW = "//*[@id=\"review_procentrange\"]/a[1]";
    private static final String RIGHT_ARROW ="//*[@id=\"review_procentrange\"]/a[2]";
    private static final String FIND_MOVIE_BUTTON="//*[@id=\"search\"]";
    private static final String FOUND_MOVIE_TITLE="//*[@id=\"page\"]/div[3]/div[3]/div/div[2]/div[1]/div[1]/a";


    public static String getFoundMovieTitle() { return FOUND_MOVIE_TITLE; }
    public static String getChooseCountry() { return CHOOSE_COUNTRY; }
    public static String getChooseGenre() { return CHOOSE_GENRE; }
    public static String getLeftArrow() { return LEFT_ARROW; }
    public static String getRightArrow() { return RIGHT_ARROW; }
    public static String getFindMovieButton() { return FIND_MOVIE_BUTTON; }


    public String generateRandomCountry(){
        int randomCountry= new Random().nextInt(20)+1;
        return "//*[@id=\"countryList\"]/li["+randomCountry+"]";
    }

    public String generateRandomGenre(){
        int randomGenre= new Random().nextInt(25)+1;
        return "//*[@id=\"genreList\"]/li["+randomGenre+"]";
    }

    public void chooseRandomFirstAndLastYear(){
        int randomYear=new Random().nextInt(9)+1;
        WebElement leftArrow =driver.findElement(By.xpath(LEFT_ARROW));
        WebElement rightArrow =driver.findElement(By.xpath(RIGHT_ARROW));

        //move the left arrow
        Actions action = new Actions(driver);
        action.clickAndHold(leftArrow).build().perform();
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div[1]/div[3]/ul/li["+randomYear+"]"))).release();
        //move the right arrow

        action.clickAndHold(rightArrow).build().perform();
        action.moveToElement(driver.findElement(By.xpath("//*[@id=\"page\"]/div[3]/div[1]/div[3]/ul/li["+randomYear+"]"))).release();
    }

    public void clickFindMovieButton(){

        driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
    }

    public boolean isMovieFound(){
        String text= driver.findElement(By.xpath(FOUND_MOVIE_TITLE)).getText();
        if (text.length()>0){
            return true;
        }else{
            return false;
        }
    }






}
