package pages;

public class MessagesPage extends CommonActions{

    private static final String inboxPageURL = "https://www.kinopoisk.ru/mykp/inbox/";
    private static final String sendMessagePageURL = "https://www.kinopoisk.ru/mykp/sendmessage/";
    private static final String newMessageText = "//*[@id='content_block']/table/tbody/tr/td/form/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/table/tbody/tr/td/p/span";
    private static final String newMessageLink = "//*[@id='content_block']/table/tbody/tr/td/form/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[1]/td[2]/a";
    private static final String receiversField = "//*[@id='sendmessage_form']/tbody/tr[1]/td/div/div[1]";
    private static final String receiver = "//*[@id='ps_user_to']";

    private static final String themeField = "//*[@id='ps_title']";
    private static final String messageField = "//*[@id='sendmail_data_text']";
    private static final String sendButton = "//*[@id='btn_submit']";


    public static String getNewMessageLink() {
        return newMessageLink;
    }

    public static String getInboxPageURL() {
        return inboxPageURL;
    }

    public static String getSendMessagePageURL() {
        return sendMessagePageURL;
    }

    public static String getNewMessageText() {
        return newMessageText;
    }

    public static String getReceiversField() {
        return receiversField;
    }

    public static String getThemeField() {
        return themeField;
    }

    public static String getMessageField() {
        return messageField;
    }

    public static String getSendButton() {
        return sendButton;
    }

    public static String getReceiver() {
        return receiver;
    }
}






