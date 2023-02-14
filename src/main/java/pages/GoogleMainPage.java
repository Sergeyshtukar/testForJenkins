package pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tools.browserFactory.DriverStart;

public class GoogleMainPage {
    DriverStart driverStart = DriverStart.getInstance();
    private static final Logger log = Logger.getLogger(GoogleMainPage.class);

    private String isOnPageLocator = "//a[@aria-label='Gmail']";

    public boolean isOnPage() {
        log.info("The element is on page");
        WebDriverWait wait = new WebDriverWait(driverStart.getDriver(), 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(isOnPageLocator)));
        return element.isDisplayed();
    }
}
