package pages.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.basePage.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private By loadDelaysLink = By.xpath("//a[text()='Load Delay']");

    public HomePage clickLoadDelaysLink(){
        waitElementIsVisible(driver.findElement(loadDelaysLink)).click();
        return this;
    }

}
