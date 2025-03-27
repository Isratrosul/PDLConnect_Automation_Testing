@Checkout_Functionality
Feature: Checkout_Functionality_Test_Cases
  I want to use this template for my feature file

  @Tc_40 @Validate_Checkout_As_A_Guest_Button
  Scenario: Validate Checkout As A Guest Button
    When Add a product to the shopping cart
    And Click on the checkout button
    Then Verify that the checkout page displays the “Checkout as a Guest” option
    When Select “Checkout as a Guest” and proceed
    Then Verify that the billing and delivery details fields include first name, last name, email, telephone, address, city, postcode, and country
    And Verify that at least one delivery method and one payment method is available
    When Complete the checkout process as a guest
    Then Verify that the order confirmation page displays the order number, order details, payment details, and delivery details

