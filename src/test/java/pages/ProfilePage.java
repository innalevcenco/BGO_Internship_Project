package pages;


public class ProfilePage {

    private static final String WILL_WATCH_LIST = "//*[@id=folder_3575]/a";
    private final String FAVORITE_LIST = "//*[@id=folder_6]/a";

    public static String getWillWatchList() {
        return WILL_WATCH_LIST;
    }
}


