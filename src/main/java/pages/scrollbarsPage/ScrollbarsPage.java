package pages.scrollbarsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.basePage.BasePage;

public class ScrollbarsPage extends BasePage {
    public ScrollbarsPage(WebDriver driver) {
        super(driver);
    }

    By button = By.id("hidingButton");

    public ScrollbarsPage scrollToButton(){
        Actions actions = new Actions(driver);
        actions
                .scrollToElement(driver.findElement(button))
                .build()
                .perform();
        return this;
    }
}
