package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class PracticePage  {
        private WebDriver driver;
        private WebDriverWait wait;

        @FindBy(xpath = "//a[@href='https://www.rahulshettyacademy.com/#/practice-project']")
        private WebElement practiceLink;

        @FindBy(xpath = "//*[@id='project-container']/div/div[1]/a[2]")
        private WebElement linktext;



        public PracticePage(WebDriver driver) {
            if (driver == null) {
                throw new IllegalStateException("Driver is not initialized.");
            }
            this.driver = driver;
            PageFactory.initElements(driver, this);
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        }

        public void clickPracticeLink() {
           /* wait.until(ExpectedConditions.elementToBeClickable(practiceLink));
            practiceLink.click();
            wait.until(ExpectedConditions.elementToBeClickable( linktext));
            linktext.click();*/
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        }
    }

