package tools.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private static final WebDriver driver = new ChromeDriver();

    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://store.steampowered.com/");
    }

    public void tearDown() {
        driver.close();
        driver.quit();
    }
}
