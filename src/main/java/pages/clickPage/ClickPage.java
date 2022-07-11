package pages.clickPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.basePage.BasePage;

public class ClickPage extends BasePage {
    public ClickPage(WebDriver driver) {
        super(driver);
    }
    By button = By.id("badButton");

    public ClickPage clickButton(){
        waitElementIsVisible(driver.findElement(button)).click();
        return this;
    }
    public ClickPage checkTheButtonIsClicked(){
        String currentClass = driver.findElement(button).getAttribute("class");
        Assert.assertEquals(currentClass,"btn btn-success");
        return this;
    }
}
