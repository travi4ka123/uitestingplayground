package pages.progressBarPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.basePage.BasePage;

import java.time.Duration;

import static constants.Constant.Timeouts.explicitWait;

public class ProgressBarPage extends BasePage {
    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    By progressBar = By.id("progressBar");
    By startButton = By.id("startButton");
    By stopButton = By.id("stopButton");

    public ProgressBarPage clickStart(){
        waitElementIsVisible(driver.findElement(startButton)).click();
        return this;
    }

    public ProgressBarPage clickStop(){
        waitElementIsVisible(driver.findElement(stopButton)).click();
        return this;
    }

    public ProgressBarPage waitBarToHave75(){
        new WebDriverWait(driver, Duration.ofSeconds(60))
                .until(ExpectedConditions.attributeToBe(driver.findElement(progressBar),"ariaValueNow","75"));
        return this;
    }
}
