package hw8.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
	private WebDriver driver;
	private By userInput = By.xpath("//input[@formcontrolname='username']");
    private By passwordInput = By.xpath("//input[@formcontrolname='password']");
    private By signButton = By.xpath("//button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void doLogin(String userName, String password) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(userInput).sendKeys(userName);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(signButton).click();
    }
}
