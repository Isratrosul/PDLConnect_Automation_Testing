package com.pdl.step_definitions;

import static org.testng.Assert.assertTrue;

import com.pdl.pages.Homepage_Quafox;

import io.cucumber.java.en.*;

public class B_ProductCatalog_Steps extends Homepage_Quafox{
	Homepage_Quafox Homepage = new Homepage_Quafox();
	
	@Given("Navigate to the {string} e-commerce website.")
	public void navigate_to_the_e_commerce_website(String website) {
		Homepage.Verify__user_on_Homepage(website);
	    
	}

	@And("Click the link and its ccessible and clickable")
	public void click_the_link_and_its_ccessible_and_clickable() {
		Homepage.Register_an_account();
	    
	}

	@When("Upon clicking on the link it should redirect the user to the registration web page.")
	public void upon_clicking_on_the_link_it_should_redirect_the_user_to_the_registration_web_page() {
	    Homepage.Link_redirect_the_user_to_the_registration_web_page();
	}

	@And("The static top menu is visible and accessible in every page  {string}  Website.")
	public void the_static_top_menu_is_visible_and_accessible_in_every_page_website(String Website) {
		Homepage.The_static_top_menu_is_visible_and_accessible(Website);
	   
	}

	@And("Locate and click on the {string} option in the static top menu.")
	public void locate_and_click_on_the_option_in_the_static_top_menu(String Product_Catalog) {
		Homepage.Locate_and_click_on_the_option_in_the_static_top_menu(Product_Catalog);
	    
	}

	@Then("Upon clicking the static top menu its responsive and usable on desktop and mobile devices.")
	public void upon_clicking_the_static_top_menu_its_responsive_and_usable_on_desktop_and_mobile_devices() {
		Homepage.static_top_menu_its_responsive_and_usable_on_desktop_and_mobile_devices();
	    
	}

	@And("Confirm the {string} page loads successfully.")
	public void confirm_the_page_loads_successfully(String Menu_option) {
		Homepage.Verify_menu_option_page_loads_successfully(Menu_option);
		    
	}
 //TC_05*************************************************************************
	
	@And("The {string} option is visible and labeled correctly.")
	public void the_option_is_visible_and_labeled_correctly(String product_catalog) {
		Homepage.The_product_catalog_option_is_visible_and_labeled_correctly(product_catalog); //Failed as expected 
	   
	}
	@When("Click on the product catalog option in the static top menu.")
	public void click_on_the_product_catalog_option_in_the_static_top_menu() {
		Homepage.click_on_the_static_top_menu_of_product_catalog();
	   
	}

	@And("Confirm the product catalog page loads successfully.")
	public void confirm_the_product_catalog_page_loads_successfully() {
		Homepage.verify_the_product_catalog_page_loads_successfully();
		
	   
	}

	@And("Confirm the “product catalog”  button and navigate users to the product catalog page directly.")//Failed as expected 
	public void confirm_the_product_catalog_button_and_navigate_users_to_the_product_catalog_page_directly() {
		Homepage.verify_the_product_catalog_button_navigate_users_to_the_product_catalog_page_directly();
	   
	}

//TC_06*****************************************************************************************************
	
	
	@When("The user is on the homepage")
	public void the_user_is_on_the_homepage() {
		Homepage.Verify__user_on_Homepage();
	    
	}

	@And("The user clicks on the product catalog option in the static top menu")
	public void the_user_clicks_on_the_product_catalog_option_in_the_static_top_menu() {
		Homepage.click_on_the_product_catalog_option_in_the_static_top_menu();
	    
	}
     @And("The product catalog displays all available products on the website")
	public void the_product_catalog_displays_all_available_products_on_the_website() {
	   
	}

     @When("Each product includes accurate details such as {string}, {string}, and {string}")
     public void each_product_includes_accurate_details_such_as_and(String name, String price, String description) {
    	 //AssertTrue("product details found ",Homepage.accurate_product_details_includes(name, price, description));
         Homepage.accurate_product_details_includes(name, price, description);
         
     }  
     
	@And("The catalog is organized with appropriate categories")
	public void the_catalog_is_organized_with_appropriate_categories() {
		Homepage.catalog_is_organized_with_appropriate_categories();
	}

	@And("The user verifies that filters are available and functional")
	public void the_user_verifies_that_filters_are_available_and_functional() {
		Homepage.filters_are_available_and_functional();
	    
	}

	@When("Clicking on a category displays only the relevant products")
	public void clicking_on_a_category_displays_only_the_relevant_products() {
		Homepage.click_on_the_categories();
	    
	}

	@And("Applying a filter displays only the products matching the selected criteria")
	public void applying_a_filter_displays_only_the_products_matching_the_selected_criteria() {
		Homepage.Applying_filter_displays_only_the_products_matching_the_selected_criteria();
	   
	}

	@When("The user navigates back and forth between categories, filters, and search results")
	public void the_user_navigates_back_and_forth_between_categories_filters_and_search_results() {
		Homepage.Navigate_to_product_catagories();
		Homepage.apply_Filter();
		Homepage.search_product_from_search_box("Cameras");
		Homepage.navigates_back_and_forth_between_categories_ilters_and_search_results();
	    
	}

	@Then("The navigation should be smooth without errors or glitches")
	public void the_navigation_should_be_smooth_without_errors_or_glitches() {
		Homepage.navigation_should_be_smooth_without_errors_or_glitches();
		
	    
	}





	

}
