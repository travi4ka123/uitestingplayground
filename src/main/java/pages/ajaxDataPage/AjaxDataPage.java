package pages.ajaxDataPage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.basePage.BasePage;

import java.time.Duration;

import static constants.Constant.Timeouts.implicitWait;

public class AjaxDataPage extends BasePage {
    public AjaxDataPage(WebDriver driver) {
        super(driver);
    }

    By button = By.id("ajaxButton");
    By successfulMessage = By.xpath("//p[@Class='bg-success']");

    public AjaxDataPage buttonIsShown() {
        waitElementIsVisible(driver.findElement(button));
        return this;
    }

    public AjaxDataPage buttonClick() {
        driver.findElement(button).click();
        return this;
    }

    public AjaxDataPage successfulMessageIsShown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        try {
            driver.findElement(successfulMessage);
        } catch (NoSuchElementException e) {
            Assert.fail("No element on the page");
        } finally {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        }
        return this;
    }
}
