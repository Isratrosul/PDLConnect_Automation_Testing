package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

//import junit.framework.Assert;



public class Homepage_Quafox extends CommonMethods{
	
	WebDriver driver=Driver.getDriver();
	public Homepage_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Register']")		public WebElement Register_Account;
	public WebElement RegisterAccount ;

	
	public void VerifyuseronHomepage () {
		String actualtitle=driver.getTitle();
		String expectedtitle="Account Login";
		//Assert.assertEquals("Verify user s on home ", actualtitle, expectedtitle);
		Assert.assertEquals(actualtitle, expectedtitle, " Verify user is on home");
	}
	
	public  void Register_an_account () {
		RegisterAccount.click();
	}
	
}