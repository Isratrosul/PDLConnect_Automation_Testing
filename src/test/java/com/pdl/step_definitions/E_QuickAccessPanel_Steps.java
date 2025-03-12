package com.pdl.step_definitions;

import com.pdl.pages.Homepage_Quafox;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class E_QuickAccessPanel_Steps extends  Homepage_Quafox {
	
	
	
	 Homepage_Quafox Quickaccess = new  Homepage_Quafox();
	 
	 
	
	@Given("Navigate to the Quick Access Panel using the provided URL")
	public void navigate_to_the_quick_access_panel_using_the_provided_url() {
		// Quickaccess.navigate_to_the_quick_access_panel();
		Quickaccess.recurring_payments();
		
		
		
	}

	@Then("Verify the Recurring Payments option is visible in the Quick Access Panel.")
	public void verify_the_recurring_payments_option_is_visible_in_the_quick_access_panel() {
	Quickaccess.recurring_payments();
	
	
	}

	@When("Clicking the Recurring Payments option should redirect to the recurring payments page.")
	public void clicking_the_recurring_payments_option_should_redirect_to_the_recurring_payments_page() {
	  
	}

	@Then("Verify the Recurring Payments option is clickable and not blocked by any other elements.")
	public void verify_the_recurring_payments_option_is_clickable_and_not_blocked_by_any_other_elements() {
	  
	}

	@Then("Verify the recurring payments page loads properly.")
	public void verify_the_recurring_payments_page_loads_properly() {
	  
	}
	
	
	
	
	// TC-26
	@Then("Verify the Reward Points option is visible in the Quick Access Panel.")
	public void verify_the_reward_points_option_is_visible_in_the_quick_access_panel() {
	
		Quickaccess.verify_the_reward_points_option();
	}

	@When("Clicking the Reward Points option should redirect to the reward points page.")
	public void clicking_the_reward_points_option_should_redirect_to_the_reward_points_page() {
	
		
	}

	@Then("Verify the Reward Points option is clickable and not blocked by any other elements.")
	public void verify_the_reward_points_option_is_clickable_and_not_blocked_by_any_other_elements() {
	
		
	}

	@Then("Verify the reward points page loads properly.")
	public void verify_the_reward_points_page_loads_properly() {
	  
	}
	
	@Then("Verify the Returns option is visible in the Quick Access Panel.")
	public void verify_the_returns_option_is_visible_in_the_quick_access_panel() {
	   Quickaccess.verify_the_returns_option();
	}

	@When("Clicking the Returns option should redirect to the returns page.")
	public void clicking_the_returns_option_should_redirect_to_the_returns_page() {
	  
	}

	@Then("Verify the Returns option is clickable and not blocked by any other elements.")
	public void verify_the_returns_option_is_clickable_and_not_blocked_by_any_other_elements() {
	   
	}

	@Then("Verify the returns page loads properly.")
	public void verify_the_returns_page_loads_properly() {
	   
	}

	@Then("Verify the Transactions option is visible in the Quick Access Panel.")
	public void verify_the_transactions_option_is_visible_in_the_quick_access_panel() {
	   Quickaccess.verify_the_transactions_option_is_visible_in_the_quick_access_panel();
	}

	@When("Clicking the Transactions option should redirect to the transactions page.")
	public void clicking_the_transactions_option_should_redirect_to_the_transactions_page() {
	   
	}

	@Then("Verify the Transactions option is clickable and not blocked by any other elements.")
	public void verify_the_transactions_option_is_clickable_and_not_blocked_by_any_other_elements() {
	   
	}

	@Then("Verify the transactions page loads properly.")
	public void verify_the_transactions_page_loads_properly() {
	   
	}

	@Then("Verify the Newsletter option is visible in the Quick Access Panel.")
	public void verify_the_newsletter_option_is_visible_in_the_quick_access_panel() {
		
	  Quickaccess.verify_the_newsletter_option_is_visible_in_the_quick_access_panel();
	}

	@When("Clicking the Newsletter option should redirect to the newsletter page.")
	public void clicking_the_newsletter_option_should_redirect_to_the_newsletter_page() {
	   
	}

	@Then("Verify the Newsletter option is clickable and not blocked by any other elements.")
	public void verify_the_newsletter_option_is_clickable_and_not_blocked_by_any_other_elements() {
	    
	}

	@Then("Verify the newsletter page loads properly.")
	public void verify_the_newsletter_page_loads_properly() {
	  
	}
	
	

}
