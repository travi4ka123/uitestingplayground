package pages.loadDelaysPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.basePage.BasePage;

import java.time.Duration;

import static constants.Constant.Timeouts.explicitWait;

public class LoadDelaysPage extends BasePage {
    public LoadDelaysPage(WebDriver driver) {
        super(driver);
    }

    public LoadDelaysPage checkPageIsOpened(){
        new WebDriverWait(driver, Duration.ofSeconds(explicitWait)).until(
                driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));
        Assert.assertEquals(driver.getTitle(),"Load Delays");
        return this;
    }
}
