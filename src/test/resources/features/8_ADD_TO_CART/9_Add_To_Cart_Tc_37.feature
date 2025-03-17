@Add_To_Cart
Feature: Add_To_Cart_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_37 @Validate_"Adding_a_product_to_the_cart_from_the_Any_page_that_contains_Product_View"
  Scenario: Validate Adding a product to the cart from the Any page that contains Product View
    Given Ensure that that the Add to Cart button is visible and clickable
    When Hover over the Add to Cart button
    Then Check if product is in stock
    And Check if product is out of stock
    Then Click Add to Cart for an in-stock product
    Then Ensure confirmation message style
    Then Add the product to the cart
    And Add another product to the cart

  
