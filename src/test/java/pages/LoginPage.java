package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private final WebDriver driver;
    private final String usernameLocator = "//*[@id='passp-field-login']";
    private final String passwordLocator = "//*[@id='passp-field-passwd']";
    private final String homeEnterButtonLocator = "//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/div/button";
    private final String usernameEnterButtonLocator = "//*[@id='root']/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[3]/button[1]";
    private final String passwordEnterButtonLocator = "//*[@id='root']/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[2]/button[1]";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String value) {
        WebElement element = driver.findElement(By.xpath(usernameLocator));
        element.clear();
        element.sendKeys(value);
    }

    public void setPassword(String value) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(passwordLocator)));
        element.clear();
        element.sendKeys(value);
    }

    public String homeEnterButton() {
        return homeEnterButtonLocator;
    }

    public String usernameEnterButton() {
        return usernameEnterButtonLocator;
    }

    public String passwordEnterButton() {
        return passwordEnterButtonLocator;
    }

    public void buttonClick(String value) {
        WebElement element = driver.findElement(By.xpath(value));
        element.click();
    }
}