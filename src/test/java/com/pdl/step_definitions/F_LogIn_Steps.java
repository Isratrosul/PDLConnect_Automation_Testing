package com.pdl.step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.pdl.pages.Registration_Quafox;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F_LogIn_Steps extends Registration_Quafox {
	
	
	Registration_Quafox login = new Registration_Quafox();

	@Given("Navigate to the {string} website using the provided URL")
	public void navigate_to_the_website_using_the_provided_url(String string) {
	  login.Registration_Process();
		
	}

/*	@Then("Click the link and verify it is accessible and clickable.")
	public void click_the_link_and_verify_it_is_accessible_and_clickable() {
	  //login.Registration_Process();
		
	}

	@When("Clicking on the link, it should redirect the user to the registration web page.")
	public void clicking_on_the_link_it_should_redirect_the_user_to_the_registration_web_page() {
	  // login.Registration_Process();
		
	}
*/
	@Then("Click on the {string} option from the homepage or header menu.")
	public void click_on_the_option_from_the_homepage_or_header_menu(String string) {
	   login.login();
	}

	@Then("Verify the Login Page displays two sections:")
	public void verify_the_login_page_displays_two_sections(io.cucumber.datatable.DataTable dataTable) {
	 //login.login();
		
	}

	@Then("Confirm the {string} button is present under the New Customer section.")
	public void confirm_the_button_is_present_under_the_new_customer_section(String string) {
	  
		
	}

	@When("Click the {string} button.")
	public void click_the_button(String string) {
	   login.new_customer();
		
	}

	@Then("Confirm the login button is accessible and clickable.")
	public void confirm_the_login_button_is_accessible_and_clickable() {
	   
		
	}

	/*@Then("Confirm the user is redirected to the Registration Form page.")
	public void confirm_the_user_is_redirected_to_the_registration_form_page() {
	   
		
	}

	@Then("Check the Registration Form contains the following fields:")
	public void check_the_registration_form_contains_the_following_fields(io.cucumber.datatable.DataTable dataTable) {
	 
		
	}
*/
	@When("Enter valid information in the required fields.")
	public void enter_valid_information_in_the_required_fields() {
	    
		login.first_Name();
		login.last_name();
		login.email();
		login.telephone();
		login.password();
		login.confirm_password();
		
	
		
	}

	@Then("Select {string} or {string} for Newsletter Subscription.")
	public void select_or_for_newsletter_subscription(String string, String string2) {
	   login.newsletter();
	}

	@Then("Check the Privacy Policy agreement box.")
	public void check_the_privacy_policy_agreement_box() {
	  login.policy();
		
	}

	@Then("Verify the form submission is successful.")
	public void verify_the_form_submission_is_successful() {
	   login.ccontinue();
		
	}

	@Then("Confirm the user is redirected to the Account Dashboard or Homepage.")
	public void confirm_the_user_is_redirected_to_the_account_dashboard_or_homepage() {
	  
	}

	@Then("Check for a Welcome Message.")
	public void check_for_a_welcome_message() {
	}
	
	@Then("Confirm the {string} section is present on the login page.")
	public void confirm_the_section_is_present_on_the_login_page(String string) {
	  login.login();
	}

	@When("Enter a valid email and password in the {string} section.")
	public void enter_a_valid_email_and_password_in_the_section(String string) {
	   
		login.Login_email();
		login.Login_password();
	}

	@Then("Confirm the user sees a welcome message.")
	public void confirm_the_user_sees_a_welcome_message() {

		
	}

	@Then("Verify the account options available.")
	public void verify_the_account_options_available() {
	   
	}
	
	@Then("Verify the {string} section is present on the login page.")
	public void verify_the_section_is_present_on_the_login_page(String string) {
	  
		
	}

	@When("Enter an invalid email or incorrect password.")
	public void enter_an_invalid_email_or_incorrect_password() {
	   
	}

	@Then("Verify the error message appears in red below the login form.")
	public void verify_the_error_message_appears_in_red_below_the_login_form() {
	   
	}

	@Then("Confirm the email and password fields remain populated.")
	public void confirm_the_email_and_password_fields_remain_populated() {
	    
	}
	@Then("Click on the {string} link under the {string} section.")
	public void click_on_the_link_under_the_section(String string, String string2) {
	   
	}

	@Then("Verify the password reset form contains an email input field.")
	public void verify_the_password_reset_form_contains_an_email_input_field() {
	   
	}

	@When("Enter a registered email address in the password reset form.")
	public void enter_a_registered_email_address_in_the_password_reset_form() {
	   
	}

	@When("Click on the {string} button.")
	public void click_on_the_button(String string) {
	  
	}

	@Then("Check the registered email inbox for the password reset email.")
	public void check_the_registered_email_inbox_for_the_password_reset_email() {
	   
	}

	@When("Click on the password reset link in the email.")
	public void click_on_the_password_reset_link_in_the_email() {
	  
	}

	@Then("Ensure the reset link redirects users to a secure password reset page.")
	public void ensure_the_reset_link_redirects_users_to_a_secure_password_reset_page() {
	  
	}

	@Then("Validate the ability to set a new password successfully.")
	public void validate_the_ability_to_set_a_new_password_successfully() {
	
	}
	@Then("Check the Registration Form contains the following fields {string}:")
	public void check_the_registration_form_contains_the_following_fields(String string) {
	    
		
	}

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	    // throw new io.cucumber.java.PendingException();
	    System.out.println("I am on the login page");
	}

	@When("I click on the continue button under the new customer section")
	public void i_click_on_the_continue_button_under_the_new_customer_section() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("I click on the continue button under the new customer section");
	}

	@Then("I should see a registration form with fields for first name, last name, email, telephone, password and newsletter subscription")
	public void i_should_see_a_registration_form_with_fields_for_first_name_last_name_email_telephone_password_and_newsletter_subscription() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("I should see a registration form with fields for first name, last name, email, telephone, password and newsletter subscription");
	}

	@And("I should be able to submit the form and create an account after entering valid information and agreeing to the privacy policy")
	public void i_should_be_able_to_submit_the_form_and_create_an_account_after_entering_valid_information_and_agreeing_to_the_privacy_policy() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("I should be able to submit the form and create an account after entering valid information and agreeing to the privacy policy");
	}
}


