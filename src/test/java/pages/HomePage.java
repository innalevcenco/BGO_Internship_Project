package pages;

public class HomePage {

    private static final String HOME_PAGE = "https://www.kinopoisk.ru/";
    private static final String SEARCH_FIELD = "//input[@name='kp_query']";
    private static final String ADVANCED_SEARCH_BUTTON = "//a[@class='header-fresh-search-partial-component__advanced-search-button']";
    private static final String SEARCH_BUTTON = "//button[@class='header-fresh-search-partial-component__button']";
    private static final String MY_PROFILE_BUTTON = "//span[@class='header-fresh-user-partial-component__avatar-hover']";
    private static final String WILL_WATCH_BUTTON = "//*[@class='header-fresh-partial-component__film-to-watch-button-text']";
    private static final String MOVIES_BUTTON = "//a[@class='header-fresh-user-partial-component__dropdown-navigation-link']";
    private static final String LOG_OUT_BUTTON = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/div/div[1]/div/span";
    private static final String MESSAGES_BUTTON = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/div/div[2]/div/ul/div[3]/li[1]/a";
    private static final String RAND_SEARCH_BUTTON="//button[@class='header-fresh-search-partial-component__button']";
    private static final String WEEKEND_RESULTS="//*[@id='block_right']/dl[2]/dt/a";
    private static final String MEDIA ="//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/nav/ul/li[4]/a";

    public static String getMEDIA() { return MEDIA; }

    public static String getWeekendResults() {
        return WEEKEND_RESULTS;
    }

    public static String getHomePage() {
        return HOME_PAGE;
    }

    public static String getSearchField() {
        return SEARCH_FIELD;
    }

    public static String getMyProfileButton() {
        return MY_PROFILE_BUTTON;
    }

    public static String getSearchButton() {
        return SEARCH_BUTTON;
    }

    public static String getWillWatchButton() {
        return WILL_WATCH_BUTTON;
    }

    public static String getMoviesButton() { return MOVIES_BUTTON; }

    public static String getLogOutButton() {
        return LOG_OUT_BUTTON;
    }

    public static String getMessagesButton() {
        return MESSAGES_BUTTON;
    }

    public static String getAdvancedSearchButton() {
        return ADVANCED_SEARCH_BUTTON;
    }

    public static String getRandSearchButton() {
        return RAND_SEARCH_BUTTON;
    }
}








