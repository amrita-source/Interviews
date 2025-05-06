package MainTests;

import BaseTests.BaseTest;
import PageClasses.GetAllLinksOfAmazon;
import org.testng.annotations.Test;

public class getAllLinks extends BaseTest {
    @Test
    public void links() {
        GetAllLinksOfAmazon link = new GetAllLinksOfAmazon(driver);
        link.getLinks();



    }
}
