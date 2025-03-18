package com.pdl.step_definitions;
import static org.testng.Assert.assertTrue;
import com.pdl.pages.Registration_Quafox;
import com.pdl.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A_Registration_Steps extends Registration_Quafox {
	
	  Registration_Quafox registrationpage = new Registration_Quafox();
	  
	  
//Tc_01****************************************************************
	@Given("Navigate to the registration page using the provided URL")
	public void navigate_to_the_registration_page_using_the_provided_url() {
	  Driver.getDriver().get("https://tutorialsninja.com/demo/index.php?route=account/register");
	System.out.println("navigate_to_the_registration_page_using_the_provided_url_____Background");
	}
	

	@Then("Click the link")
	public void click_the_link() {
		registrationpage.clickcontinueButton();
	System.out.println("click_the_link_____step_2");
		
	}

	@When("clicking on the link it should redirect the user to the registration web page.")
	public void clicking_on_the_link_it_should_redirect_the_user_to_the_registration_web_page() {
	System.out.println("clicking_on_the_link_it_should_redirect_the_user_to_the_registration_web_page___step_3");
	registrationpage.isRegistrationFormDisplayed();
	}
	@Then("Insert all the  valid credentials  {string} {string}{string} {string}.")
	public void insert_all_the_valid_credentials(String First_name, String Last_name, String Email, String password ) {
    System.out.println("insert_all_the_valid_credentials__step_4");
	registrationpage.enterFirstName(First_name);
	registrationpage.enterLastName(Last_name);
	registrationpage.enterEmail(Email);
	registrationpage.enterPassword(password);
	}
	
	@Then("Insert {string} in the field of confirm password.")
	public void insert_in_the_field_of_confirm_password(String confirmpassword) {
		registrationpage.confirmpassword(confirmpassword);

	}

	@Then("Insert {string}  in the field of teleohone number.")
	public void insert_in_the_field_of_teleohone_number(String phonenumber) {
		registrationpage.telephonenumber(phonenumber);
	   
	}
	@Then("select the privacy policy box in order to agree .")
	public void select_the_privacy_policy_box_in_order_to_agree() {
		registrationpage.click_on_privacy_policy();
	}

	@Then("Click on the continue button.")
	public void click_on_the_continue_button() {
		registrationpage.clickcontinueButton();
	}

	@And("Click on the attached link and it redirect them to the login page.")
	public void click_on_the_attached_link_and_it_redirect_them_to_the_login_page() {
		System.out.println("click_on_the_attached_link_and_it_redirect_them_to_the_login_page____step_5");
		registrationpage.clickcontinueButton();
		registrationpage.Verify_user_link_direct_them_to_log_in_page();
		
	}
// TC_02****************************************************************
	
	@Then("Verify the user link is accessible and clickable.")
	public void verify_the_user_link_is_accessible_and_clickable( ) {
		  Driver.getDriver().get("https://tutorialsninja.com/demo/index.php?route=account/register");

		//registrationpage.isUserLinkVisible_and_clickable();
		
	}

	@When("Clicking on the link should redirect the user to the registration web page.")
	public void clicking_on_the_link_should_redirect_the_user_to_the_registration_web_page() {
		//registrationpage.redirect_user_to_link();
		registrationpage.input_valid_credential();

	}
	
	@And("The web page should display an error message when the user inputs invalid credentials.")
	public void the_web_page_should_display_an_error_message_when_the_user_inputs_invalid_credentials() {
		registrationpage.error_message_for_invalid_entry();
	}
	@When("Inserting invalid inputs, error messages should be displayed.")
	public void inserting_invalid_inputs_error_messages_should_be_displayed() {
		registrationpage.error_message_for_invalid_entry();

	}
	
	@When("Submitting an empty form should display an error message.")
	public void submitting_an_empty_form_should_display_an_error_message() {
		registrationpage.submitEmptyForm();
		
	}
	@And("Entering an invalid email format should display an error message.")
	public void entering_an_invalid_email_format_should_display_an_error_message() {
		registrationpage.email_error_msg();
		assertTrue(isErrorMessageDisplayed(), "error msg displayed for existing  email");
	}
	
	@And("An error message should display when the password does not meet the criteria.")
	public void an_error_message_should_display_when_the_password_does_not_meet_the_criteria() {
		registrationpage.enter_invalid_password();
	    
	}

   @Then("The user should receive a confirmation email after successful registration.")
   public void the_user_should_receive_a_confirmation_email_after_successful_registration() {
    
}
	
}
