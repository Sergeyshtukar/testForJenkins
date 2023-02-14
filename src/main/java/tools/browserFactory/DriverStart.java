package tools.browserFactory;

import org.openqa.selenium.WebDriver;
import tools.utils.ReadProperty;

public class DriverStart {
    private static WebDriver driver = null;
    private static DriverStart driverStartInstance = null;
    private static final String URL = ReadProperty.getProperty("url");
    private static final String BROWSER = ReadProperty.getProperty("browser");

    private DriverStart() {
        driver = Browsers.getBrowser(BROWSER);
        if (driver != null) {
            driver.manage().window().maximize();
            driver.navigate().to(URL);
        }
    }

    public static DriverStart getInstance() {
        if (driverStartInstance == null) {
            driverStartInstance = new DriverStart();
        }
        return driverStartInstance;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void quit() {
        driver.quit();
    }
}
