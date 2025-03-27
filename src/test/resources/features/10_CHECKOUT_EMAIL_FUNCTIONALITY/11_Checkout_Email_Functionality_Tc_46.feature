@Checkout_Email_Functionality
Feature: Checkout_Email_Functionality_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_46 @Validate_"Receiving_A_Confirmation_Email"
  Scenario: Validate Receiving A Confirmation Email
    Given Verify users successfully checked out and completed their order
    Then Verify confirmation email include correct information about the order and the website contact details
    When Verify users see a link to track oder status
    Then Ensure link to track the order status valid and accessible
    

