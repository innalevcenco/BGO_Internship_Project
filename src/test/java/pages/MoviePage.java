package pages;

import hooks.StepHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviePage extends CommonActions{
    public WebDriver driver = StepHooks.getDriver();
    private static final String WATCH_LATER_BUTTON ="//*[@id=\"div_mustsee_main\"]/div/div/div[1]/span[1]";
    private static final String MOVIE_TITLE ="//*[@id=\"headerFilm\"]/h1";
    private static final String FAVORITES_BUTTON="//*[@id=\"btn_fav_film\"]";
    private static final String WATCH_LATER_LIST_BUTTON="//*[@id=\"partial_component__header-topline\"]/div/div/div[1]/div/div[1]/div[3]/a/span";
    private static final String FAVORITES_LIST_BUTTON="//*[@id=\"ms_folder_6\"]/a";

    public static String getFavoritesListButton() { return FAVORITES_LIST_BUTTON; }
    public static String getWatchLaterButton() { return WATCH_LATER_BUTTON; }
    public static String getMovieTitle() { return MOVIE_TITLE; }
    public static String getFavoritesButton() { return FAVORITES_BUTTON; }
    public static String getWatchLaterListButton() { return WATCH_LATER_LIST_BUTTON; }


    public boolean checkIfMovieAddedToFavouriteList(){
        String headerMovie1= driver.findElement(By.xpath(MoviePage.getMovieTitle())).getText();
        driver.findElement(By.xpath(getFavoritesListButton())).click();
        waitVisibility(FavouriteMoviePage.getFirstMovieFromList());
        driver.findElement(By.xpath(FavouriteMoviePage.getFirstMovieFromList())).click();
        waitVisibility(getMovieTitle());

        String headerMovie2=driver.findElement(By.xpath(getMovieTitle())).getText();

        if (headerMovie1.equals(headerMovie2)){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkIfMovieAddedToWatchLaterList(){
//        driver.navigate().refresh();
//        waitSpecificAmountOfTime(4);

        String headerMovie1= driver.findElement(By.xpath(MOVIE_TITLE)).getText();
        click(WATCH_LATER_LIST_BUTTON);
        click(WatchLaterMoviePage.getFirstMovieFromList());
        waitVisibility(MOVIE_TITLE);
        String headerMovie2= driver.findElement(By.xpath(MOVIE_TITLE)).getText();

        if (headerMovie1.equals(headerMovie2)){
            return true;
        }else{
            return false;
        }
    }

}