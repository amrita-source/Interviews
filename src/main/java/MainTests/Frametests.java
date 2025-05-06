package MainTests;

import BaseTests.BaseTest;
import PageClasses.FramesPractice;
import org.testng.annotations.Test;

public class Frametests extends BaseTest
{

    @Test
    public void frametest() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        FramesPractice fp=new FramesPractice(driver);
        fp.switchtoframe();

    }
}
