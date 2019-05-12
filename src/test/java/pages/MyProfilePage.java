package pages;

public class MyProfilePage {
    private static final String WILL_WATCH_FOLDER = "//*[@id='div_mustsee_main']/div/div/div[1]/span[1]";
    private static final String NOTE_FOLDER = "//*[@id='folder_142498']/a";

    public static String getWillWatchFolder() {
        return WILL_WATCH_FOLDER;
    }

    public static String getNoteFolder() {
        return NOTE_FOLDER;
    }
}
