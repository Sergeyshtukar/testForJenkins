package tools.browserFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
    private static WebDriver driver;

    private Browsers() {
    }

    public static WebDriver getBrowser(String browser) {
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                try {
                    throw new Exception("No such browser");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
        return driver;
    }
}
