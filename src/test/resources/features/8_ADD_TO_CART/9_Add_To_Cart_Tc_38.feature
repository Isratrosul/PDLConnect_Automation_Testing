@Add_To_Cart
Feature: Add_To_Cart_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_38 @Validate_"Add_multiple_products_to_cart"
  Scenario: Validate Add multiple products to cart
    Given Ensure that each Add to Cart button is visible and clickable
    When Click Add to Cart for the first product
    And Click Add to Cart for the second product
    Then Add more products to the cart
    Then Check the cart icon updates after each addition


