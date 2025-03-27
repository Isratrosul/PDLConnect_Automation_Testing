@Quick_Access_Panel
Feature: Quick_Access_Panel_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_44 @Validate_"User_Clicks_On_Transactions_Option"
  Scenario: Validate User Clicks On Transactions Option
    Given Verify the Transactions option is visible in the Quick Access Panel
    Then Verify clicking the Transactions option redirects to the transactions page
    And Verify that the Transactions option is clickable and not blocked by any other elements
    And Verify the transaction page loads properly
    


