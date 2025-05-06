package PageClasses;

import MainTests.Logintests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonLoginpage
{
    private WebDriver driver;

    //private WebElement username;
    //private WebElement password;
    //private WebElement login;

    @FindBy(id = "email")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;
    @FindBy(name = "commit")
    private WebElement submit;

    public AmazonLoginpage(WebDriver driver)
    {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
        this.driver = (WebDriver) driver;
        PageFactory.initElements(driver,this);
    }



    public void login(String userEmail, String userPassword)
    {
      //  if (driver == null) {
        //    throw new IllegalStateException("Driver is not initialized.");
        //}
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        username.sendKeys(userEmail);
        password.sendKeys(userPassword);
        submit.click();

    }
}


