package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import junit.framework.Assert;


public class HomePage_Quafox extends CommonMethods{
	WebDriver driver = Driver.getDriver();
	
	public HomePage_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	public void verify_user_is_on_homepage() {
		String actualTitle = driver.getTitle();
		String expectedTitle = "Account Login";
		
		// Assert.assertEquals("Verify user is on homepage: ", expectedTitle, actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Verify user is on homepage: ");
		
	}

}
