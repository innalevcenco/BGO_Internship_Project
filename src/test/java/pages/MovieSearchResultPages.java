package pages;

import lombok.Getter;

public class MovieSearchResultPages {
    @Getter
    private final String FIRST_DISPLAYED_MOVIE = "//*[@id=block_left_pad]/div/div[2]/div/div[2]/p/a";
    @Getter
    private final String LOST_MOVIE_DETAILS = "https://www.kinopoisk.ru/film/104122/";
    @Getter
    private final String BEAST_MOVIE_DETAILS = "https://www.kinopoisk.ru/film/996062/";
    @Getter
    private final String Буду_смотреть_BUTTON = "//*[@id=select_582101]/span[1]/b";

    public MovieSearchResultPages() {
    }
}
