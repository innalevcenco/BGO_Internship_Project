package browser;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

    private static WebDriver driver;
    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";
    private static final String CHROME_PATH = "src/test/resources/drivers/chromedriver.exe";
    private static final String EXPLORER_PROPERTY = "webdriver.ie.driver";
    private static final String EXPLORER_PATH = "src/test/resources/drivers/IEdriver.exe";
    private static final String EDGE_PROPERTY = "webdriver.edge.driver";
    private static final String EDGE_PATH = "src/test/resources/drivers/msedgedriver.exe";

    public Driver() {
    }

    public static WebDriver initializeDriver() {
        ConfigFileReader reader = new ConfigFileReader();
//        if (driver == null) {
        if (reader.getBrowserName().equalsIgnoreCase("chrome")) {
            System.setProperty(CHROME_PROPERTY, CHROME_PATH);
            return driver = new ChromeDriver();
        } else if (reader.getBrowserName().equalsIgnoreCase("explorer")) {
            System.setProperty(EXPLORER_PROPERTY, EXPLORER_PATH);
            return driver = new InternetExplorerDriver();
        }
        else if (reader.getBrowserName().equalsIgnoreCase("edge")) {
            System.setProperty(EDGE_PROPERTY, EDGE_PATH);
            return driver = new EdgeDriver();
        } else {
            System.out.println("driver details are not specified in the Configuration.properties file");
            return driver = new EdgeDriver();
        }

//        }
//        return driver;
    }
}