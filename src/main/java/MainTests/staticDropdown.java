package MainTests;

import BaseTests.BaseTest;
import PageClasses.StaticDropdown;
import org.testng.annotations.Test;



public class staticDropdown extends BaseTest {

    @Test
    public static void testDropdown() {
        StaticDropdown sd = new StaticDropdown(driver);
        sd.staticDropdownpractice();
    }
}