package com.pdl.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I_CheckoutFunctionality_Tc_41_Steps {
	@Given("Click on the login button and enter valid credentials")
	public void click_on_the_login_button_and_enter_valid_credentials() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click on the login button and enter valid credentials");
	}

	@When("Verify that the user is successfully logged in")
	public void verify_that_the_user_is_successfully_logged_in() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the user is successfully logged in");
	}

	@Then("Search for a product and add it to the shopping cart")
	public void search_for_a_product_and_add_it_to_the_shopping_cart() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Search for a product and add it to the shopping cart");
	}

	@Then("Verify that the checkout button on the shopping cart page is visible and clickable")
	public void verify_that_the_checkout_button_on_the_shopping_cart_page_is_visible_and_clickable() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the checkout button on the shopping cart page is visible and clickable");
	}

	@Then("Locate and select the Check out with my account option")
	public void locate_and_select_the_check_out_with_my_account_option() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Locate and select the Check out with my account option");
	}

	@When("Verify that the checkout form is pre-filled with saved billing and delivery details")
	public void verify_that_the_checkout_form_is_pre_filled_with_saved_billing_and_delivery_details() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the checkout form is pre-filled with saved billing and delivery details");
	}

	@Then("Update billing, delivery, and payment method details, if needed")
	public void update_billing_delivery_and_payment_method_details_if_needed() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Update billing, delivery, and payment method details, if needed");
	}
}
