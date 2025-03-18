package com.pdl.step_definitions;



import com.pdl.pages.MyAccount_Page;
import com.pdl.pages.Registration_Quafox;
import com.pdl.utilities.*;
import io.cucumber.java.en.*;

public class AA_Registration_02_Step_Definition extends CommonMethods{
	
	
	
	 Registration_Quafox Registration02= new  Registration_Quafox();
	 MyAccount_Page myaccountPage =new MyAccount_Page ();
	 

	 @Given("Navigate to the registration page .")
	 public void navigate_to_the_registration_page() {
		 Registration02.click_on_registrationz_link();
		 
		 Registration02.RegistrationFormDisplayed();
	    
	   }
	 
		@Then("I enter an {string} address and verify proper email format validation")
		public void i_enter_an_address_and_verify_proper_email_format_validation(String email) {
			Registration02.proper_email_format_validation();
			
		}
		
		@And("I enter a valid password that adheres to policy requirements")
		public void i_enter_a_valid_password_that_adheres_to_policy_requirements() {
			Registration02.valid_password_that_adheres_to_policy_requirements();
		}

		@And("The {string} and {string} fields match")
		public void the_and_fields_match(String Password, String ConfirmPassword) {
			Registration02.password_and_confirm_password_matches(Password, ConfirmPassword);
		}
		@When("I insert invalid data inputs")
		public void i_insert_invalid_data_inputs() {
			Registration02.enter_invalid_data();
		}

		@Then("The system rejects the invalid inputs")
		public void the_system_rejects_the_invalid_inputs() {
			Registration02.invalid_input_email_rejected();
			Registration02.invalid_input_password_rejected();
			
		}

		@When("I insert a duplicate email address")
		public void i_insert_a_duplicate_email_address() {
			Registration02.input_duplicate_email();
		
		}

		@Then("The system does not accept duplicate email addresses")
		public void the_system_does_not_accept_duplicate_email_addresses() {
			Registration02.duplicate_email_rejected();
		}
		@When("I complete the form with valid details")
		public void i_complete_the_form_with_valid_details() {
			Registration02.Validate_form_with_valid_details();
		}
		@When("I enter the correct {string}")
		public void i_enter_the_correct(String otp) {
			Registration02.enter_the_correct_otp(otp);
		  
		}

		@Then("{string} is successful")
		public void is_successful(String Registration_status) {
		}
		@When("I enter an incorrect OTP")
		public void i_enter_an_incorrect_otp() {
			Registration02.i_enter_an_incorrect_otp();
		}

		@Then("An error message is displayed")
		public void an_error_message_is_displayed() {
			Registration02.an_error_message_is_displayed();
		}

		@And("The OTP expires after a set time")
		public void the_otp_expires_after_a_set_time() throws InterruptedException {
			Registration02.the_otp_expires_after_a_set_time();
		}
		@When("I request to resend the OTP")
		public void i_request_to_resend_the_otp() {
			Registration02.i_request_to_resend_the_otp();
		}

		@Then("The OTP is resent successfully")
		public void the_otp_is_resent_successfully() {
			Registration02.the_otp_is_resent_successfully();
		}

		@When("Registration is successful")
		public void registration_is_successful() {
			Registration02.registration_is_successful();
		}

		@Then("The user is redirected to the homepage")
		public void the_user_is_redirected_to_the_homepage() {
			Registration02.enter_all_credential();
			Registration02.the_user_is_redirected_to_the_homepage();
		}
		
		@When("Registration is unsuccessful")
		public void registration_is_unsuccessful() {
			Registration02.registration_is_unsuccessful();
		}

		@Then("The user is unable to access restricted pages without logging in")
		public void the_user_is_unable_to_access_restricted_pages_without_logging_in() {
			Registration02.the_user_is_unable_to_access_restricted_pages_without_logging_in();
		}


	
}
