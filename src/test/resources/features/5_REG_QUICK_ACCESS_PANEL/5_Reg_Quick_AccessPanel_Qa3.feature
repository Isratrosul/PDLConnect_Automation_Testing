@QuickAccessPanel
Feature: Quick_Access_Panel_Test_Cases
  I want to verify the functionality of options in the Quick Access Panel

Background: Navigate to the Quick Access Panel
    Given Navigate to the Quick Access Panel using the provided URL

  @Tc_25 @Validate_Recurring_Payments_Option
  Scenario: Verify Recurring Payments option in the Quick Access Panel
    Then Verify the Recurring Payments option is visible in the Quick Access Panel.
    When Clicking the Recurring Payments option should redirect to the recurring payments page.
    Then Verify the Recurring Payments option is clickable and not blocked by any other elements.
    And Verify the recurring payments page loads properly.
    
      @Tc_26 @Validate_Reward_Points_Option
  Scenario: Verify Reward Points option in the Quick Access Panel
    Then Verify the Reward Points option is visible in the Quick Access Panel.
    When Clicking the Reward Points option should redirect to the reward points page.
    Then Verify the Reward Points option is clickable and not blocked by any other elements.
    And Verify the reward points page loads properly.
    
    
    @Tc_27 @Validate_Returns_Option
  Scenario: Verify Returns option in the Quick Access Panel
    Then Verify the Returns option is visible in the Quick Access Panel.
    When Clicking the Returns option should redirect to the returns page.
    Then Verify the Returns option is clickable and not blocked by any other elements.
    And Verify the returns page loads properly.

  @Tc_28 @Validate_Transactions_Option
  Scenario: Verify Transactions option in the Quick Access Panel
    Then Verify the Transactions option is visible in the Quick Access Panel.
    When Clicking the Transactions option should redirect to the transactions page.
    Then Verify the Transactions option is clickable and not blocked by any other elements.
    And Verify the transactions page loads properly.

  @Tc_29 @Validate_Newsletter_Option
  Scenario: Verify Newsletter option in the Quick Access Panel
    Then Verify the Newsletter option is visible in the Quick Access Panel.
    When Clicking the Newsletter option should redirect to the newsletter page.
    Then Verify the Newsletter option is clickable and not blocked by any other elements.
    And Verify the newsletter page loads properly.
    