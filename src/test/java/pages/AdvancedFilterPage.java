package pages;

public class AdvancedFilterPage extends CommonActions {

    private static final String ADVANCED_SEARCH_PAGE_URL = "https://www.kinopoisk.ru/s/";
    private static final String resultPageURL = "https://www.kinopoisk.ru/lists/m_act[country]/1/";
    private static final String countryFiled = "//*[@id='country']";
    private static final String actorField = "//*[@id='formSearchMain']/input[8]";
    private static final String searchButton = "//*[@id='formSearchMain']/input[11]";
    private static final String resultOfSearchBlock = "//*[@id='block_left_pad']/div/div[2]";
    private static final String YEAR_FIELD = "//*[@id='year']";
    private static final String NOTES_BUTTON = "//*[@id='btn_film_notice']";
    private static final String NOTES_FRAME = "//*[@id='ta_film_notice']/form/textarea";


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

    public static String getResultOfSearchBlock() {
        return resultOfSearchBlock;
    }

    public static String getYearField() {
        return YEAR_FIELD;
    }

    public static String getNotesButton() {
        return NOTES_BUTTON;
    }

    public static String getNotesFrame() {
        return NOTES_FRAME;
    }
}