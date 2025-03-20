package com.pdl.step_definitions;


         //  newsletter step definition class

	import org.testng.Assert;

	import com.github.dockerjava.api.model.Driver;
	import com.pdl.pages.Registration_Quafox;

	import io.cucumber.java.en.*;


	public class D_NewsletterSubscription_Steps extends Registration_Quafox {
		Registration_Quafox newsletterpage = new Registration_Quafox();
		@Given("Navigate to the registration web page of {string} e-commerce website for user  .")
		public void navigate_to_the_registration_web_page_of_e_commerce_website_for_user1(String website) {
		
		

			// calling methods for test case 14
			newsletterpage.navigate_to_the_registration_page(website);
			newsletterpage.navigate_the_registration_page(website);
		    newsletterpage.scroll_down_to_the_newsletter_subscription(website);
		    newsletterpage.select_yes_option(website);

			
			
		
		}
	// test case 14 _______________
		@When("Click login button of the account  .")
		public void click_login_button_of_the_account() {
			
			    
		}

		@Then("Scroll down to the newsletter subscription section.")
		public void scroll_down_to_the_newsletter_subscription_section() {
		  
		}

		@And("Select the {string} option for subscribing to the newsletter option  .")
		public void select_the_option_for_subscribing_to_the_newsletter_option(String string) {

		}



	// 15 test cases -------------
		@When("Log in to the account")
		public void log_in_to_the_account() {
		   
		}

		@And("Scroll to the newsletter subscription section")
		public void scroll_to_the_newsletter_subscription_section() {
		 
		}

		@When("Select the {string} option for subscribing to the newsletter page")
		public void select_the_option_for_subscribing_to_the_newsletter_page(String string) {
		    
		}

		@And("Click the {string} button")
		public void click_the_button(String string) {
		   
		}

	}

	    

 

