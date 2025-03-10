
@Registration
Feature: Registration_Mandatory_Field_Test_cases
  I want to use this template for my feature file
  
  @Tc_03  @Validate_User_registers_for_an_account
  Scenario Outline:03_Validate User registers for an account
  
    When The "Create Account" button is visible and blue
    And The "Create Account" button is positioned at the bottom right of the form
    And All required field labels are correct and clear

    Then I enter an "<email>" address and verify proper email format validation
    And I enter a valid password that adheres to policy requirements 
    And The "<Password>" and "<Confirm Password>" fields match

    When I insert invalid data inputs
    Then The system rejects the invalid inputs

    When I insert a duplicate email address
    Then The system does not accept duplicate email addresses

    When I complete the form with valid details
    Then An OTP is sent to the correct email or phone number

    When I enter the correct "<OTP>"
    Then "<Registration status>" is successful

    When I enter an incorrect OTP
    Then An error message is displayed

    And The OTP expires after a set time

    When I request to resend the OTP
    Then The OTP is resent successfully

    When Registration is successful
    Then The user is redirected to the homepage
    And A welcome message appears with the user’s name
    And The user can log in immediately

    When Registration is unsuccessful
    Then The user is unable to access restricted pages without logging in
    
  Examples:
    | email               | Password   | Confirm Password | OTP    | Registration Status       |
    | teamaqa35@gmail.com | teamA1234@ | teamA1234@       | 123456 | Registration is successful |
    | user2@test.com      | WeakPass   | WeakPass         | 123456 | System rejects invalid inputs |
    | user3@test.com      | Strong@123 | WrongPass        | 123456 | System rejects invalid inputs |
    | existing@test.com   | Strong@123 | Strong@123       | 123456 | System does not accept duplicate email |
    | user5@test.com      | Strong@123 | Strong@123       | 000000 | Error message is displayed |
    | user6@test.com      | Strong@123 | Strong@123       | Expired| OTP expires after a set time |

  

    