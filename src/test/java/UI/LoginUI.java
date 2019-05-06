package UI;

public class LoginUI {

    private static final String LOGIN_PAGE="https://passport.yandex.ru/auth/list?origin=kinopoisk&retpath=https%3A%2F%2Fsso.passport.yandex.ru%2Fpush%3Fretpath%3Dhttps%253A%252F%252Fwww.kinopoisk.ru%252Fapi%252Fprofile-pending%252F%253Fretpath%253Dhttps%25253A%25252F%25252Fwww.kinopoisk.ru%25252F%26uuid%3D53c4f577-2bb7-46a0-9f32-465d62186533";
    private static final String USERNAME_FIELD="//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[1]/div[1]/label";
    private static final String PASSWORD_FIELD="//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[1]/div/div[1]/label";
    private static final String GETIN_BUTTON="//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[3]/button[1]";

    public static String getGetinButton() {
        return GETIN_BUTTON;
    }

    public static String getLoginPage() {
        return LOGIN_PAGE;
    }

    public static String getUsernameField() {
        return USERNAME_FIELD;
    }

    public static String getPasswordField() {
        return PASSWORD_FIELD;
    }


    //    static WebDriver driver;
//
//    // In order to use the PageFactory, first declare some fields on a PageObject that are WebElements
//
//    static WebElement log;
//
//    static WebElement pwd;
//
//    static WebElement submit;
//
////    @FindBy(how = How.ID, using = "log")
////    public WebElement txtbx_UserName;
////
////    @FindBy(how = How.ID, using = "pwd")
////    public WebElement txtbx_Password;
////
////    @FindBy(how = How.NAME, using = "submit")
////    public WebElement btn_Login;
////
////    public LogInUI(WebDriver driver) {
////        this.driver = driver;
////    }
//
//// This method will take two arguments ( Username nd Password)
//
//    public void LogInAction() {
//
//        driver = new ChromeDriver ();
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.get("https://www.kinopoisk.ru/");
//
//        // In order for this code to work and not throw a NullPointerException because
//
//        // the "log", "pwd" nd "submit" fields aren't instantiated, we need to initialise the PageObject
//
//        PageFactory.initElements(driver, Login.class);
//
//        // Once Instantiated, we can now use the above created WebElements
//
//        log.sendKeys("alexandrugrama");
//
//        pwd.sendKeys("cablu21");
//
//        submit.click();
//
//
//    }
}
