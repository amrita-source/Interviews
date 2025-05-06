package PageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class GetAllLinksOfAmazon
{

    @FindBy(tagName = "a")
    private static List<WebElement> links;


    protected static WebDriver driver;
    protected static WebDriverWait wait;


    public GetAllLinksOfAmazon(WebDriver driver) {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }



    public static void getLinks()
    {
        driver.get("https://www.amazon.com/");
        //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3000));
         //wait.until(ExpectedConditions.visibilityOfAllElements(links));
        System.out.println(links.size());
        for(WebElement link:links)
        {
            System.out.println(link.getText());


        }



    }



}