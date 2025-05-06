package MainTests;

import BaseTests.BaseTest;
import PageClasses.MouseHover;
import org.testng.annotations.Test;

public class MouseHoverTest extends BaseTest
{

    @Test
    public static void MouseHoverTestPractice()
    {

        MouseHover mh=new MouseHover(driver);
        mh.MouseHoverPage();
    }
}
