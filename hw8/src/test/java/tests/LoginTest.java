package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import hw8.pages.LoginPage;

class LoginTest {
	private static WebDriver driver;
	
	@BeforeAll
    public static void init() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }

	@Test
    public void testLogin() throws InterruptedException {
        driver.get("https://app.tca.deltixuat.com/");
        driver.manage().window().maximize();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("selenium_chrome", "Axa@Demo");
        Thread.sleep(10000);
        
        Assertions.assertEquals("ALL", driver.findElement(By.xpath("//div[@data-id='v1-h1']//div[@class='flex-1 overflow-auto']//div[@class='text-right simple-table__header-title']")).getText());
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

}
