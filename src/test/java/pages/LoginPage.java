package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private final WebDriver driver;
    private final By username = By.xpath("//*[@id='passp-field-login']");
    private final By password = By.xpath("//*[@id='passp-field-passwd']");
    private final By homeEnterButton = By.xpath("//*[@id='partial_component__header-topline']/div/div/div[1]/div/div[1]/div[3]/div/button");
    private final By usernameEnterButton = By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[3]/button[1]");
    private final By passwordEnterButton = By.xpath("//*[@id='root']/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[2]/button[1]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String value) {
        WebElement element = driver.findElement(username);
        element.clear();
        element.sendKeys(value);
    }

    public void setPassword(String value) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(password));
        element.clear();
        element.sendKeys(value);
    }

    public By homeEnterButton() {
        return homeEnterButton;
    }

    public By usernameEnterButton() {
        return usernameEnterButton;
    }

    public By passwordEnterButton() {
        return passwordEnterButton;
    }

    public void buttonClick(By value) {
        WebElement element = driver.findElement(value);
        element.click();
    }
}