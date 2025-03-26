package com.pdl.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I_CheckoutFunctionality_Tc_39_Steps {
	@Given("Launch the browser and navigate to the correct URL")
	public void launch_the_browser_and_navigate_to_the_correct_url() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Launch the browser and navigate to the correct URL");
	}

	@Then("Verify that the shopping cart option is visible and accessible")
	public void verify_that_the_shopping_cart_option_is_visible_and_accessible() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the shopping cart option is visible and accessible");
	}

	@When("Verify that user are able to search for a product and add it to the shopping cart")
	public void verify_that_user_are_able_to_search_for_a_product_and_add_it_to_the_shopping_cart() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that user are able to search for a product and add it to the shopping cart");
	}

	@Then("Verify that the checkout button is enabled")
	public void verify_that_the_checkout_button_is_enabled() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the checkout button is enabled");
	}

	@When("Verify that user are able to Remove all items from the shopping cart")
	public void verify_that_user_are_able_to_remove_all_items_from_the_shopping_cart() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that user are able to Remove all items from the shopping cart");
	}

	@Then("Verify that the checkout button is disabled")
	public void verify_that_the_checkout_button_is_disabled() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the checkout button is disabled");
	}

	@Then("Attempt to click the disabled checkout button and verify the displayed error message")
	public void attempt_to_click_the_disabled_checkout_button_and_verify_the_displayed_error_message() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Attempt to click the disabled checkout button and verify the displayed error message");
	}
}
