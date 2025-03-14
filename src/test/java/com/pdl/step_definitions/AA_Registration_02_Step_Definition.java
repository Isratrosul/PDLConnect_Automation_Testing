package com.pdl.step_definitions;



import com.pdl.pages.Homepage_Quafox;
import com.pdl.pages.Registration_Quafox;
import com.pdl.utilities.*;
import io.cucumber.java.en.*;

public class AA_Registration_02_Step_Definition extends CommonMethods{
	
	
	
	 Registration_Quafox Registration02= new  Registration_Quafox();

		
	
		@When("The {string} button is visible and blue")
		public void the_button_is_visible_and_blue(String Create_Account) {
			Registration02.create_account_button(Create_Account);
				
			
		}
		@And("The {string} button is positioned at the bottom right of the form")
		public void the_button_is_positioned_at_the_bottom_right_of_the_form(String Create_Account) {


	}
		@When("All required field labels are correct and clear")
		public void all_required_field_labels_are_correct_and_clear() {
		   
		}
		@Then("I enter an {string} address and verify proper email format validation")
		public void i_enter_an_address_and_verify_proper_email_format_validation(String email) {
		}
		


		@And("I enter a valid password that adheres to policy requirements")
		public void i_enter_a_valid_password_that_adheres_to_policy_requirements() {
		}

		@And("The {string} and {string} fields match")
		public void the_and_fields_match(String Password, String ConfirmPassword) {
		}
		@When("I insert invalid data inputs")
		public void i_insert_invalid_data_inputs() {
		}

		@Then("The system rejects the invalid inputs")
		public void the_system_rejects_the_invalid_inputs() {
		}

		@When("I insert a duplicate email address")
		public void i_insert_a_duplicate_email_address() {
		}

		@Then("The system does not accept duplicate email addresses")
		public void the_system_does_not_accept_duplicate_email_addresses() {
		}
		@When("I complete the form with valid details")
		public void i_complete_the_form_with_valid_details() {
		}

		@Then("An OTP is sent to the correct email or phone number")
		public void an_otp_is_sent_to_the_correct_email_or_phone_number() {
		}

		@When("I enter the correct {string}")
		public void i_enter_the_correct(String OTP) {
		}

		@Then("{string} is successful")
		public void is_successful(String Registration_status) {
		}
		@When("I enter an incorrect OTP")
		public void i_enter_an_incorrect_otp() {
		}

		@Then("An error message is displayed")
		public void an_error_message_is_displayed() {
		}

		@And("The OTP expires after a set time")
		public void the_otp_expires_after_a_set_time() {
		}
		@When("I request to resend the OTP")
		public void i_request_to_resend_the_otp() {
		}

		@Then("The OTP is resent successfully")
		public void the_otp_is_resent_successfully() {
		}

		@When("Registration is successful")
		public void registration_is_successful() {
		}

		@Then("The user is redirected to the homepage")
		public void the_user_is_redirected_to_the_homepage() {
		}
		@And("A welcome message appears with the user’s name")
		public void a_welcome_message_appears_with_the_user_s_name() {
		}

		@And("The user can log in immediately")
		public void the_user_can_log_in_immediately() {
		}

		@When("Registration is unsuccessful")
		public void registration_is_unsuccessful() {
			//Log.info("******verify ******");
		}

		@Then("The user is unable to access restricted pages without logging in")
		public void the_user_is_unable_to_access_restricted_pages_without_logging_in() {
		}


	
}
