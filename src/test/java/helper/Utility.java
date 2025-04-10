package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

    public static WebDriver webDriver;

    //Open Chorome
    public static void startWebDriver(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.manage().window().fullscreen();
        webDriver.get("https://www.saucedemo.com/");
    }
    //Close chorome
    public static void quitDriver(){
        webDriver.quit();
    }
}
