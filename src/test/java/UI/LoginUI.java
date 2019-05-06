package UI;

public class LoginUI {

    public static final String USERNAME_FIELD="passp-field-login";
    public static final String PASSWORD_FIELD="passp-field-passwd";
    public static final String SUBMIT_USERNAME_BUTTON="//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[3]/button[1]";
    public static final String SUBMIT_PASSWORD_BUTTON="//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[2]/button[1]";


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
