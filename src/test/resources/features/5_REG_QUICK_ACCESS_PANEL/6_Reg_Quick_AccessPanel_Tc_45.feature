@Quick_Access_Panel
Feature: Quick_Access_Panel_Test_Cases
  I want to use this template for my feature file
  
  Background:

  @Tc_45 @Validate_"User_Clicks_On_Newsletter_Option"
  Scenario: Validate User Clicks On Newsletter Option
    Given Verify the Newsletter option is visible in the Quick Access Panel
    Then Verify clicking the Newsletter option redirects to the newsletter page
    And Verify that the Newsletter option is clickable and not blocked by any other elements
    And Verify the newsletter page loads properly
   

