package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    protected void setup() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();

        //System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       // driver = new ChromeDriver();
    }

    @AfterMethod
    protected void quit() {
        driver.quit();
    }
}