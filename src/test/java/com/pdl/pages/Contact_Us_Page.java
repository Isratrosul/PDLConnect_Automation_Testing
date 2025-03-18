package com.pdl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

public class Contact_Us_Page extends CommonMethods{
	 WebDriver driver=Driver.getDriver();
		
		public Contact_Us_Page() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		
		//Tc_09*************************************************************
		@FindBy(xpath = "/html/body/footer/div/div/div[2]/ul/li[1]/a")
		private WebElement contact_button;
		@FindBy(xpath = "/html/body/div[2]/div/div/form/fieldset/div[1]/div/input")
		private WebElement contact_field_name;
		@FindBy(xpath = "/html/body/div[2]/div/div/form/fieldset/div[2]/div/input")
		private WebElement contact_field_email;
		@FindBy(xpath = "/html/body/div[2]/div/div/form/fieldset/div[3]/div/textarea")
		private WebElement contact_field_enquiry;
		@FindBy(xpath = "/html/body/div[2]/div/div/form/fieldset/legend")
		private WebElement contact_form;
		@FindBy(xpath = "/html/body/footer/div/div/div[2]/ul/li[1]/a")
		private WebElement contact_on_devices;
		
		
		
		
		
		
		
		
		
		
		
		
//TC_09**************************************************************************************
         public void locate_the_contact_option_in_the_header_or_footer() {
					String actualtitle=driver.getTitle();
				    String expectedtitle="Register Account";
				    Assert.assertTrue(contact_button.isDisplayed(), "Contact button is  visible!");
				    	   
	}

       public void click_on_the_contact_option() {
		   contact_button.click();
				    
	}

		public void contact_page_displays_the_required(String contactoption, String Field) {
			contact_field_name.click();
			contact_field_email.click();
			contact_field_enquiry.click();
				    
	}

		public void verify_contact_form_is_present_and_functional() {
			contact_form.click();
			String actualtitle=driver.getTitle();
		    String expectedtitle="Contact Us";
		     Assert.assertEquals(actualtitle, expectedtitle, " Verify contact form is present and functional   ");  
		    
				    
	}

	  public void verift_contact_page_is_accessible_on_different(String Device) {
		  contact_on_devices.click();
				   
	}

		

}
