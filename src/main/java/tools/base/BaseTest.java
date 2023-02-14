package tools.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://store.steampowered.com/");
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
