package pages;


import hooks.StepHooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoviePage extends CommonActions{

    public WebDriver driver = StepHooks.getDriver();
    private static final String WATCH_LATER_BUTTON ="//*[@id='div_mustsee_main']/div/div/div[1]/span[1]";
    private static final String MOVIE_TITLE ="//*[@id='headerFilm']/h1";
    private static final String FAVORITES_BUTTON="//*[@id='btn_fav_film']";
    private static final String WATCH_LATER_LIST_BUTTON="//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/a/span";
    private static final String FAVORITES_LIST_BUTTON="//*[@id='ms_folder_6']/a";
    private static final String ADD_MOVIE_FIELD = "//*[@id='qaInput']";
    private static final String FIRST_DISPLAYED_FIELD_UNDER_SEARCHBAR = "//*[@id='ui-id-2']/span";
    private static final String MOVIE_CHECKBOX = "//*[@id='selectAllbox']";
    private static final String MOVIE_CHECKBOX_FOR_DELETE_WACHEDMOVIES = "//input[@name='auto_clear_after_vote']";
    private static final String SAVE_NEW_CREATED_FOLDER = "//input[@style='width: 130px; font-weight: bold; margin-top: 10px']";
    private static final String NOTE_FOLDER = "//*[@id='folder_142498']/a";

    public static String getAddMovieField() {
        return ADD_MOVIE_FIELD;
    }

    public static String getFirstDisplayedFieldUnderSearchbar() {
        return FIRST_DISPLAYED_FIELD_UNDER_SEARCHBAR;
    }

    public static String getMovieCheckbox() {
        return MOVIE_CHECKBOX;
    }

    public static String getMovieCheckboxForDeleteWachedmovies() {
        return MOVIE_CHECKBOX_FOR_DELETE_WACHEDMOVIES;
    }

    public static String getSaveNewCreatedFolder() {
        return SAVE_NEW_CREATED_FOLDER;
    }

    public static String getNoteFolder() { return NOTE_FOLDER; }

    public static String getFavoritesListButton() { return FAVORITES_LIST_BUTTON; }

    public static String getWatchLaterButton() { return WATCH_LATER_BUTTON; }

    public static String getMovieTitle() { return MOVIE_TITLE; }

    public static String getFavoritesButton() { return FAVORITES_BUTTON; }


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
        driver.navigate().refresh();
        waitSpecificAmountOfTime(4);

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


