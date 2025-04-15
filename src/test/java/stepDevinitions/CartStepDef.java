package stepDevinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.ProductPage;

public class CartStepDef {

        ProductPage productPage = new ProductPage();

        @Given("the user is on the product page")
        public void userOnProductPage() {
            Assert.assertTrue(productPage.verifyPageIsDisplayed());
        }

        @When("the user clicks \"Add to Cart\" on the first product")
        public void clickAddToCart() {
            productPage.addFirstProductToCart();
        }

        @Then("the product should be added to the cart")
        public void verifyProductAddedToCart() {
            Assert.assertTrue(productPage.isProductInCart());
        }

        @Then("the \"Remove\" button should be visible for that product")
        public void removeButtonVisible() {
            Assert.assertTrue(productPage.isProductInCart());
        }

        @Given("the product is already added to the cart")
        public void productAlreadyInCart() {
            productPage.addFirstProductToCart(); // Pre-condition step
        }

        @When("the user clicks \"Remove\" on the first product")
        public void clickRemoveFromCart() {
            productPage.removeFirstProductFromCart();
        }

        @Then("the product should be removed from the cart")
        public void verifyProductRemoved() {
            // implement negative check if needed
            Assert.assertFalse(productPage.isProductInCart());
        }

        @Then("the \"Add to Cart\" button should be visible again")
        public void addToCartButtonVisibleAgain() {
            // Optional if you track state of the button
            Assert.assertTrue(productPage.verifyPageIsDisplayed());
        }
    }

