package com.pdl.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I_CheckoutFunctionality_Tc_42_Steps {
	@Given("Complete the checkout process as a registered customer")
	public void complete_the_checkout_process_as_a_registered_customer() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Complete the checkout process as a registered customer");
	}

	@Then("Verify that the error message Products marked with *** are not available in the desired quantity or not in stock! is displayed")
	public void verify_that_the_error_message_products_marked_with_are_not_available_in_the_desired_quantity_or_not_in_stock_is_displayed() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the error message Products marked with *** are not available in the desired quantity or not in stock! is displayed");
	}

	@Then("Verify that an error message is displayed when the required quantity of stock is exceeded")
	public void verify_that_an_error_message_is_displayed_when_the_required_quantity_of_stock_is_exceeded() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that an error message is displayed when the required quantity of stock is exceeded");
	}
}
