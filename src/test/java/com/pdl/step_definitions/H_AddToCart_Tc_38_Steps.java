package com.pdl.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class H_AddToCart_Tc_38_Steps {
	
	@Given("Ensure that each Add to Cart button is visible and clickable")
	public void ensure_that_each_add_to_cart_button_is_visible_and_clickable() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Ensure that each Add to Cart button is visible and clickable");
	}

	@When("Click Add to Cart for the first product")
	public void click_add_to_cart_for_the_first_product() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click Add to Cart for the first product");
	}

	@And("Click Add to Cart for the second product")
	public void click_add_to_cart_for_the_second_product() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click Add to Cart for the second product");
	}

	@Then("Add more products to the cart")
	public void add_more_products_to_the_cart() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Add more products to the cart");
	}

	@Then("Check the cart icon updates after each addition")
	public void check_the_cart_icon_updates_after_each_addition() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Check the cart icon updates after each addition");
	}

}
