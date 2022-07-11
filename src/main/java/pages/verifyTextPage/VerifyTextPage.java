package pages.verifyTextPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.basePage.BasePage;

public class VerifyTextPage extends BasePage {
    public VerifyTextPage(WebDriver driver) {
        super(driver);
    }
    By string = By.xpath("//div/span[@class='badge-secondary']");

    public VerifyTextPage checkText(){
        String actual = waitElementIsVisible(driver.findElement(string)).getText();
        Assert.assertEquals(actual,"Welcome UserName!");
        return this;
    }
}
