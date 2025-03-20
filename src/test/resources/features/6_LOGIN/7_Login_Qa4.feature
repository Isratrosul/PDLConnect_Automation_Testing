@Login

Feature: Registration Page_Test_Cases
  I want to verify the registration process on the "Your Store" website.

Background: Navigate to the Registration Page
    Given Navigate to the "Your Store" website using the provided URL

  @TC_30 @Validate_Complete_Registration_Process
  Scenario Outline: Verify Complete Registration Process
    Then Click the link and verify it is accessible and clickable.
    When Clicking on the link, it should redirect the user to the registration web page.
    Then Click on the "Login" option from the homepage or header menu.
    And Verify the Login Page displays two sections:
      | Section Name            	|
      | New Customer section    	|
      | Existing Customer section |
      
    Then Confirm the "Continue" button is present under the New Customer section.
    When Click the "Continue" button.
    Then Confirm the login button is accessible and clickable.
    And Confirm the user is redirected to the Registration Form page.
    Then Check the Registration Form contains the following fields "<Field Name>":

      
    When Enter valid information in the required fields.
    Then Select "Yes" or "No" for Newsletter Subscription.
    And Check the Privacy Policy agreement box.
    When Click the "Continue" button.
    Then Verify the form submission is successful.
    And Confirm the user is redirected to the Account Dashboard or Homepage.
    Then Check for a Welcome Message.
    
    Examples:  
      | Field Name        |
      | First Name        |
      | Last Name         |
      | Email             |
      | Telephone         |
      | Password          |
      | Confirm Password  |

@TC_31 @Validate_User_Login
  Scenario: Verify User Can Successfully Log In
    Then Click on the "Login" option from the homepage or header menu.
    And Confirm the "Returning Customer" section is present on the login page.
    When Enter a valid email and password in the "Returning Customer" section.
    And Click the "Login" button.
    Then Confirm the user sees a welcome message.
    And Verify the account options available.


@TC_32 @Validate_Invalid_Login
  Scenario: Verify Error Message Appears for Invalid Login Attempt
    Then Click on the "Login" option from the homepage or header menu.
    And Verify the "Returning Customer" section is present on the login page.
    When Enter an invalid email or incorrect password.
    And Click the "Login" button.
    Then Verify the error message appears in red below the login form.
    And Confirm the email and password fields remain populated.
    
    
    @TC_33 @Validate_Password_Reset_Functionality
  Scenario: Verify User Can Successfully Reset Password
    Then Click on the "Login" option from the homepage or header menu.
    And Click on the "Forgotten Password" link under the "Returning Customer" section.
    Then Verify the password reset form contains an email input field.
    When Enter a registered email address in the password reset form.
    And Click on the "Continue" button.
    Then Check the registered email inbox for the password reset email.
    When Click on the password reset link in the email.
    Then Ensure the reset link redirects users to a secure password reset page.
    And Validate the ability to set a new password successfully.
    

