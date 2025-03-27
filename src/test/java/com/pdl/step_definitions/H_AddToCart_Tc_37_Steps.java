package com.pdl.step_definitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.pdl.pages.HomePage_Quafox;

public class H_AddToCart_Tc_37_Steps {
	
	// HomePage_Quafox homepage = new HomePage_Quafox();
	
	@Given("Ensure that that the Add to Cart button is visible and clickable")
	public void ensure_that_that_the_add_to_cart_button_is_visible_and_clickable() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Ensure that that the Add to Cart button is visible and clickable");
	}

	@When("Hover over the Add to Cart button")
	public void hover_over_the_add_to_cart_button() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Hover over the Add to Cart button");
	}

	@Then("Check if product is in stock")
	public void check_if_product_is_in_stock() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Check if product is in stock");
	}

	@And("Check if product is out of stock")
	public void check_if_product_is_out_of_stock() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Check if product is out of stock");
	}

	@Then("Click Add to Cart for an in-stock product")
	public void click_add_to_cart_for_an_in_stock_product() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click Add to Cart for an in-stock product");
	}

	@Then("Ensure confirmation message style")
	public void ensure_confirmation_message_style() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Ensure confirmation message style");
	}

	@Then("Add the product to the cart")
	public void add_the_product_to_the_cart() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Add the product to the cart");
	}

	@And("Add another product to the cart")
	public void add_another_product_to_the_cart() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Add another product to the cart");
	}

}
