package pages;

import org.openqa.selenium.By;
import static helper.Utility.webDriver;

public class HomePage {

    By iconShoppingCart = By.id("shopping_cart_container");

    public boolean verifyPageIsDisplayed(){
        webDriver.findElement(iconShoppingCart).isDisplayed();
        return true;
    }
}
