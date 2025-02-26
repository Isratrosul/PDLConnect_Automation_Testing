package com.pdl.step_definitions;

import com.pdl.pages.Homepage_Quafox;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_Registration_Steps {
	
	
	Homepage_Quafox homePage= new Homepage_Quafox();
	
	@Given("Navigate to the registration page using the provided URL")
	public void navigate_to_the_registration_page_using_the_provided_url() {
		
		homePage.Verify_user_is_onHomepage();
	}

	@Then("Click the link")
	public void click_the_link() {
	    
	}

	@When("clicking on the link it should redirect the user to the registration web page.")
	public void clicking_on_the_link_it_should_redirect_the_user_to_the_registration_web_page() {
	    
	}

	@Then("Insert all the  valid credentials.")
	public void insert_all_the_valid_credentials() {
	    
	}

	@And("Click on the attached link and it redirect them to the login page.")
	public void click_on_the_attached_link_and_it_redirect_them_to_the_login_page() {
	    
	}




}
