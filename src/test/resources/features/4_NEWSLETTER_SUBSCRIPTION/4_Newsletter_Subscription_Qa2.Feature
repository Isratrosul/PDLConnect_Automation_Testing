@Newsletter_subscription 
Feature: Newsletter_subscription_test_cases
I want to use this template for my feature file  

Background: 


 @Tc_14  @Select_"Yes_in_the_Newsletter_subscription
Scenario Outline:014_Select "Yes" in the Newsletter subscription
   Given  Navigate to the registration web page of "Your Store" e-commerce website
   When  Log in to the account.
   Then   Scroll to the newsletter subscription section.
   And   Select the "Yes" option for subscribing to the newsletter.
   Then  Verify that the user receives a confirmation email.
   
   Examples:  
      | username      | password     |
   | TeamQA     | teamA1234@   |
      

