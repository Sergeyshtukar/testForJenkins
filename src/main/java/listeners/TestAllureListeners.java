package listeners;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import tools.browserFactory.DriverStart;

public class TestAllureListeners {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return ((TakesScreenshot) DriverStart.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    public void onTestFailure() {
        WebDriver driver = DriverStart.getInstance().getDriver();
        // Allure ScreenShotRobot
        if (driver instanceof WebDriver) {
            saveScreenshot();
        }
    }
}
