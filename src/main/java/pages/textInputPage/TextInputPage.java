package pages.textInputPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.basePage.BasePage;

public class TextInputPage extends BasePage {
    public TextInputPage(WebDriver driver) {
        super(driver);
    }
    By input = By.id("newButtonName");
    By button = By.id("updatingButton");

    public TextInputPage senSomeText(){
        waitElementIsVisible(driver.findElement(input)).sendKeys("Hello");
        return this;
    }
    public TextInputPage checkButtonHasEnteredText(){
        String buttonText = waitElementIsVisible(driver.findElement(button)).getText();
        Assert.assertEquals(buttonText,"Hello");
        return this;
    }
    public TextInputPage clickButton(){
        waitElementIsVisible(driver.findElement(button)).click();
        return this;
    }

}
