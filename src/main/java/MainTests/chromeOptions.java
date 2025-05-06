package MainTests;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class chromeOptions {

    @Test
    public static void chromeOptions() {
        ChromeOptions options = new ChromeOptions();

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("ipaddress:4444");
        options.setExperimentalOption("proxy", proxy);
    }

    @Test
    public static void DownloadDirectory() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download_directory", "//c://downloads");
        options.setExperimentalOption("prefs", prefs);
    }

    @Test
    public static void AcceptInsecurecerts() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
    }

    @Test
    public static void setheadless() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");

        //options.setHeadless(true);
    }


    @Test
    public static void authenticationPopups() {


        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);

    }
}