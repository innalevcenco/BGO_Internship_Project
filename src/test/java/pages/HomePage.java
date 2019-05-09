package pages;

import lombok.Getter;
import lombok.Setter;

public class HomePage {
    @Getter
    private final String HOME_PAGE = "https://www.kinopoisk.ru/";
    @Getter
    private final String SEARCH_FIELD = "//input[@name='kp_query']";
    @Getter
    private final String SEARCH_BUTTON = "//a[@class='header-fresh-search-partial-component__advanced-search-button']";
    @Getter
    private final String MY_PROFILE_BUTTON = "//*[@id=\"partial_component__header-topline\"]/div/div/div[1]/div/div[2]/div[3]/div/button";
    @Getter
    private final String WILL_WATCH_BUTTON = "//*[@id=\"partial_component__header-topline\"]/div/div/div[1]/div/div[1]/div[3]/a/span";
    @Getter
    private final String ФИЛЬМЫ_BUTTON = "//*[@id=\"partial_component__header-topline\"]/div/div/div[1]/div/div[1]/div[3]/div/div[2]/div/ul/div[2]/li[1]/a/div";

    public HomePage() {
    }
}
