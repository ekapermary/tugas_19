package pages;

import org.openqa.selenium.By;
import static helper.Utility.startWebDriver;
import static helper.Utility.webDriver;

public class LoginPage {

    By inputUsername = By.id("user-name");
    By inputPassword = By.id("password");
    By buttonLogin = By.id("login-button");

    public void setInputUsername(String username){
        webDriver.findElement(inputUsername).sendKeys(username);
    }

    public void setInputPassword(String password){
        webDriver.findElement(inputPassword).sendKeys(password);
        webDriver.findElement(buttonLogin).click();
    }

        public boolean isPageDisplayed(){
            webDriver.findElement(inputUsername).isDisplayed();
            webDriver.findElement(inputPassword).isDisplayed();
            webDriver.findElement(buttonLogin).isDisplayed();
            return  true;
        }
}
