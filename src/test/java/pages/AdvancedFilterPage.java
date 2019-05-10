package pages;

public class AdvancedFilterPage extends CommonActions {

    private static final String ADVANCED_SEARCH_PAGE_URL = "https://www.kinopoisk.ru/s/";
    private static final String resultPageURL = "https://www.kinopoisk.ru/lists/m_act[country]/1/";
    private static final String countryFiled = "//*[@id='country']";
    private static final String actorField = "//*[@id='formSearchMain']/input[8]";
    private static final String searchButton = "//*[@id='formSearchMain']/input[11]";
    private static final String resultOfSearchBlock = "//*[@id='block_left_pad']/div/div[2]";

    public static String getCountryFiled() {
        return countryFiled;
    }

    public static String getActorField() {
        return actorField;
    }

    public static String getSearchButton() {
        return searchButton;
    }

    public static String getAdvancedSearchPageUrl() {
        return ADVANCED_SEARCH_PAGE_URL;
    }

    public static String getResultPageURL() {
        return resultPageURL;
    }

    public static String getResultOfSearchBlock() {
        return resultOfSearchBlock;
    }
}