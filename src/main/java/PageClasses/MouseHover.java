package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MouseHover {

    protected WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(css="button[id='mousehover']")
    private WebElement mousehover;

    @FindBy(css=".mouse-hover-content a:nth-child(2)")
    private WebElement top;

    public MouseHover(WebDriver driver) {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }


    public void MouseHoverPage()
    {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        Actions a=new Actions(driver);
        a.moveToElement(mousehover).build().perform();
        top.click();




    }
}
