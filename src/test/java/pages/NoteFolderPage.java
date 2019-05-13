package pages;

public class NoteFolderPage {
    private static final String REMOVE_NOTE_BUTTON = "//*[@id='txt_film_notice']/div[2]/a[2]";

    public static String getRemoveNoteButton() {
        return REMOVE_NOTE_BUTTON;
    }
}
