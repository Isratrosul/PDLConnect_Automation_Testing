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
    
   /* @FindBy(xpath = "/html/body/header/div/div/div[1]/div/h1/a")
    private WebElement Navigate_To_Homepage ;
    */
	
    
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[9]")
    private WebElement Recurring_payments;
    
    
    // tc 26
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[10]")
    private WebElement Reward_points_option;
    
    //tc 27
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[11]")
    private WebElement returns_option ;
    
    // tc28
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[12]")
    private WebElement transactions_option;
    
    //tc29
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[13]")
    	    private WebElement newsletter_option;
    
	public void recurring_payments () {
	
		String actualtitle=driver.getTitle();
		String expectedtitle="Register Account";
		Assert.assertEquals(actualtitle, expectedtitle, " Recurring Payments");
		// Recurring_payments.click();
	}


	public void verify_the_reward_points_option() {
		
	}

	


	
	public void verify_the_returns_option() {
	   
	}






	public void verify_the_transactions_option_is_visible_in_the_quick_access_panel() {
	   
	}





	public void verify_the_newsletter_option_is_visible_in_the_quick_access_panel() {
	  
	}




	
}