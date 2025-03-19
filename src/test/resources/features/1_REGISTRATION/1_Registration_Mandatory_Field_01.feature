
@Registration
Feature: Registration_Test_cases
  I want to use this template for my feature file
  
  
Background: Navigate to registration page 
    Given Navigate to the registration page using the provided URL

  @Tc_01  @Validate_User_accesses_the_registration_web_page
 Scenario Outline:01_Validate User accesses the registration web page
    Then Click the link 
    When clicking on the link it should redirect the user to the registration web page.
    Then Insert all the  valid credentials  "<First Name>" "<Last Name>""<E-mail>" "<password>".
    Then Insert "<confirm password>" in the field of confirm password.
    Then Insert "<telephone number>"  in the field of teleohone number.
    Then Click on the continue button.
    Then select the privacy policy box in order to agree .
    And Click on the attached link and it redirect them to the login page.
    
 Examples:
 
   | First Name | Last Name | E-mail              |password  | confirm password |telephone number|
   |    Team    |   aqa     | teamaqa3@gmail.com |teamA1234@|  teamA1234@      |4438832669|
    
   @Tc_02 @Validate_User_fills_out_mandatory_fields_incorrectly
   Scenario:02_validate User fills out mandatory fields incorrectly
     Then Verify the user link is accessible and clickable.
    When Clicking on the link should redirect the user to the registration web page.
    And The web page should display an error message when the user inputs invalid credentials.
    When Inserting invalid inputs, error messages should be displayed.
    When Submitting an empty form should display an error message.
    And Entering an invalid email format should display an error message.
    And An error message should display when the password does not meet the criteria.
    Then The user should receive a confirmation email after successful registration.
    
    
  