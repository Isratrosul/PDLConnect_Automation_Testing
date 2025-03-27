@Checkout_Funtionality
Feature: Checkout_Functionality_Test_Cases
  I want to use this template for my feature file
  
  Background: 

  @Tc_41 @Validate_"Checkout_As_A_Registered_Customer"
  Scenario: Validate Checkout As A Registered Customer
    Given Click on the login button and enter valid credentials
    When Verify that the user is successfully logged in
    Then Search for a product and add it to the shopping cart
    Then Verify that the checkout button on the shopping cart page is visible and clickable
    Then Locate and select the Check out with my account option
    When Verify that the checkout form is pre-filled with saved billing and delivery details
    Then Update billing, delivery, and payment method details, if needed
    And Verify that at least one delivery method and one payment method is available

 
