@Checkout_Functionality
Feature: Checkout_Functionality_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_42 @Validate_"Order_Confirmation_Page"
  Scenario: Validate Order Confirmation Page
    Given Complete the checkout process as a registered customer
    When Verify that the order confirmation page displays the order number, order details, payment details, and delivery details
    Then Verify that the error message Products marked with *** are not available in the desired quantity or not in stock! is displayed
    And Verify that an error message is displayed when the required quantity of stock is exceeded


