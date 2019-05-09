package pages;

import lombok.Getter;

public class ProfilePage {

    private static final String WILL_WATCH_LIST = "//*[@id=folder_3575]/a";

    public static String getWillWatchList() {
        return WILL_WATCH_LIST;
    }

    public static String getFavoriteList() {
        return FAVORITE_LIST;
    }

    private static final String FAVORITE_LIST = "//*[@id=folder_6]/a";
}
