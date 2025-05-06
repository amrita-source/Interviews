package MainTests;

import BaseTests.BaseTest;
import PageClasses.DynamicDropdowns;
import org.testng.annotations.Test;

public class DynamicDropDowns extends BaseTest
{
    @Test
    public static void dynamicDropDowns()
    {

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
         DynamicDropdowns dp=new DynamicDropdowns(driver);
         dp.DynamicDropdownsSuggestive();

    }




}
