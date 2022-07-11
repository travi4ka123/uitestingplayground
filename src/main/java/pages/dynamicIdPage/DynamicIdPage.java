package pages.dynamicIdPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.basePage.BasePage;

public class DynamicIdPage extends BasePage {
    public DynamicIdPage(WebDriver driver) {
        super(driver);
    }

    By button = By.xpath("//button[text()='Button with Dynamic ID']");

    public DynamicIdPage checkButtonIsOnThePage(){
        waitElementIsVisible(driver.findElement(button));
        return this;
    }
}
