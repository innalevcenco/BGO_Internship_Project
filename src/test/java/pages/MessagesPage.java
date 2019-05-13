package pages;

import commonActions.CommonActions;

public class MessagesPage extends CommonActions {

    private static final String INBOX_PAGE_URL = "https://www.kinopoisk.ru/mykp/inbox/";
    private static final String NEW_MESSAGE_TEXT = "//*[@id='content_block']/table/tbody/tr/td/form/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td/p/span";
    private static final String NEW_MESSAGE_LINK = "//*[@id='content_block']/table/tbody/tr/td/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[1]/td[2]/a";
    private static final String RECEIVER = "//*[@id='ps_user_to']";
    private static final String MESSAGE_FIELD = "//*[@id='sendmail_data_text']";
    private static final String SEND_BUTTON = "//*[@id='btn_submit']";

    public static String getInboxPageUrl() {
        return INBOX_PAGE_URL;
    }

    public static String getNewMessageText() {
        return NEW_MESSAGE_TEXT;
    }

    public static String getNewMessageLink() {
        return NEW_MESSAGE_LINK;
    }

    public static String getRECEIVER() {
        return RECEIVER;
    }

    public static String getMessageField() {
        return MESSAGE_FIELD;
    }

    public static String getSendButton() {
        return SEND_BUTTON;
    }
}



