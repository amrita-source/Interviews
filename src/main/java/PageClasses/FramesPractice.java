package PageClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FramesPractice
{

protected WebDriver driver;

@FindBy(xpath="//a[@class='theme-btn']")
    WebElement Register;


    public FramesPractice(WebDriver driver) {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        this.driver = driver;
        PageFactory.initElements(driver, this);
        //this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    public void switchtoframe() throws InterruptedException {

        //scroll in the window
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        //switching to frame
       // driver.switchTo().frame("courses-iframe");
        driver.switchTo().frame(0);
        Dimension frameSize = driver.findElement(By.tagName("iframe")).getSize();
        int frameWidth = frameSize.getWidth();
        int frameHeight = frameSize.getHeight();
        System.out.println(frameWidth);
        System.out.println(frameHeight);
        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(0, -1000)");
        Thread.sleep(3000);
        driver.close();

    }
}
