package pages;

public class MyProfilePage {
    private static final String WILL_WATCH_FOLDER = "//*[@id='div_mustsee_main']/div/div/div[1]/span[1]";
    private static final String NOTE_FOLDER = "//*[@id='folder_142498']/a";
    private static final String REMOVE_FOLDER = "//*[@id='folder_10291']/div";
    private static final String FAVORITE_FOLDER = "//*[@id='folderList']/li/a";
    private static final String FIRST_CREATED_FOLDER = "//*[@id='folder_10291']/a";
    private static final String CREATE_NEW_FOLDER = "//*[@id='content_block']/table/tbody/tr/td/form/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/div/div[1]/div[3]";

    public static String getWillWatchFolder() {
        return WILL_WATCH_FOLDER;
    }

    public static String getNoteFolder() {
        return NOTE_FOLDER;
    }

    public static String getRemoveFolder() { return REMOVE_FOLDER; }

    public static String getFavoriteFolder() { return FAVORITE_FOLDER; }

    public static String getCreateNewFolder() { return CREATE_NEW_FOLDER; }

    public static String getFirstCreatedFolder() {
        return FIRST_CREATED_FOLDER;
    }
}
