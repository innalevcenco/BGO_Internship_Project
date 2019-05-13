package browser;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";
    private static final String CHROME_PATH = "src/test/resources/drivers/chromedriver.exe";
    private static final String EXPLORER_PROPERTY = "webdriver.ie.driver";
    private static final String EXPLORER_PATH = "src/test/resources/drivers/IEdriver.exe";
    private static final String FIREFOX_PROPERTY = "webdriver.gecko.driver";
    private static final String FIREFOX_PATH = "src/test/resources/drivers/geckodriver.exe";
    private static WebDriver driver = null;

    public static WebDriver initializeDriver() {

        ConfigFileReader reader = new ConfigFileReader();
        WebDriver localDriver = driver;

        if (localDriver == null) {
//            synchronized (Driver.class) {
            localDriver = driver;
            if (localDriver == null) {
                if (reader.getBrowserName().equalsIgnoreCase("chrome")) {
                    System.setProperty(CHROME_PROPERTY, CHROME_PATH);
                    driver = new ChromeDriver();
                } else if (reader.getBrowserName().equalsIgnoreCase("firefox")) {
                    System.setProperty(FIREFOX_PROPERTY, FIREFOX_PATH);
                    driver = new FirefoxDriver();
                    driver.get("http://seleniumhq.com");
                } else if (reader.getBrowserName().equalsIgnoreCase("explorer")) {
                    System.setProperty(EXPLORER_PROPERTY, EXPLORER_PATH);
                    driver = new InternetExplorerDriver();
                } else {
                    System.out.println("driver details are not specified in the Configuration.properties file");
                    driver = new EdgeDriver();
                }
            }

//            }
        }
        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quit() {
        driver.quit();
        driver = null;
    }
}
