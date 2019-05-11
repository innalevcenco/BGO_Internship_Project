package pages;


public class MoviePage {

    private static final String WILL_WATCH_FOLDER = "//*[@id='folder_3575']/a";
    private static final String FAVORITE_FOLDER = "//*[@id='folderList']/li/a";
    private static final String CREATE_NEW_FOLDER = "//*[@id='content_block']/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/div/div[1]/div[3]";
    private static final String ADD_MOVIE_FIELD = "//*[@id='qaInput']";
    private static final String FIRST_CREATED_FOLDER = "//*[@id='folder_10291']/a";
    //*[@id="content_block"]/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/div/ul[2]/li/a
    private static final String FIRST_DISPLAYED_FIELD_UNDER_SEARCHBAR = "//*[@id='ui-id-2']/span";
    private static final String MOVIE_CHECKBOX = "//*[@id='selectAllbox']";
    private static final String MOVIE_CHECKMARK_FOR_DELETE_WACHEDMOVIES = "//*[@id='content_block']/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/div[2]/div[4]/table/tbody/tr[3]/td[2]/input[1]";
    private static final String SAVE_NEW_CREATED_FOLDER = "//*[@id='content_block']/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/div[2]/div[4]/table/tbody/tr[3]/td[2]/input[2]";
    private static final String REMOVE_FOLDER = "//*[@id='folder_10291']/div";
    private static final String NOTE_FOLDER = "//*[@id='folder_142498']/a";


    public static String getWillWatchFolder() {
        return WILL_WATCH_FOLDER;
    }

    public static String getFavoriteFolder() {
        return FAVORITE_FOLDER;
    }

    public static String getCreateNewFolder() {
        return CREATE_NEW_FOLDER;
    }

    public static String getAddMovieField() {
        return ADD_MOVIE_FIELD;
    }

    public static String getFirstCreatedFolder() {
        return FIRST_CREATED_FOLDER;
    }

    public static String getFirstDisplayedFieldUnderSearchbar() {
        return FIRST_DISPLAYED_FIELD_UNDER_SEARCHBAR;
    }

    public static String getMovieCheckbox() {
        return MOVIE_CHECKBOX;
    }

    public static String getMovieCheckmarkForDeleteWachedmovies() {
        return MOVIE_CHECKMARK_FOR_DELETE_WACHEDMOVIES;
    }

    public static String getSaveNewCreatedFolder() {
        return SAVE_NEW_CREATED_FOLDER;
    }

    public static String getRemoveFolder() { return REMOVE_FOLDER; }

    public static String getNoteFolder() { return NOTE_FOLDER; }
}


