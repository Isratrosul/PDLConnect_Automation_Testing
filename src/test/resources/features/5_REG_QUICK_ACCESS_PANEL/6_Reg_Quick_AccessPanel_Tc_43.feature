@Quick_Access_Panel
Feature: Quick_Access_Panel_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_43 @Validate_"User_Clicks_On_Returns_Option"
  Scenario: Validate User Clicks On Returns Option
    Given Verify the Returns option is visible in the Quick Access Panel
    Then Verify clicking the Returns option redirects to the returns page
    And Verify that the Returns option is clickable and not blocked by any other elements
    And Verify the return page loads properly
   
