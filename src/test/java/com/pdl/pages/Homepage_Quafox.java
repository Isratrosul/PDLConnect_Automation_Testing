package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import junit.framework.Assert;

public class Homepage_Quafox extends CommonMethods{
	WebDriver driver = Driver.getDriver();

	public Homepage_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	 public void Verify_user_is_onHomepage () {
		String ActualTitle= driver.getTitle();
		String ExpectedTitle = "Register Account" ;
		Assert.assertEquals("Verify_user_is_on_Homepage",ActualTitle , ExpectedTitle);
	 }
}
