package homeTest;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static constants.Constant.Urls.*;

public class Tests extends BaseTest {
    @Test
    public void checkDynamicIdTest() {
        basePage.open(DYNAMIC_ID_URL);
        dynamicIdPage
                .checkButtonIsOnThePage();
    }

    @Test
    public void classAttributeTest() {
        basePage.open(CLASS_ATTRIBUTE_URL);
        classAttributePage
                .checkBlueButtonOnThePage()
                .clickBlueButtonOnThePage()
                .acceptAlert()
                .checkBlueButtonOnThePage();
    }

    @Test
    public void hiddenLayersTest() {
        basePage.open(HIDDEN_LAYERS);
        hiddenLayersPage
                .greenButtonIsShown()
                .clickGreenButton()
                .clickGreenButton();
    }

    @Test
    public void loadDelaysTest() {
        basePage.open(HOME_PAGE_URL);
        homePage
                .clickLoadDelaysLink();
        loadDelaysPage
                .checkPageIsOpened();
    }

    @Test
    public void ajaxDataTest() {
        basePage.open(AJAX_DATA);
        ajaxDataPage
                .buttonIsShown()
                .buttonClick()
                .successfulMessageIsShown();
    }

    @Test
    public void clickPageTest() {
        basePage.open(CLICK_PAGE);
        clickPage
                .clickButton()
                .checkTheButtonIsClicked();
    }

    @Test
    public void textInputPageTest() {
        basePage.open(TEXT_INPUT_PAGE);
        textInputPage
                .senSomeText()
                .clickButton()
                .checkButtonHasEnteredText();
    }
    @Test
    public void scrollbarsPageTest() {
        basePage.open(SCROLLBARS_URL);
        scrollbarsPage
                .scrollToButton();
    }
    @Test
    public void dynamicTableTest() {
        basePage.open(DYNAMIC_TABLE_URL);
        dynamicTablePage
                .checkChromeCpuInTable()
                .checkValue()
                .compare();
    }
    @Test
    public void verifyTextPageTest() {
        basePage.open(VERIFY_TEXT_URL);
        verifyTextPage
                .checkText();
    }
    @Test
    public void progressBarPageTest() {
        basePage.open(PROGRESS_BAR_URL);
        progressBarPage
                .clickStart()
                .waitBarToHave75()
                .clickStop();
    }

    @Test
    public void progressBarPageTest1() {
        basePage.open("http://uitestingplayground.com/mouseover");
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(driver.findElement(By.className("text-primary")))).click();
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(driver.findElement(By.className("text-primary")))).click();
    }
}
