package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.Timeouts.implicitWait;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;

        if (PLATFORM_AND_BROWSER.equals("win_chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            Assert.fail(PLATFORM_AND_BROWSER + " is incorrect");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        return driver;
    }
}
