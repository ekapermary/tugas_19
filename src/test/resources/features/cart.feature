@cart
Feature: Product page cart

  @valid-Add
  Scenario: Add a product to the cart
    Given the user is on the product page
    When the user clicks "Add to Cart" on the first product
    Then the product should be added to the cart
    And the "Remove" button should be visible for that product

  @valid-Remove
  Scenario: User removes the first product from the cart
    Given the product is already added to the cart
    And the user is on the product page
    When the user clicks "Remove" on the first product
    Then the product should be removed from the cart
    And the "Add to Cart" button should be visible again
