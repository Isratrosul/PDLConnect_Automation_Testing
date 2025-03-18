package com.pdl.step_definitions;



import com.pdl.pages.Contact_Us_Page;
import com.pdl.pages.Homepage_Quafox;
import com.pdl.pages.MyAccount_Page;
import com.pdl.utilities.Driver;

import io.cucumber.java.en.*;

public class C_Static_Header_Steps extends Homepage_Quafox{
	
	Homepage_Quafox static_Header = new Homepage_Quafox();
	Contact_Us_Page  contact_page = new Contact_Us_Page ();
	    MyAccount_Page  myaccount = new MyAccount_Page ();
	
	@Given("Navigate to registration {string}  {string} link .")
	public void navigate_to_registration_link(String staticHeader, String url_link) {
      Driver.getDriver().get("https://tutorialsninja.com/demo/index.php?route=account/register");
      static_Header.navigate_to_registration_page(staticHeader, url_link);
     
		     
	}

	@And("Scroll down the page to check if the static header remains visible at the top.")
	public void scroll_down_the_page_to_check_if_the_static_header_remains_visible_at_the_top() {
		static_Header.scroll_down_the_page_and_static_header_remains_visible_at_the_top();
	  
		
	    
	}

	@When("Ensure that the header is present on the homepage and other pages.")
	public void ensure_that_the_header_is_present_on_the_homepage_and_other_pages() {
		static_Header.header_is_present_on_the_homepage_and_other_pages();
	    
	}

	@And("Check that the header does not disappear when scrolling down the page.")
	public void check_that_the_header_does_not_disappear_when_scrolling_down_the_page() {
		static_Header.the_header_does_not_disappear_when_scrolling_down_the_page();
	   
	}
	
	//TC_08***************************************************************************************
	
	@And("I locate the currency selector dropdown in the header or relevant section")
	public void i_locate_the_currency_selector_dropdown_in_the_header_or_relevant_section() {
		static_Header.Verify__user_on_Homepage(); 
		static_Header.locate_currency_selector_dropdown_in_the_header();
	    
	}

	@When("I click on the currency dropdown to view available options")
	public void i_click_on_the_currency_dropdown_to_view_available_options() {
		static_Header.click_currency_dropdown_to_view_available_options();
	   
	}

	@Then("I select a different {string}")
	public void i_select_a_different(String currency_dropdown) {
		static_Header.select_a_different_currency(currency_dropdown);
	   
	}

	@And("I ensure product prices are updated to reflect the selected currency")
	public void i_ensure_product_prices_are_updated_to_reflect_the_selected_currency() {
		
	}

	@Then("I check if the page reloads or updates the content without errors after selecting the currency")
	public void i_check_if_the_page_reloads_or_updates_the_content_without_errors_after_selecting_the_currency() {
		static_Header.verify_page_reloads_or_updates_the_content_without_errors_after_selecting_the_currency();
	    
	}
// Tc_09 *************************************************************
	@Given("I locate the Contact option in the header or footer.")
	public void i_locate_the_contact_option_in_the_header_or_footer() {
		contact_page.locate_the_contact_option_in_the_header_or_footer();
	   
	}

	@When("I click on the Contact option.")
	public void i_click_on_the_contact_option() {
		contact_page.click_on_the_contact_option();
	    
	}

	@Then("I ensure that the {string} page displays the required {string}:")
	public void i_ensure_that_the_page_displays_the_required(String contactoption, String Field) {
		contact_page.contact_page_displays_the_required(contactoption, Field);
	    
	}

	@Then("I check if the contact form \\(if present) is functional.")
	public void i_check_if_the_contact_form_if_present_is_functional() {
		contact_page.verify_contact_form_is_present_and_functional();
	    
	}

	@Then("I ensure the page is accessible on different {string}:")
	public void i_ensure_the_page_is_accessible_on_different(String Device) {  // NOT SURE ABOUT THE TEST EXECUTON 
		contact_page.verift_contact_page_is_accessible_on_different(Device);
		 
	    
	   
	}
	
	//TC_10******************************************************ISRAT
	
	@Given("I Log in with {string}")
	public void i_log_in_with(String valid_crdentials) {
	   
		myaccount.click_on_my_account_button();
		myaccount.select_login_option_from_dropdown();
		myaccount.log_in_with_valid_credentials(valid_crdentials);
		myaccount.click_on_login_button();
	    
	}

	@When("I Locate and click on {string}")
	public void i_locate_and_click_on(String my_account) {
		myaccount.locate_and_click_on(my_account);
	    
	}

	@Then("I ensure the {string} page displays correct user details")
	public void i_ensure_the_page_displays_correct_user_details(String my_account) {
		myaccount.Verify_the_page_displays_correct_user_details(my_account);
	    
	}

	@And("I check if the {string} option is available")
	public void i_check_if_the_option_is_available(String edit_profile) {
		myaccount.check_if_the_option_is_available(edit_profile);
	    
	}

//TC_11*******************************************ISRAT 
	@And("I navigate to the managing My Wishlist URL")
	public void i_navigate_to_the_managing_my_wishlist_url() {
		myaccount.navigate_to_the_my_wishlist_url();
	    
	}

	@When("I log in to the account with {string} and {string}")
	public void i_log_in_to_the_account_with_and(String Email  , String Password) {
		myaccount.log_in_to_the_account_with_and(Email, Password);
	    
	}

	@Then("I click on {string}")
	public void i_click_on(String wishlist) {
		myaccount.click_on(wishlist);
		//myaccount.log_in_to_the_account_with_valid_info();
	    
	}

	@And("I add {string} to the wishlist")
	public void i_add_to_the_wishlist(String items) {
		myaccount.add_to_the_wishlist(items);
	    
	}

	@Then("I remove {string} from the wishlist")
	public void i_remove_from_the_wishlist(String items) {
		myaccount.remove_from_the_wishlist(items);
	    
	}

	@When("I verify item count updates")
	public void i_verify_item_count_updates() {
		myaccount.verify_item_count_updates();
	    
	}
	
//Tc_12*****************************ISRAT
	@And("I Log in to the account.")
	public void i_log_in_to_the_account() {
		myaccount.click_on_my_account();
		myaccount.insert_valid_data_for_login();
		myaccount.click_on_login_button();
		myaccount.click_on_wishlist_option();
		myaccount.add_product_to_shopping_cart();
	   
	}

	@When("I Click on the {string} icon.")
	public void i_click_on_the_icon(String shopping_cart) {
		myaccount.click_on_the_icon(shopping_cart);
	    
	}

	@Then("Verify items are displayed in the cart")
	public void verify_items_are_displayed_in_the_cart() {
		myaccount.Verify_items_displayed_in_the_cart();
	    
	}

	@And("Ensure the cart icon reflects the correct item count.")
	public void ensure_the_cart_icon_reflects_the_correct_item_count() {
		myaccount.Verify_the_cart_icon_reflects_the_correct_item_count();
	   
	}

	@Then("I  Check that the user can proceed to checkout from the cart page.")
	public void i_check_that_the_user_can_proceed_to_checkout_from_the_cart_page() {
		myaccount.verify_that_the_user_can_proceed_to_checkout_from_the_cart_page();
	    
	}

//TC_13*******************************************ISRAT
	@And("I Log in to the account with user information")
	public void i_log_in_to_the_account_with_user_information() {
		myaccount.log_in_to_the_account_with_user_information();
		myaccount.click_add_to_cart();

	   
	}

	@When("I Click on  {string} icon")
	public void i_click_on_icon(String s_carticon) {
		myaccount.click_on_icon(s_carticon);
		myaccount.click_remove_item_from_cart();
	    
	}
	
	@Then("I Click on the {string} button")
	public void i_click_on_the_button(String proceed_checkout_button) {
	    myaccount.click_on_the_button(proceed_checkout_button);
	}

	@And("I Ensure that the checkout page displays billing and shipping options")
	public void i_ensure_that_the_checkout_page_displays_billing_and_shipping_options() {
		myaccount.ensure_that_the_checkout_page_displays_billing_and_shipping_options();
	    
	}

	@Then("I Check if the user can enter billing and shipping information")
	public void i_check_if_the_user_can_enter_billing_and_shipping_information() {
		myaccount.check_if_the_user_can_enter_billing_and_shipping_information();
	    
	}

	@And("I Verify the {string} button is visible and functional")
	public void i_verify_the_button_is_visible_and_functional(String complete_purchase_button) {
		myaccount.verify_the_button_is_visible_and_functional(complete_purchase_button);
	    
	}















	
	
}
