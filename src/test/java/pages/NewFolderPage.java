package pages;

public class NewFolderPage {
    private static final String ADD_MOVIE_FIELD = "//*[@id='qaInput']";
    private static final String FIRST_DISPLAYED_FIELD_UNDER_SEARCHBAR = "//*[@id='ui-id-2']/span";
    private static final String MOVIE_CHECKBOX = "//*[@id='selectAllbox']";
    private static final String REMOVE_MOVIE_FROM_FOLDER = "//a[@class='remove']";
    private static final String CHECKBOX_FOR_DELETE_WACHEDMOVIES = "//input[@name='auto_clear_after_vote']";
    private static final String SAVE_NEW_CREATED_FOLDER = "//input[@style='width: 130px; font-weight: bold; margin-top: 10px']";

    public static String getAddMovieField() {
        return ADD_MOVIE_FIELD;
    }

    public static String getRemoveMovieFromFolder() {
        return REMOVE_MOVIE_FROM_FOLDER;
    }

    public static String getMovieCheckbox() {
        return MOVIE_CHECKBOX;
    }

    public static String getCheckboxForDeleteWachedmovies() {
        return CHECKBOX_FOR_DELETE_WACHEDMOVIES;
    }

    public static String getFirstDisplayedFieldUnderSearchbar() {
        return FIRST_DISPLAYED_FIELD_UNDER_SEARCHBAR;
    }

    public static String getSaveNewCreatedFolder() {
        return SAVE_NEW_CREATED_FOLDER;
    }
}
