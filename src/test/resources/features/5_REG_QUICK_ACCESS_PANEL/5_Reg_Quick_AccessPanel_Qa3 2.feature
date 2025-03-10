@Quick_Access_Panel

Feature: Quick Access Panel Test Cases

  Background: Navigate to Home Page
    Given The user navigates to the homepage

  @TC_25 @Verify_Recurring_Payments_Option
  Scenario: Verify Recurring Payments Option
    Given The user is on the homepage
    When The user looks at the Quick Access Panel
    Then The Recurring Payments option should be visible in the Quick Access Panel

    Given The user clicks on the Recurring Payments option in the Quick Access Panel
    When The user waits for the page to load
    Then The user should be redirected to the recurring payments page

    Given The user is on the recurring payments page
    When The user clicks on the Recurring Payments option
    Then The Recurring Payments option should be clickable and not blocked by any other elements

    Given The user clicks on the Recurring Payments option
    When The user waits for the page to load
    Then The recurring payments page should load properly

  @TC_26 @Verify_Reward_Points_Option
  Scenario: Verify Reward Points Option
    Given The user is on the homepage
    When The user looks at the Quick Access Panel
    Then The Reward Points option should be visible in the Quick Access Panel

    Given The user clicks on the Reward Points option in the Quick Access Panel
    When The user waits for the page to load
    Then The user should be redirected to the reward points page

    Given The user is on the reward points page
    When The user clicks on the Reward Points option
    Then The Reward Points option should be clickable and not blocked by any other elements

    Given The user clicks on the Reward Points option
    When The user waits for the page to load
    Then The reward points page should load properly

  @TC_27 @Verify_Returns_Option
  Scenario: Verify Returns Option
    Given The user is on the homepage
    When The user looks at the Quick Access Panel
    Then The Returns option should be visible in the Quick Access Panel

    Given The user clicks on the Returns option in the Quick Access Panel
    When The user waits for the page to load
    Then The user should be redirected to the returns page

    Given The user is on the returns page
    When The user clicks on the Returns option
    Then The Returns option should be clickable and not blocked by any other elements

    Given The user clicks on the Returns option
    When The user waits for the page to load
    Then The returns page should load properly

  @TC_28 @Verify_Transactions_Option
  Scenario: Verify Transactions Option
    Given The user is on the homepage
    When The user looks at the Quick Access Panel
    Then The Transactions option should be visible in the Quick Access Panel

    Given The user clicks on the Transactions option in the Quick Access Panel
    When The user waits for the page to load
    Then The user should be redirected to the transactions page

    Given The user is on the transactions page
    When The user clicks on the Transactions option
    Then The Transactions option should be clickable and not blocked by any other elements

    Given The user clicks on the Transactions option
    When The user waits for the page to load
    Then The transactions page should load properly

  @TC_29 @Verify_Newsletter_Option
  Scenario: Verify Newsletter Option
    Given The user is on the homepage
    When The user looks at the Quick Access Panel
    Then The Newsletter option should be visible in the Quick Access Panel

    Given The user clicks on the Newsletter option in the Quick Access Panel
    When The user waits for the page to load
    Then The user should be redirected to the newsletter page

    Given The user is on the newsletter page
    When The user clicks on the Newsletter option
    Then The Newsletter option should be clickable and not blocked by any other elements

    Given The user clicks on the Newsletter option
    When The user waits for the page to load
    Then The newsletter page should load properly
