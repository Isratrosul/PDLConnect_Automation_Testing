package com.pdl.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class G_SearchFunctionality_Tc_36_Steps {
	
	
	@Given("Perform a search using either keyword or category search to generate a results page")
	public void perform_a_search_using_either_keyword_or_category_search_to_generate_a_results_page() {
	    // throw new io.cucumber.java.PendingException();
		// homepage.verify_user_is_on_homepage();
		System.out.println("Perform a search using either keyword or category search to generate a results page");
	}

	@When("Locate the Sort By drop-down menu on the search results page")
	public void locate_the_sort_by_drop_down_menu_on_the_search_results_page() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Locate the Sort By drop-down menu on the search results page");
	}

	@Then("Verify that the Sort By menu is visible")
	public void verify_that_the_sort_by_menu_is_visible() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the Sort By menu is visible");
	}

	@Then("Click the drop-down and check for available sorting options Name \\(A-Z)")
	public void click_the_drop_down_and_check_for_available_sorting_options_name_a_z() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click the drop-down and check for available sorting options Name \\(A-Z)");
	}

	@And("Click the drop-down and check for available sorting options Name \\(Z-A)")
	public void click_the_drop_down_and_check_for_available_sorting_options_name_z_a() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click the drop-down and check for available sorting options Name \\(Z-A)");
	}

	@And("Click the drop-down and check for available sorting options Price \\(Low-High)")
	public void click_the_drop_down_and_check_for_available_sorting_options_price_low_high() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click the drop-down and check for available sorting options Price \\(Low-High)");
	}

	@And("Click the drop-down and check for available sorting options Price \\(High-Low)")
	public void click_the_drop_down_and_check_for_available_sorting_options_price_high_low() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click the drop-down and check for available sorting options Price \\(High-Low)");
	}

	@And("Click the drop-down and check for available sorting options Rating \\(Highest)")
	public void click_the_drop_down_and_check_for_available_sorting_options_rating_highest() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Click the drop-down and check for available sorting options Rating \\(Highest)");
	}

	@And("Select a sorting option Price \\(Low-High) from the drop-down")
	public void select_a_sorting_option_price_low_high_from_the_drop_down() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Select a sorting option Price \\(Low-High) from the drop-down");
	}

	@Then("Verify that the search results are updated accordingly")
	public void verify_that_the_search_results_are_updated_accordingly() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Verify that the search results are updated accordingly");
	}

	@Then("Confirm that the products are now sorted in ascending order by price")
	public void confirm_that_the_products_are_now_sorted_in_ascending_order_by_price() {
	    // throw new io.cucumber.java.PendingException();
	    System.out.println("Confirm that the products are now sorted in ascending order by price");
	}

	@Then("Repeat for other sorting options to ensure each one sorts the results correctly")
	public void repeat_for_other_sorting_options_to_ensure_each_one_sorts_the_results_correctly() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Repeat for other sorting options to ensure each one sorts the results correctly");
	}

	@Then("Ensure that during and after sorting, each product listing still displays an image, name, and price")
	public void ensure_that_during_and_after_sorting_each_product_listing_still_displays_an_image_name_and_price() {
	    // throw new io.cucumber.java.PendingException();
		System.out.println("Ensure that during and after sorting, each product listing still displays an image, name, and price");
	}
}
