package pages;

public class PersonalizedPage {

    private static final String blockWithResultSearch = "//*[@id='block_left_pad']";
    private static final String photoInfoTable = "//*[@id='photoInfoTable']";
    private static final String addToCategoryActorsButton = "//*[@id='div_mustsee_main']/div/div/div/div/dl/dd[2]";
    private static final String arrow = "//*[@id='div_mustsee_main']/div/div/div[1]/span[2]/div";
    private static final String actorsFolder = "//*[@id='div_mustsee_main']/div/div/ul";

    public static String getBlockWithResultSearch() {
        return blockWithResultSearch;
    }

    public static String getAddToCategoryActorsButton() {
        return addToCategoryActorsButton;
    }

    public static String getPhotoInfoTable() {
        return photoInfoTable;
    }

    public static String getActorsFolder() {
        return actorsFolder;
    }

    public static String getArrow() {
        return arrow;
    }

}
