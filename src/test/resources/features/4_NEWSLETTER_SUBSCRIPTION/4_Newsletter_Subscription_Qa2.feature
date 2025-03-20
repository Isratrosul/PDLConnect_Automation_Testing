
      

@Newsletter_subscription 
Feature: Newsletter_subscription_test_cases
I want to use this template for my feature file  

Background: 


 @Tc_14  @Select_"Yes_in_the_Newsletter_subscription
Scenario Outline:014_Select "Yes" in the Newsletter subscription option  .
   Given  Navigate to the registration web page of "Your Store" e-commerce website for user  .
   When  Click login button of the account  .
   Then   Scroll down to the newsletter subscription section.
   And   Select the "Yes" option for subscribing to the newsletter option  .       
  
   
   Examples:  
      | username      | password |    
   | TeamQA     | teamA1234@   |
   
   
   
   @Tc_15  @Select_"No_in_the_Newsletter_subscription
   Scenario Outline:015_Select_ "No" in the Newsletter subscription
    Given Navigate to the registration web page of "Your Store" e-commerce website
    When Log in to the account
    And  Scroll to the newsletter subscription section
    When Select the "No" option for subscribing to the newsletter page
    And  Click the "Submit" button
 
 	
   Examples:  
      | username      | password     |
   | TeamQA     | teamA1234@   |
   
   
   
 
     

   
   
     
 

