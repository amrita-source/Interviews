package PageClasses;

import BaseTests.BaseTest;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StaticDropdown extends BaseTest
{

    protected static WebDriver driver;
    protected WebDriverWait wait;


    @FindBy(xpath="//select[@id='dropdown-class-example']")
    private static WebElement staticdropdown;

    public StaticDropdown(WebDriver driver)
    {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public static void staticDropdownpractice()
    {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Select s=new Select(staticdropdown);
        s.selectByValue("option2");
        s.selectByIndex(1);
    }
}
