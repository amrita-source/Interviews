package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultipleWindowsPractice
{
    private WebDriverWait wait;
    private String email;
    @FindBy(xpath="//a[@class='blinkingText']")
    WebElement BlinkText;

    @FindBy(xpath="//a[@href='mailto:mentor@rahulshettyacademy.com']")
    WebElement mail;

    @FindBy(id="username")
    WebElement Username;

    @FindBy(id="password")
    WebElement password;

    @FindBy(name="signin")
    WebElement signin;
    private final WebDriver driver;

    public MultipleWindowsPractice(WebDriver driver) {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    public void MultipleWindowsPractice() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

       // driver.quit();
    }

    public void BlinktextClick()
    {
        BlinkText.click();
    }

    public void extractEmailFromChildWindow() {
        List<String> windowHandles = new ArrayList<>(driver.getWindowHandles());
        String childWindow = windowHandles.get(1);
        driver.switchTo().window(childWindow);
        int numberofWindows=windowHandles.size();
        String emailId = mail.getText();
        email = (emailId.split("@")[1]).split("\\.")[0];  // Extract domain like "rahulshettyacademy"
    }

    public void performLoginWithExtractedEmail() {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        String parentWindow = it.next();
        driver.switchTo().window(parentWindow);

        wait.until(ExpectedConditions.elementToBeClickable(Username));
        Username.sendKeys(email);
        password.sendKeys("learning");
        signin.click();
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}



