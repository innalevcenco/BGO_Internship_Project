package browser;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Driver {

    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";
    private static final String CHROME_PATH = "src/test/resources/drivers/chromedriver.exe";
    private static final String EXPLORER_PROPERTY = "webdriver.ie.driver";
    private static final String EXPLORER_PATH = "src/test/resources/drivers/IEdriver.exe";
    private static WebDriver driver;


    public Driver() {
    }

    public static WebDriver initializeDriver() {
        ConfigFileReader reader = new ConfigFileReader();
        if (driver == null) {
            if (reader.getBrowserName().equalsIgnoreCase("chrome")) {
                System.setProperty(CHROME_PROPERTY, CHROME_PATH);
                driver = new ChromeDriver();
            } else if (reader.getBrowserName().equalsIgnoreCase("explorer")) {
                System.setProperty(EXPLORER_PROPERTY, EXPLORER_PATH);
                driver = new InternetExplorerDriver();
            } else {
                System.out.println("driver details are not specified in the Configuration.properties file");
                driver = new EdgeDriver();
            }
        }
        return driver;
    }
}
