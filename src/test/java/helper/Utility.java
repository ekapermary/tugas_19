package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class Utility {

    public static WebDriver webDriver;

    //Open Chorome
    public static void startWebDriver(){
        WebDriverManager.chromedriver().setup();

        // Set Chrome preferences
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false); // Disable credential service
        prefs.put("profile.password_manager_enabled", false); // Disable password manager
        prefs.put("safebrowsing.enabled", false); // Disable Safe Browsing (to avoid "Change your password" popup)

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito"); // Optional: start in incognito

        webDriver = new ChromeDriver(options);
        webDriver.manage().window().fullscreen();
        webDriver.get("https://www.saucedemo.com/");
    }
    //Close chorome
    public static void quitDriver(){
        webDriver.quit();
    }
}
