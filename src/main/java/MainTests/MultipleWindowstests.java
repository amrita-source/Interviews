package MainTests;

import BaseTests.BaseTest;
import PageClasses.MultipleWindowsPractice;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class MultipleWindowstests  extends BaseTest
{


    @Test
    public void multiplewindowspracticetest() throws InterruptedException {
        MultipleWindowsPractice p=new MultipleWindowsPractice(driver);
        p.MultipleWindowsPractice();
        p.BlinktextClick();
        p.extractEmailFromChildWindow();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://rahulshettyacademy.com/documents-request");
        p.performLoginWithExtractedEmail();
        Thread.sleep(30);
        driver.quit();

    }


}
