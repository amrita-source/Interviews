package MainTests;

import BaseTests.BaseTest;
import PageClasses.PracticePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practicePageTests extends BaseTest
{

    @Test
    public void practice()
    {
        PracticePage pg=new PracticePage(driver);
        pg.clickPracticeLink();
    }

}
