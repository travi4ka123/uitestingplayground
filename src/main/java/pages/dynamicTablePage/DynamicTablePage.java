package pages.dynamicTablePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.basePage.BasePage;
import pages.dynamicIdPage.DynamicIdPage;

public class DynamicTablePage extends BasePage {
    public DynamicTablePage(WebDriver driver) {
        super(driver);
    }
    private String valueInTable="",expectedValue="";

    By chromeLoadCpu = By.xpath("//div[@role='row']/span[text()='Chrome']/../span[contains(text(),'%')]");
    By value = By.xpath("//p[@class='bg-warning']");

    public DynamicTablePage checkChromeCpuInTable(){
        valueInTable = waitElementIsVisible(driver.findElement(chromeLoadCpu)).getText();
        return this;
    }
    public DynamicTablePage checkValue(){
        expectedValue = waitElementIsVisible(driver.findElement(value)).getText()
                .replace("Chrome CPU: ","");
        return this;
    }
    public DynamicTablePage compare(){
        Assert.assertEquals(valueInTable,expectedValue);
        return this;
    }
}
