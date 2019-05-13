package pages;

public class FavouriteMoviePage {

    private static final String FIRST_MOVIE_FROM_LIST ="//*[@id='itemList']/li[1]/div[3]/div[1]/a/img";


    public static String getFirstMovieFromList() {
        return FIRST_MOVIE_FROM_LIST;
    }
}
