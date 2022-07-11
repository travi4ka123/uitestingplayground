package pages.classAttributePage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

import java.time.Duration;

import static constants.Constant.Timeouts.explicitWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ClassAttributePage extends BasePage {
    public ClassAttributePage(WebDriver driver) {
        super(driver);
    }

    By blueButton = By.xpath("//button[contains(@class,' btn-primary ')]");

    public ClassAttributePage checkBlueButtonOnThePage(){
        WebElement blueButtonElement = waitElementIsVisible(driver.findElement(blueButton));
        return this;
    }
    public ClassAttributePage clickBlueButtonOnThePage(){
        driver.findElement(blueButton).click();
        return this;
    }
    public ClassAttributePage acceptAlert(){
        Alert alert = new WebDriverWait(driver,Duration.ofSeconds(explicitWait)).until(alertIsPresent());
        alert.accept();
        return this;
    }
}
