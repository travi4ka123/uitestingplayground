package base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.clickPage.ClickPage;
import pages.ajaxDataPage.AjaxDataPage;
import pages.basePage.BasePage;
import pages.classAttributePage.ClassAttributePage;
import pages.dynamicIdPage.DynamicIdPage;
import pages.dynamicTablePage.DynamicTablePage;
import pages.hiddenLayersPage.HiddenLayersPage;
import pages.homePage.HomePage;
import pages.loadDelaysPage.LoadDelaysPage;
import pages.progressBarPage.ProgressBarPage;
import pages.scrollbarsPage.ScrollbarsPage;
import pages.textInputPage.TextInputPage;
import pages.verifyTextPage.VerifyTextPage;

import java.time.Duration;

import static common.Config.CLEAR_CACHE_COOKIES;
import static common.Config.CLOSE_BROWSER;
import static constants.Constant.Timeouts.explicitWait;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();

    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected DynamicIdPage dynamicIdPage = new DynamicIdPage(driver);
    protected ClassAttributePage classAttributePage = new ClassAttributePage(driver);
    protected HiddenLayersPage hiddenLayersPage = new HiddenLayersPage(driver);
    protected LoadDelaysPage loadDelaysPage = new LoadDelaysPage(driver);
    protected AjaxDataPage ajaxDataPage = new AjaxDataPage(driver);
    protected ClickPage clickPage = new ClickPage(driver);
    protected TextInputPage textInputPage = new TextInputPage(driver);
    protected ScrollbarsPage scrollbarsPage = new ScrollbarsPage(driver);
    protected DynamicTablePage dynamicTablePage = new DynamicTablePage(driver);
    protected VerifyTextPage verifyTextPage = new VerifyTextPage(driver);
    protected ProgressBarPage progressBarPage = new ProgressBarPage(driver);

  //  @AfterTest
    public void clearCookieAndStorage() {
        if (CLEAR_CACHE_COOKIES) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear");
        }
    }

  //  @AfterSuite(alwaysRun = true)
    public void close() {
        if (CLOSE_BROWSER) {
            driver.quit();
        }
    }
}
