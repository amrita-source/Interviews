package MainTests;

import BaseTests.BaseTest;
import PageClasses.WebTable;
import org.testng.annotations.Test;

public class WebTableTest extends BaseTest
{

    @Test
    public void webtablePractice() throws InterruptedException {
        WebTable wt=new WebTable(driver);
       // wt.webtablePractice();
        wt.scrollthroughtable();

    }
}
