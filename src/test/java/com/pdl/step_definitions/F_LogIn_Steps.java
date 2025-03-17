package com.pdl.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class F_LogIn_Steps {
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
