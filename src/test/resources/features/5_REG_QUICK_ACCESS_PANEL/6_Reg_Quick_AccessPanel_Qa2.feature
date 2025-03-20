
 @Registration_Page_Quick_Access_Panel
 
 Feature: Quick_access_panel_test_cases
I want to use this template for my feature file          
 

   @Tc_16 @ValidateAccess_Quick_Access_Panel
    Scenario:016_validate_ quick access panel
     Given navigate  to the registration page quick access panel 
     And   check the quick access panel remains visible across all devices the users used 
     And   Confirm the quick access panel remains visible after a page is refreshed
     And   Ensure the quick access panel remains visible when scrolling down the page all the time  
     Then  Verify the quick access panel remains visible all the time 
     
     
     @Tc_17 @ValidateLogin_option
     Scenario:017_validate_ login option 
     Given Navigate to login Page 
     When  verify the Login option is visible in the quick access panel
     And   Check that when user click in the Login option is redirecting the user to login page 
     And   Verify that the Login page loads properly after clicking the Login option
     Then  Verify that the user are able to put all the necessary fields   
     
     
     @Tc_18 @Verify_Register_Option
     Scenario:18_Verify Register Option
  Given  Verify the Register option is visible in the Quick Access Panel
  When  The user clicks on the Register option in the Quick Access Panel
  Then  Verify that the user is redirected to the register page
  And   The user is redirected to the register page
  Then  Check that the register page loads properly
  And   The user is on the register page
  Then  Verify that the user is able to enter necessary fields, such as username and password.
  
  
  @Tc_19 @Verify_Forgotten_Password_Option
  Scenario:19_Verify Forgotten Password Option
   
   
    
     Then  Verify that the user is redirected to the password recovery page.
     And   The user is on the page with the Forgotten Password option visible
     And  Verify that the Forgotten Password option is clickable and not obstructed.
     When The user clicks on the Forgotten Password option
     Then   Verify that the password recovery page loads properly.
     And   The user is on the password recovery page
     And   Verify that the user is able to enter a valid email address on the Password Reset page.
     
     
     @Tc_20 @Verify_My_Account_Option
  Scenario:20_Verify My Account Option
  
  
  Given Verify the My Account option is visible in the Quick Access Panel
  When The user clicks on the My Account option in the Quick Access Panel
  And   Verify that the user is redirected to the user account page
  Then the user is on the page with the My Account option visible
  And  Verify that the My Account option is clickable and not cut off
  And The user clicks on the My Account option
  Then Verify that the user account page loads properly
  
  
   @Tc_21 @Verify_Address_Book_Option
  Scenario:21_Verify Address Book Option
  
  

  Given The user clicks on the Address Book option in the Quick Access Panel
  When   Verify that the user is redirected to the address book page
  And   Verify user is on the page with the Address Book option visible
  Then  Check that the Address Book option is clickable and not obstructed
  When The user clicks on the Address Book option
  Then Verify that the address book page loads properly
  
  
   @Tc_22 @Verify_Wish_List_Option
  Scenario:22_Verify Wish List Option
  


  Given  The user clicks on the Wish List option in the Quick Access Panel
  When  Verify that the user is redirected to the user wish list page
  And   The user is on the page with the Wish List option visible
  Then  Check that the Wish List option is clickable and not obstructed
  When  The user clicks on the Wish List option
  Then  Verify that the wish list page loads properly
  
  
   @Tc_23 @Verify_Order_History_Option
  Scenario:23_Verify Order History Option
  
  

  Given The user clicks on the Order History option in the Quick Access Panel
  When  Verify that the user is redirected to the order history page
  And  The user is on the page with the Order History option visible
  Then  Check that the Order History option is clickable and not obstructed
  When  The user clicks on the Order History option
  Then  Verify that the order history page loads properly
  
  
       
  @Tc_24 @Verify_Downloads_Option
  Scenario:24_verify Downloads Option
  
  

  Given The user clicks on the Downloads option in the Quick Access Panel
  When  Verify that the user is redirected to the downloads page
  And   The user is on the page with the Downloads option visible
  Then Check that the Downloads option is clickable and not blocked by any other elements
  When The user clicks on the Downloads option
  Then Verify that the downloads page loads properly
  
  
  
  
  
     
     
        
     
     
           

           
     

   

  