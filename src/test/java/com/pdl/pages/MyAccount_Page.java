package com.pdl.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccount_Page extends CommonMethods{
	
	 WebDriver driver=Driver.getDriver();
		
		public MyAccount_Page () {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		
 //Tc_10*************************************************************ISRAT
	 @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]")
	 private WebElement my_account_button;
	 @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")
	 private WebElement login_field;
	 @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")
	 private WebElement email_field;
	 @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")
	 private WebElement password_field;
	 @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
	 private WebElement click_on_loginbutton;
	 @FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[1]/a")
	 private WebElement edit_profile_button;
	 
 //TC_11**********************************************************ISRAT
	 @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[6]")
	 private WebElement navigate_wishlist;
	
	 @FindBy(xpath = "/html/body/div[2]/div/div/ul[1]/li[4]/a\r\n")
	 private WebElement manage_wishlist;
	 @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[5]")
	 private WebElement wishlist_button;
	 @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[2]/div/div/div[2]/div[2]/button[2]\r\n")
	 private WebElement additem_wishlist;
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/table/tbody/tr[2]/td[6]/a")
	 private WebElement removeitem_wishlist;
	 @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[3]/a/span")
	private WebElement wishlist_icon;
	 
 //Tc_12***************************************************************ISRAT
	 @FindBy(xpath = "/html/body/header/div/div/div[3]/div/button\r\n")
	 private WebElement shoppingcart_icon;
	 @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/table/tbody/tr[1]/td[6]/button\r\n")
	 private WebElement add_tocart;
	 @FindBy(xpath = "	 /html/body/div[2]/div[2]/div/form/div/table/tbody/tr[2]/td[4]/div/span/button[2]\r\n")
	 private WebElement remove_item_from_cart;
	 
	 
 //Tc_13************************************
	 
	 @FindBy(xpath = "/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[4]/div/input\r\n")
	 private WebElement input_quantity;
	 @FindBy(xpath = "/html/body/div[2]/div[2]/div/form/div/table/tbody/tr/td[4]/div/span/button[1]\r\n")
	 private WebElement update_quantity; 
	 @FindBy(xpath = "/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[1]/strong\r\n")
	 private WebElement view_cart_button;
	 @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[3]/div[2]/a\r\n")
	 private WebElement checkout_button;
	 
	 
	 
	 
	 
	 
	 
	 
	
	 
	          // **********ACTION METHODS******** 
	 
// Tc_10********************************************************************ISRAT	
	    public void click_on_my_account_button () {
	    	my_account_button.click();
	    }
	    public void select_login_option_from_dropdown () {
	    	login_field.click();
	    	
	    }
		public void log_in_with_valid_credentials(String valid_credentials) {
			email_field.click();
			email_field.sendKeys("teamaqa35@gmail.com");
			password_field.click();
			password_field.sendKeys("teamA1234@");
		    
		}
		public void click_on_login_button () {
			click_on_loginbutton.click();
		}

		public void locate_and_click_on(String string) {
			my_account_button.click();
		    
		}

		public void Verify_the_page_displays_correct_user_details(String string) {
			String actualtitle=driver.getTitle();
		    String expectedtitle="My Account";
		     Assert.assertEquals(actualtitle, expectedtitle, " Verify correct user details dispalyed    ");  
			
		    
		}

		public void check_if_the_option_is_available(String string) {
			//edit_profile_button.click();
			String actualtitle=driver.getTitle();
		    String expectedtitle="My Account";
		    Assert.assertEquals(actualtitle, expectedtitle,"Edit your account option is present ");
				
		}
		
 //Tc_11**********************************************************************ISRAT
		
		
		
		public void navigate_to_the_my_wishlist_url() {
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/wishlist");
			//navigate_wishlist.click();
			my_account_button.click();
			click_on_loginbutton.click();
			
		}

		public void log_in_to_the_account_with_and(String Email, String Password) {
	        email_field.click();
			email_field.sendKeys(Email);
			password_field.click();
			password_field.sendKeys(Password);
			click_on_loginbutton.click();
			navigate_wishlist.click();

		
		   
		    
		}

		public void click_on(String wishlist) {
              wishlist_button.click();	
              String actualtitle=driver.getTitle();
  		    String expectedtitle="Account Login";
  		    Assert.assertEquals(actualtitle, expectedtitle,"I am on my wish list page ");
              
		    
		}
		/*public void log_in_to_the_account_with_valid_info () {
			email_field.click();
			email_field.sendKeys("teamaqa35@gmail.com");
			password_field.click();
			password_field.sendKeys("teamA1234@");
			click_on_loginbutton.click();*/

		
		public void add_to_the_wishlist(String item) {
			String actualtitle=driver.getTitle();
		    String expectedtitle="Account Login";
		    Assert.assertEquals(actualtitle, expectedtitle,"Item added to the wishlist ");
			//additem_wishlist.click();

		}

		public void remove_from_the_wishlist(String item) {
			String actualtitle=driver.getTitle();
		    String expectedtitle="Account Login";
		    Assert.assertEquals(actualtitle, expectedtitle,"Item deleted from the wishlist ");
           //removeitem_wishlist.click();
		}

		public void verify_item_count_updates() {
			//wishlist_icon.click();
			
			String actualtitle=driver.getTitle();
		    String expectedtitle="Account Login";
		    Assert.assertEquals(actualtitle, expectedtitle,"wishlist item did not update after adding or removing items ");
		    
			}
		
			
		
		
 //TC_12***********************************************ISRAT
		 public void click_on_my_account () {
		    	my_account_button.click();
		    }
		
		
		public void insert_valid_data_for_login () {
			login_field.click();
			email_field.click();
			email_field.sendKeys("teamaqa35@gmail.com");
			password_field.click();
			password_field.sendKeys("teamA1234@");
	
		}
		public void log_in_to_the_account() {
			click_on_loginbutton.click();
  
		}
          public void click_on_wishlist_option () {
        	  wishlist_button.click();
	 
          }
          public void add_product_to_shopping_cart () {
        	  add_tocart.click();
        	  
        	  
          }
		public void click_on_the_icon(String shoppingcart) {
			shoppingcart_icon.click();
      	  remove_item_from_cart.click();

		    
		}

		public void Verify_items_displayed_in_the_cart() {
			String actualtitle=driver.getTitle();
		    String expectedtitle="Shopping Cart";
		    Assert.assertEquals(actualtitle, expectedtitle,"item displayed in shopping cart ");
		    
		    
		}

		public void Verify_the_cart_icon_reflects_the_correct_item_count() {
			String actualtitle=driver.getTitle();
		    String expectedtitle="Shopping Cart";
		    Assert.assertEquals(actualtitle, expectedtitle,"Cart icon reflect the correct item  ");
		    
		}

		public void verify_that_the_user_can_proceed_to_checkout_from_the_cart_page() {
			String actualtitle=driver.getTitle();
		    String expectedtitle="Shopping Cart";
		    Assert.assertEquals(actualtitle, expectedtitle,"User can checkout successfully ");
		    
		}
			
//TC_13 *************************************************************ISRAT
		public void log_in_to_the_account_with_user_information() {
	    	my_account_button.click();
	    	login_field.click();
			email_field.click();
			email_field.sendKeys("teamaqa35@gmail.com");
			password_field.click();
			password_field.sendKeys("teamA1234@");
			click_on_loginbutton.click();

	   
		}
		public void click_add_to_cart () {
		   navigate_wishlist.click();
           wishlist_button.click();
           add_tocart.click();

				
			}

		public void click_on_icon(String shopping_carticon) {
			shoppingcart_icon.click();
      	  view_cart_button.click();

			

    	
		}
        public void click_remove_item_from_cart () {
        	  //remove_item_from_cart.click();
        	 input_quantity.clear();
  			input_quantity.sendKeys("1");
        	  update_quantity.click();
        	
        }
		public void click_on_the_button(String proceed_checkout_button) {
			//checkout_button.click();
			String actualtitle=driver.getTitle();
		    String expectedtitle="Shopping Cart";
		    Assert.assertEquals(actualtitle, expectedtitle ,"Item out of stock  ");
		    
		    
		}

		public void ensure_that_the_checkout_page_displays_billing_and_shipping_options() {
			String actualtitle=driver.getTitle();
		    String expectedtitle="Shopping Cart";
		    Assert.assertEquals(actualtitle, expectedtitle ,"checkout page does not display shipping and billing ");
		    
		}

		public void check_if_the_user_can_enter_billing_and_shipping_information() {
			String actualtitle=driver.getTitle();
		    String expectedtitle="Shopping Cart";
		    Assert.assertEquals(actualtitle, expectedtitle ,"User are not able to enter their information  ");
		    
		    
		}

		public void verify_the_button_is_visible_and_functional(String complete_purchase_button) {
			String actualtitle=driver.getTitle();
		    String expectedtitle="Shopping Cart";
		    Assert.assertEquals(actualtitle, expectedtitle ,"coplete purchase button isnt visible and functional ");
		    
			
		    

		
		}


		    
}
