package com.pdl.step_definitions;



	import com.pdl.pages.Registration_Quafox;          

	import io.cucumber.java.en.And;
	import io.cucumber.java.en.*;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;

	public class E1_QuickAccessPanel_Step extends Registration_Quafox {
		Registration_Quafox quickaccesspanel = new Registration_Quafox();
		
		
		
		
			



	// test case 16 ______
		@Given("navigate  to the registration page quick access panel")
		public void navigate_to_the_registration_page_quick_access_panel() {
			quickaccesspanel.verify_user_is_on_quick_access_panel();
			
		   
		}
	  
		@And("check the quick access panel remains visible across all devices the users used")
		public void check_the_quick_access_panel_remains_visible_across_all_devices_the_users_used() {
		quickaccesspanel.check_quick_access_panel_remain_visible();
			
		  
		}

		@And("Confirm the quick access panel remains visible after a page is refreshed")
		public void confirm_the_quick_access_panel_remains_visible_after_a_page_is_refreshed() {
			quickaccesspanel.confirm_quick_access_panel_remain_visible_after_refresh();
		   
		}

		@And("Ensure the quick access panel remains visible when scrolling down the page all the time")
		public void ensure_the_quick_access_panel_remains_visible_when_scrolling_down_the_page_all_the_time() {
			quickaccesspanel.ensure_quick_access_panel_remain_visible_when_scrolling_down();
		   
		}

		@Then("Verify the quick access panel remains visible all the time")
		public void verify_the_quick_access_panel_remains_visible_all_the_time() {
			quickaccesspanel.verify_quick_access_panel_remain_visible();
		}
		
		 
		 // test case 17 ____-  
		
		@Given("Navigate to login Page")
		public void navigate_to_login_page() {
			quickaccesspanel.navigate_to_log_in_page();
		  
		}

		@When("verify the Login option is visible in the quick access panel")
		public void verify_the_login_option_is_visible_in_the_quick_access_panel() {
			quickaccesspanel.verify_the_login_option_is_visible();

			
		   
		}

		

	    @And("Check that when user click in the Login option is redirecting the user to login page")
	    public void check_that_when_user_click_in_the_login_option_is_redirecting_the_user_to_login_page() {
	    	quickaccesspanel.check_user_redirected_to__the_login_option_page();
	   	 
	    }
	   	 
	   	 
	    @And("Verify that the Login page loads properly after clicking the Login option")
		public void verify_that_the_login_page_loads_properly_after_clicking_the_login_option() {
	    	quickaccesspanel.check_when_user_redirected_to__the_login_option_page();
		}

		@Then("Verify that the user are able to put all the necessary fields")
		public void verify_that_the_user_are_able_to_put_all_the_necessary_fields() {
			quickaccesspanel.verify_login_page_loads_properly();
		   
		}
	  // Tc_18 _________
		
	    @Given("Verify the Register option is visible in the Quick Access Panel")
	    public void verify_the_register_option_is_visible_in_the_quick_access_panel() {
	    	quickaccesspanel.verify_the_user_is_able_to_enter_necessary_field();
	}

	   @When("The user clicks on the Register option in the Quick Access Panel")
	   public void the_user_clicks_on_the_register_option_in_the_quick_access_panel() {
		   quickaccesspanel.verify_the_aregister_option_is_visible();
	    
	}

	   @Then("Verify that the user is redirected to the register page")
	    public void verify_that_the_user_is_redirected_to_the_register_page() {
		   quickaccesspanel.verify_user_is_redirected_to_the_register_page_();
	   
	}

	   @And("The user is redirected to the register page")
	   public void the_user_is_redirected_to_the_register_page() {
		   quickaccesspanel.user_click_on_the_register_option_();
	   
	}

	   @Then("Check that the register page loads properly")
	   public void check_that_the_register_page_loads_properly() {
		   
	    
	}

	  @And("The user is on the register page")
	  public void the_user_is_on_the_register_page() {
		  quickaccesspanel.verify_user_is_redirected_to_the_register_page_();
	}

	  @Then("Verify that the user is able to enter necessary fields, such as username and password.")
	  public void verify_that_the_user_is_able_to_enter_necessary_fields_such_as_username_and_password() {
		  quickaccesspanel.the_user_is_redirected_to_the_register_page_();
	   
	}
	// test case 19 ------
	  


	@Then("Verify that the user is redirected to the password recovery page.")
	public void verify_that_the_user_is_redirected_to_the_password_recovery_page() {
		quickaccesspanel.verify_the_user_is_redirected__to_the_password_recovery_page();
	   
	}

	@And("The user is on the page with the Forgotten Password option visible")
	public void the_user_is_on_the_page_with_the_forgotten_password_option_visible() {
		quickaccesspanel.the_user_is_on__the_page_with_forgotten_password_option();
	   
	}

	@And("Verify that the Forgotten Password option is clickable and not obstructed.")
	public void verify_that_the_forgotten_password_option_is_clickable_and_not_obstructed() {
		quickaccesspanel.verify__the_the_forgotten_password_is_clickble();
	}

	@When("The user clicks on the Forgotten Password option")
	public void the_user_clicks_on_the_forgotten_password_option() {
		quickaccesspanel.user_clicks_on_the_forgotten_password();
	    
	}

	@Then("Verify that the password recovery page loads properly.")
	public void verify_that_the_password_recovery_page_loads_properly() {
		quickaccesspanel.verify_the_password_recovery_option_loads_properly();
	   
	}

	@And("The user is on the password recovery page")
	public void the_user_is_on_the_password_recovery_page() {
		quickaccesspanel.user_is_on_the_password_recovery_page();
	   
	}

	@And("Verify that the user is able to enter a valid email address on the Password Reset page.")
	public void verify_that_the_user_is_able_to_enter_a_valid_email_address_on_the_password_reset_page() {
		quickaccesspanel.verify_user_is_able_to_enter_valid_email_address();
	   
	}
	 
	// Test case 20 ______________

	@Given("Verify the My Account option is visible in the Quick Access Panel")
	public void verify_the_my_account_option_is_visible_in_the_quick_access_panel() {
		quickaccesspanel.verify_my_account_option_is_visible();
		
		
		
	}

	@When("The user clicks on the My Account option in the Quick Access Panel")
	public void the_user_clicks_on_the_my_account_option_in_the_quick_access_panel() {
		quickaccesspanel.clickMyAccount();
	    
	}

	@And("Verify that the user is redirected to the user account page")
	public void verify_that_the_user_is_redirected_to_the_user_account_page() {
		quickaccesspanel.verify_user_is_redirected_to_user_account();
	    
	}
	@Then("the user is on the page with the My Account option visible")
	public void the_user_is_on_the_page_with_the_my_account_option_visible() {
		quickaccesspanel.the_user_is_on_the_page_with_my_account_option();
	    
	}



	@And("Verify that the My Account option is clickable and not cut off")
	public void verify_that_the_my_account_option_is_clickable_and_not_cut_off() {
		quickaccesspanel.ClickMyAccountOption();
	    
	}

	@And("The user clicks on the My Account option")
	public void the_user_clicks_on_the_my_account_option() {
		quickaccesspanel.UserClickMyAccountOption();
		
	   
	}

	@Then("Verify that the user account page loads properly")
	public void verify_that_the_user_account_page_loads_properly() {
		quickaccesspanel.verify_the_account_page_loads_properly();
	    
	}
	// test case 21 --------------------

	@Given("The user clicks on the Address Book option in the Quick Access Panel")
	public void the_user_clicks_on_the_address_book_option_in_the_quick_access_panel() {
		quickaccesspanel.user_click_on_the_address_book_option();
	}

	@When("Verify that the user is redirected to the address book page")
	public void verify_that_the_user_is_redirected_to_the_address_book_page() {
		quickaccesspanel.the_user_is_redirected_to_the_address_book_page();
	}

	@And("Verify user is on the page with the Address Book option visible")
	public void verify_user_is_on_the_page_with_the_address_book_option_visible() {
		quickaccesspanel.verify_user_is_on_the_page_with_address_book_option();
	} 

	@Then("Check that the Address Book option is clickable and not obstructed")
	public void check_that_the_address_book_option_is_clickable_and_not_obstructed() {
		quickaccesspanel.clickAdressBook();
	}

	@When("The user clicks on the Address Book option")
	public void the_user_clicks_on_the_address_book_option() {
		quickaccesspanel.the_user_clicks_on_the_address_book_option();
	}

	@Then("Verify that the address book page loads properly")
	public void verify_that_the_address_book_page_loads_properly() {
		quickaccesspanel.Verify_that_the_address_book_page_loads_properly();
	}
	//test case_22 _______________________-

	@Given("The user clicks on the Wish List option in the Quick Access Panel")
	public void the_user_clicks_on_the_wish_list_option_in_the_quick_access_panel() {
		quickaccesspanel.user_click_on_the_wish_list_option();
	}

	@When("Verify that the user is redirected to the user wish list page")
	public void verify_that_the_user_is_redirected_to_the_user_wish_list_page() {
		quickaccesspanel.the_user_is_redirected_to_the_wish_list_option();
	}

	@And("The user is on the page with the Wish List option visible")
	public void the_user_is_on_the_page_with_the_wish_list_option_visible() {
		quickaccesspanel.verify_user_is_on_the_page_with_wish_list_option();
	}

	@Then("Check that the Wish List option is clickable and not obstructed")
	public void check_that_the_wish_list_option_is_clickable_and_not_obstructed() {
		quickaccesspanel.the_user_clicks_on_the_wish_list_option();
	}

	@When("The user clicks on the Wish List option")
	public void the_user_clicks_on_the_wish_list_option() {
		quickaccesspanel.the_user_clicks_on_the_wish_list_option();
	}

	@Then("Verify that the wish list page loads properly")
	public void verify_that_the_wish_list_page_loads_properly() {
		quickaccesspanel.Verify_that_the_wish_list_page_loads_properly();
	}

	//test case 23 --------------------

	@Given("The user clicks on the Order History option in the Quick Access Panel")
	public void the_user_clicks_on_the_order_history_option_in_the_quick_access_panel() {
		quickaccesspanel.user_click_on_the_order_history_option();
	}

	@When("Verify that the user is redirected to the order history page")
	public void verify_that_the_user_is_redirected_to_the_order_history_page() {
		quickaccesspanel.the_user_is_redirected_to_the_order_history_option();
	}

	@And("The user is on the page with the Order History option visible")
	public void the_user_is_on_the_page_with_the_order_history_option_visible() {
		quickaccesspanel.verify_user_is_on_the_page_with_order_history_option();
	}

	@Then("Check that the Order History option is clickable and not obstructed")
	public void check_that_the_order_history_option_is_clickable_and_not_obstructed() {
		quickaccesspanel.OrderHistory();
	}

	@When("The user clicks on the Order History option")
	public void the_user_clicks_on_the_order_history_option() {
		quickaccesspanel.the_user_clicks_on_the_order_history_option();
	}

	@Then("Verify that the order history page loads properly")
	public void verify_that_the_order_history_page_loads_properly() {
		quickaccesspanel.Verify_that_the_order_history_page_loads_properly();

	}

	//test case 24 --------------------

	@Given("The user clicks on the Downloads option in the Quick Access Panel")
	public void the_user_clicks_on_the_downloads_option_in_the_quick_access_panel() {
		quickaccesspanel.downloads();
	}

	@When("Verify that the user is redirected to the downloads page")
	public void verify_that_the_user_is_redirected_to_the_downloads_page() {
		quickaccesspanel.the_user_is_redirected_to_the_downloads_option();
	}

	@When("The user is on the page with the Downloads option visible")
	public void the_user_is_on_the_page_with_the_downloads_option_visible() {
		quickaccesspanel.verify_user_is_on_the_page_with_downloads_option();
	}

	@Then("Check that the Downloads option is clickable and not blocked by any other elements")
	public void check_that_the_downloads_option_is_clickable_and_not_blocked_by_any_other_elements() {
		quickaccesspanel.downloads();
	}

	@When("The user clicks on the Downloads option")
	public void the_user_clicks_on_the_downloads_option() {
		quickaccesspanel.the_user_clicks_on_the_downloads_option();
	}

	@Then("Verify that the downloads page loads properly")
	public void verify_that_the_downloads_page_loads_properly() {
		quickaccesspanel.Verify_that_the_downloads_page_loads_properly();
	}







	}



	    










