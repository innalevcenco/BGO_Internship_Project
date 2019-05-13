package pages;

public class AdvancedFilterPage {

    private static final String ADVANCED_SEARCH_PAGE_URL = "https://www.kinopoisk.ru/s/";
    private static final String COUNTRY_FIELD = "//*[@id='country']";
    private static final String ACTOR_FIELD = "//*[@id='formSearchMain']/input[8]";
    private static final String GENRE_FIELD = "//*[@id='m_act[genre]']";
    private static final String SEARCH_BUTTON = "//*[@id='formSearchMain']/input[11]";
    private static final String RESULT_OF_SEARCH_BLOCK = "//*[@id='block_left_pad']/div/div[2]";
    private static final String YEAR_FIELD = "//*[@id='year']";
    private static final String COMEDY_OPTION_FIELD2 = "//*[@id='m_act[genre]']/option[6]";

    public static String getComedyOptionField2() {
        return COMEDY_OPTION_FIELD2;
    }

    public static String getCountryField() {
        return COUNTRY_FIELD;
    }

    public static String getActorField() {
        return ACTOR_FIELD;
    }

    public static String getSearchButton() {
        return SEARCH_BUTTON;
    }

    public static String getAdvancedSearchPageUrl() {
        return ADVANCED_SEARCH_PAGE_URL;
    }

    public static String getResultOfSearchBlock() {
        return RESULT_OF_SEARCH_BLOCK;
    }

    public static String getYearField() {
        return YEAR_FIELD;
    }

    public static String getGenreField() {
        return GENRE_FIELD;
    }

}