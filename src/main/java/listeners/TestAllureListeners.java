package listeners;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import tools.browserFactory.DriverStart;

public class TestAllureListeners extends TestListenerAdapter {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return ((TakesScreenshot) DriverStart.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    private int m_count = 0;

    @Override
    public void onTestFailure(ITestResult tr) {
        saveScreenshot();
    }

    @Override
    public void onTestSkipped(ITestResult tr) {
        log("S");
    }

    @Override
    public void onTestSuccess(ITestResult tr) {
        log(".");
    }

    private void log(String string) {
        System.out.print(string);
        if (++m_count % 40 == 0) {
            System.out.println("");
        }
    }
}
