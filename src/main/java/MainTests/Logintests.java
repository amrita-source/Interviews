package MainTests;

import BaseTests.BaseTest;
import PageClasses.AmazonLoginpage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.configReader;

import java.io.IOException;


public class Logintests extends BaseTest {




    @Test
    public void openurl()
    {
         driver.get("https://sso.teachable.com/secure/9521/identity/login/password?force=true");
    }

    @Test
    public void testLogin() throws IOException {
        //fetch login creadentials from config properties file
        AmazonLoginpage loginPage = new AmazonLoginpage(driver);
        System.out.println("test");
        loginPage.login(configReader.configReader().getProperty("username"),configReader.configReader().getProperty("password"));



    }

}


