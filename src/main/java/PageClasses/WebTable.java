package PageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

    public class WebTable {
    protected static WebDriver driver;
    protected WebDriverWait wait;

    @FindBy(className = ".tableFixHead")
    private WebElement product;

    @FindBy(css = ".tableFixHead td:nth-child(4)")
    private static List<WebElement> rows;

    @FindBy(className = "totalAmount")
    private static WebElement totalAmount;

    public WebTable(WebDriver driver) {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
        public static void webtablePractice()
        {
        int sum = 0;
        int amountColumnIndex = 0;
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        for (int i = 0; i < rows.size(); i++)
        {
            int Amount = Integer.parseInt(rows.get(i).getText());
            sum = sum + Amount;
        }
        System.out.println(sum);
        Assert.assertEquals(sum,totalAmount.getText().split(":")[1].trim());
    }

    public static void scrollthroughtable() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(3000);
        js.executeScript("document.querySelector('.tableFixHead').scrollBottom=5000");
    }


}