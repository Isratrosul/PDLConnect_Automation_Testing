@Checkout_Functionality
Feature: Checkout_Functionality_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_39 @Validate_Checkout_Button
  Scenario: Validate Checkout Button
    Given Launch the browser and navigate to the correct URL
    Then Verify that the shopping cart option is visible and accessible
    When Verify that user are able to search for a product and add it to the shopping cart
    Then Verify that the checkout button is enabled
    When Verify that user are able to Remove all items from the shopping cart
    Then Verify that the checkout button is disabled
    Then Attempt to click the disabled checkout button and verify the displayed error message

 

   
