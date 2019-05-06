package UI;

public class HomeUI {
    private static final String HOME_PAGE="https://www.kinopoisk.ru/";
    private static final String SEARCH_FIELD="//*[@id=\"partial_component__header-topline\"]/div/div/div[1]/div/div[2]/div[2]/form/div/input[1]";
    private static final String SEARCH_BUTTON="//*[@id=\"partial_component__header-topline\"]/div/div/div[1]/div/div[2]/div[2]/form/div/div[1]/button";


    public static String getHomePage() {
        return HOME_PAGE;
    }

    public static String getSearchField() {
        return SEARCH_FIELD;
    }

    public static String getSearchButton() {
        return SEARCH_BUTTON;
    }
}
