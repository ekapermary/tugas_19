package pages;

import org.openqa.selenium.By;
import static helper.Utility.webDriver;

public class ProductPage {

    By iconShoppingCart = By.id("shopping_cart_container");
    By firstProductAddToCartButton = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
    By removeButtonForFirstProduct = By.xpath("(//button[contains(text(),'Remove')])[1]");

    // Verifies that the shopping cart icon is displayed
    public boolean verifyPageIsDisplayed() {
        return webDriver.findElement(iconShoppingCart).isDisplayed();
    }

    // Clicks "Add to Cart" for the first product
    public void addFirstProductToCart() {
        webDriver.findElement(firstProductAddToCartButton).click();
    }

    // Clicks "Remove" for the first product in the cart
    public void removeFirstProductFromCart() {
        webDriver.findElement(removeButtonForFirstProduct).click();
    }

    // Checks if product is added (i.e., "Remove" button is visible)
    public boolean isProductInCart() {
        try {
            return webDriver.findElement(removeButtonForFirstProduct).isDisplayed();
        } catch (Exception e) {
            return false; // If not found, product is not in cart
        }
    }
}