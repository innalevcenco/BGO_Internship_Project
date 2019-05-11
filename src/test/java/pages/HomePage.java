package pages;


public class HomePage {

    private static final String HOME_PAGE = "https://www.kinopoisk.ru/";
    private static final String SEARCH_FIELD = "//input[@name='kp_query']";
    private static final String SEARCH_BUTTON = "//a[@class='header-fresh-search-partial-component__advanced-search-button']";
    private static final String MY_PROFILE_BUTTON = "//*[@id=\"partial_component__header-topline\"]/div/div/div[1]/div/div[1]/div[3]/div/div[1]/div/span";
    private static final String WILL_WATCH_BUTTON = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/a/span";
    private static final String MOVIES_BUTTON = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/div/div[2]/div/ul/div[2]/li[1]/a/div";
    private static final String LOG_OUT_BUTTON = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/div/div[1]/div/span";
    private static final String MESSAGES_BUTTON = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/div/div[2]/div/ul/div[3]/li[1]/a";
    private static final String LOG_IN_BUTTON = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[2]/div[3]/div/button";
    private static final String ADVANCED_SEARCH_BUTTON = "//*[@id=\"partial_component__header-topline\"]/div/div/div[1]/div/div[1]/div[2]/form/div/div[1]/a";

    public static String getHomePage() {
        return HOME_PAGE;
    }

    public static String getSearchField() {
        return SEARCH_FIELD;
    }

    public static String getSearchButton() {
        return SEARCH_BUTTON;
    }

    public static String getMyProfileButton() {
        return MY_PROFILE_BUTTON;
    }

    public static String getWillWatchButton() {
        return WILL_WATCH_BUTTON;
    }

    public static String getMoviesButton() {
        return MOVIES_BUTTON;
    }

    public static String getLogOutButton() {
        return LOG_OUT_BUTTON;
    }

    public static String getMessagesButton() {
        return MESSAGES_BUTTON;
    }

    public static String getLogInButton() {
        return LOG_IN_BUTTON;
    }

    public static String getAdvancedSearchButton() {
        return ADVANCED_SEARCH_BUTTON;
    }

    public HomePage() {
    }
}







