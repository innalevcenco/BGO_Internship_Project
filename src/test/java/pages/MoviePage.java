package pages;


import browser.Driver;
import commonActions.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviePage extends CommonActions {

    private static final String WATCH_LATER_BUTTON = "//span[@title='добавить в Мои фильмы']";
    private static final String WATCH_LATER_AFER_BUTTON="//*[@id=\"div_mustsee_main\"]/div/div/div[1]/div/dl/dd[1]";
    private static final String WATCH_LATER_ARROW_BUTTON="//*[@id=\"div_mustsee_main\"]/div/div/div[1]/span[2]";
    private static final String MOVIE_TITLE = "//*[@id='headerFilm']/h1";
    private static final String FAVORITES_BUTTON = "//*[@id='btn_fav_film']";
    private static final String FAVORITES_LIST_BUTTON = "//*[@id='ms_folder_6']/a";
    private static final String FAVORITES_AFTER_BUTTON="//*[@id=\"div_mustsee_main\"]/div/div/div[1]/div/dl/dd[2]";
    private static final String NOTE_FOLDER = "//*[@id='folder_142498']/a";
    private static final String FIRST_CREATED_FOLDER = "//*[@id='folder_10291']/a";
    private static final String CREATE_NEW_FOLDER = "//div[@class='createButton']";
    private static final String MOVIE_COMMENT = "//*[@id='txt_film_notice']/div[1]";
    private static final String WATCH_LATER_LIST_BUTTON = "//span[@class='header-fresh-partial-component__film-to-watch-button-text']";
    public WebDriver driver = Driver.getDriver();

    public static String getWatchLaterAferButton() { return WATCH_LATER_AFER_BUTTON; }

    public static String getMovieComment() {
        return MOVIE_COMMENT;
    }

    public static String getCreateNewFolder() {
        return CREATE_NEW_FOLDER;
    }

    public static String getFirstCreatedFolder() {
        return FIRST_CREATED_FOLDER;
    }

    public static String getNoteFolder() {
        return NOTE_FOLDER;
    }

    public static String getFavoritesListButton() {
        return FAVORITES_LIST_BUTTON;
    }

    public static String getWatchLaterButton() {
        return WATCH_LATER_BUTTON;
    }

    public static String getMovieTitle() {
        return MOVIE_TITLE;
    }

    public static String getFavoritesButton() {
        return FAVORITES_BUTTON;
    }


    public boolean checkIfMovieAddedToFavouriteList(){
        String headerMovie1= driver.findElement(By.xpath(MOVIE_TITLE)).getText();
        driver.findElement(By.xpath(FAVORITES_LIST_BUTTON)).click();
        waitVisibility(FavouriteMoviePage.getFirstMovieFromList());
        driver.findElement(By.xpath(FavouriteMoviePage.getFirstMovieFromList())).click();
        waitVisibility(MOVIE_TITLE);

        String headerMovie2=driver.findElement(By.xpath(getMovieTitle())).getText();

        if (headerMovie1.equals(headerMovie2)){
            return true;
        }else{
            return false;
        }
    }

    public boolean checkIfMovieAddedToWatchLaterList(){
        String headerMovie1= driver.findElement(By.xpath(MOVIE_TITLE)).getText();
        click(WATCH_LATER_LIST_BUTTON);
        click(WillWatchFolderPage.getFirstMovieFromList());
        waitVisibility(MOVIE_TITLE);
        String headerMovie2= driver.findElement(By.xpath(MOVIE_TITLE)).getText();

        if (headerMovie1.equals(headerMovie2)){
            return true;
        }else{
            log.error("movie is not the same, probably it was not added to list");
            return false;
        }
    }

    public void removeFromWAtchLaterList(){
        click(WATCH_LATER_ARROW_BUTTON);
        click(WATCH_LATER_AFER_BUTTON);
    }

    public void removeFromFavoritesList(){
        click(WATCH_LATER_ARROW_BUTTON);
        click(FAVORITES_AFTER_BUTTON);
    }
}