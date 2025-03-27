package com.pdl.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class I_CheckoutFunctionality_Tc_40_Steps {
	@When("Add a product to the shopping cart")
	public void add_a_product_to_the_shopping_cart() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Add a product to the shopping cart");
	}

	@And("Click on the checkout button")
	public void click_on_the_checkout_button() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click on the checkout button");
	}

	@Then("Verify that the checkout page displays the “Checkout as a Guest” option")
	public void verify_that_the_checkout_page_displays_the_checkout_as_a_guest_option() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the checkout page displays the “Checkout as a Guest” option");
	}

	@When("Select “Checkout as a Guest” and proceed")
	public void select_checkout_as_a_guest_and_proceed() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Select “Checkout as a Guest” and proceed");
	}

	@Then("Verify that the billing and delivery details fields include first name, last name, email, telephone, address, city, postcode, and country")
	public void verify_that_the_billing_and_delivery_details_fields_include_first_name_last_name_email_telephone_address_city_postcode_and_country() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the billing and delivery details fields include first name, last name, email, telephone, address, city, postcode, and country");
	}

	@And("Verify that at least one delivery method and one payment method is available")
	public void verify_that_at_least_one_delivery_method_and_one_payment_method_is_available() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that at least one delivery method and one payment method is available");
	}

	@When("Complete the checkout process as a guest")
	public void complete_the_checkout_process_as_a_guest() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Complete the checkout process as a guest");
	}

	@Then("Verify that the order confirmation page displays the order number, order details, payment details, and delivery details")
	public void verify_that_the_order_confirmation_page_displays_the_order_number_order_details_payment_details_and_delivery_details() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the order confirmation page displays the order number, order details, payment details, and delivery details");
	}
}
