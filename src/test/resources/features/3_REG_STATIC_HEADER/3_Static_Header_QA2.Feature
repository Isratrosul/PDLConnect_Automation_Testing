@Registration_Static_Header
Feature: Registration_static_header_test_case

  @TC_14 @Select_"Yes_in_the_Newsletter_subscription
  Scenario: 07_Select "Yes" in the Newsletter subscription
    Given Navigate to the registration web page of "Your Store" e-commerce website
    When Log in to the account.
    Then Scroll to the newsletter subscription section.
    And Select the "Yes" option for subscribing to the newsletter.
    Then Verify that the user receives a confirmation email.
