package browser;

import dataProvider.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

    private static WebDriver driver;
    private static String CHROME_PROPERTHY= "webdriver.chrome.driver";
    private static String CHROME_PATH = "src/test/resources/drivers/chromedriver.exe";
    private static String EXPLORER_PROPERTY = "webdriver.edge.driver";
    private static String EXPLORER_PATH= "src/test/resources/drivers/IEDriverServer.exe";

    private Driver() {
    }

    public static WebDriver initializeDriver() {
        if (driver == null) {
            if (ConfigFileReader.getBrowserName().equalsIgnoreCase("chrome")) {
                System.setProperty(CHROME_PROPERTHY, CHROME_PATH);
                return driver = new ChromeDriver();
            } else if (ConfigFileReader.getBrowserName().equalsIgnoreCase("explorer")) {
                System.setProperty(EXPLORER_PROPERTY, EXPLORER_PATH);
                return driver = new EdgeDriver();
            }
            else throw new RuntimeException ( "driver details are not specified in the Configuration.properties file" );
        }

        return null;
    }
}
