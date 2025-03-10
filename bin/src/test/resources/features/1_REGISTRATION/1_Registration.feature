
@Registration
Feature: Registration_Test_cases
  I want to use this template for my feature file

  @Tc_01  @Validate_User_accesses_the_registration_web_page
  Scenario:01_Validate User accesses the registration web page
    Given Navigate to the registration page using the provided URL
    Then Click the link 
    When clicking on the link it should redirect the user to the registration web page.
    Then Insert all the  valid credentials. 
    And Click on the attached link and it redirect them to the login page.
    
    
     

  