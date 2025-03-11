package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import junit.framework.Assert;



public class Homepage_Quafox extends CommonMethods{
	
	WebDriver driver=Driver.getDriver();
	public Homepage_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
 // TC_25 Reyazul
    
    @FindBy(xpath = "/html/body/header/div/div/div[1]/div/h1/a")
    private WebElement Navigate_To_Homepage ;
    
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[9]")
    private WebElement Recurring_payments;
    
    
    
   
	

	@FindBy(xpath = "//div[@class='list-group']//a[text()='Register']")		
	public WebElement Register_Account;
	
	public WebElement RegisterAccount ;


	public void VerifyuseronHomepage () {
		String actualtitle=driver.getTitle();
		String expectedtitle="Account Login";
		//Assert.assertEquals("Verify user s on home ", actualtitle, expectedtitle);
		Assert.assertEquals(actualtitle, expectedtitle, " Verify user is on home");
	}
	
		
	public void navigate_to_the_quick_access_panel() {
		Navigate_To_Homepage.click();
	
	}
	

	public void verify_the_recurring_payments_option() {
		
		Recurring_payments.click();
	}

	/*public void clicking_the_recurring_payments_option_should_redirect_to_the_recurring_payments_page() {
	  
	}

	public void verify_the_recurring_payments_option_is_clickable_and_not_blocked_by_any_other_elements() {
	  
	}

	public void verify_the_recurring_payments_page_loads_properly() {
	  
	}
	
	
	
	public void verify_the_reward_points_option_is_visible_in_the_quick_access_panel() {
	
		
	}

	public void clicking_the_reward_points_option_should_redirect_to_the_reward_points_page() {
	
		
	}

	public void verify_the_reward_points_option_is_clickable_and_not_blocked_by_any_other_elements() {
	
		
	}

	public void verify_the_reward_points_page_loads_properly() {
	  
	}
	
	public void verify_the_returns_option_is_visible_in_the_quick_access_panel() {
	   
	}

	public void clicking_the_returns_option_should_redirect_to_the_returns_page() {
	  
	}

	public void verify_the_returns_option_is_clickable_and_not_blocked_by_any_other_elements() {
	   
	}

	public void verify_the_returns_page_loads_properly() {
	   
	}

	public void verify_the_transactions_option_is_visible_in_the_quick_access_panel() {
	   
	}

	public void clicking_the_transactions_option_should_redirect_to_the_transactions_page() {
	   
	}

	public void verify_the_transactions_option_is_clickable_and_not_blocked_by_any_other_elements() {
	   
	}

	public void verify_the_transactions_page_loads_properly() {
	   
	}

	public void verify_the_newsletter_option_is_visible_in_the_quick_access_panel() {
	  
	}

	public void clicking_the_newsletter_option_should_redirect_to_the_newsletter_page() {
	   
	}

	public void verify_the_newsletter_option_is_clickable_and_not_blocked_by_any_other_elements() {
	    
	}

	public void verify_the_newsletter_page_loads_properly() {
	  
	}
	*/

	
}