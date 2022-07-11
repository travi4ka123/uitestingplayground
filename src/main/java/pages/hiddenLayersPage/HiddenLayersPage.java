package pages.hiddenLayersPage;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.basePage.BasePage;

public class HiddenLayersPage extends BasePage {
    public HiddenLayersPage(WebDriver driver) {
        super(driver);
    }

    By greenButton = By.id("greenButton");

    public HiddenLayersPage greenButtonIsShown() {
        waitElementIsVisible(driver.findElement(greenButton));
        return this;
    }

    public HiddenLayersPage clickGreenButton() {
        try {
            driver.findElement(greenButton).click();
        } catch (ElementClickInterceptedException e) {
            Assert.fail("Button is not clickable");
        }
        return this;
    }
}
