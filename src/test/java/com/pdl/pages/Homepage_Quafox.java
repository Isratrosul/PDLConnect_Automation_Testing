package com.pdl.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

//import com.pdl.step_definitions.Actions;
import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import junit.framework.Assert;



public class Homepage_Quafox extends CommonMethods{
	 WebDriver driver=Driver.getDriver();
	
	public Homepage_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Register']")		
	public WebElement RegisterAccount ;
	@FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
	private WebElement redirect_link;
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]")
	private WebElement statictopmenu;
	@FindBy(xpath = "	//*[@id=\"menu\"]/div[2]/ul/li[1]/a")
	private WebElement Locateoptioninstatictopmenu;
	
	@FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[1]/a")
	private WebElement desktop;
	
	
	@FindBy(xpath = "//*[@id=\"column-left\"]/div[1]/a[10]")
	private WebElement productname;
	
	@FindBy(css = "#content > div:nth-child(3) > div > div > div:nth-child(2) > div.caption > p.price")
	private WebElement productprice;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[1]/a")
	private WebElement productdescription;
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]\r\n")
	private WebElement Menu;
	@FindBy(xpath = "/html/body/div[2]/div/aside/div[1]/a[7]")
	private WebElement Filter;
	@FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[7]/a")
	private WebElement productreleventtocatagories ;
	@FindBy(xpath = "/html/body/div[1]/nav/div[2]/ul/li[1]/div/a\r\n")
	private WebElement catagory_related_product ;
	@FindBy(xpath = "/html/body/header/div/div/div[2]/div/input\r\n")
	private WebElement search_box ;
	@FindBy(xpath = "/html/body/header/div/div/div[2]/div/span/button")
	private WebElement search_button ;
	@FindBy(xpath = "/html/body/div[1]/nav/div[2]\r\n")
	private WebElement Static_header ;
	
	//TC_08*****************************************************
	@FindBy(xpath = "/html/body/nav/div/div[1]/form/div/button\r\n")
	private WebElement currency ;
	@FindBy(xpath = "	/html/body/nav/div/div[1]/form/div/button\r\n")
	private WebElement currency_dropdown;
	@FindBy(xpath = "/html/body/nav/div/div[1]/form/div/ul/li[2]/button\r\n")
	private WebElement select_currency;
	@FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[1]/p[2]\r\n")
	private WebElement price_list;
	
	
	
	
	

	
	

	
	
	public void Verify__user_on_Homepage (String website ) {
		String actualtitle=driver.getTitle();
		String expectedtitle="Your Store";
		Assert.assertEquals(actualtitle, expectedtitle, " Verify user is on home");
	}
	
	public  void Register_an_account () {
		RegisterAccount.click();
	}
	public void Link_redirect_the_user_to_the_registration_web_page () {
		redirect_link.click();
	}
	public void The_static_top_menu_is_visible_and_accessible (String website) {
		statictopmenu.click();
		
	}
	public void Locate_and_click_on_the_option_in_the_static_top_menu (String productcatalog ) {
		Locateoptioninstatictopmenu.click();
		
	}
	public void static_top_menu_its_responsive_and_usable_on_desktop_and_mobile_devices () {
		statictopmenu.click();		
	}
	public void Verify_menu_option_page_loads_successfully (String Menu_option ) {
		String actualtitle=driver.getTitle();
		String expectedtitle="Phones & PDAs";
		Assert.assertEquals(actualtitle, expectedtitle, " Verify menu option page visible ");
	}
	
	//TC_05***********************************************************************************
	
	public void The_product_catalog_option_is_visible_and_labeled_correctly (String product_catalog) {
		statictopmenu.click();
		//String actualtitle=driver.getTitle();
		//String expectedtitle="Product catalog";
		//Assert.assertEquals(actualtitle, expectedtitle, " Verify Product catalog option is visible ");
		
	}
	
	public void click_on_the_static_top_menu_of_product_catalog () {
		Locateoptioninstatictopmenu.click();
	}
	public void verify_the_product_catalog_page_loads_successfully () {
	      String actualtitle=driver.getTitle();
	      String expectedtitle="Phones & PDAs";
	      Assert.assertEquals(actualtitle, expectedtitle, " Verify Product catalog page loads successfully");	
	}
	public void  verify_the_product_catalog_button_navigate_users_to_the_product_catalog_page_directly () {
		
		String actualtitle=driver.getTitle();
	      String expectedtitle="product catalog";
	      Assert.assertEquals(actualtitle, expectedtitle, " Verify Product catalog page redirect users tp the product page  successfully");
	      
		
		
	}
	
	//Tc_05*******************************************************************************************************
	public void Verify__user_on_Homepage () {
		String actualtitle=driver.getTitle();
		String expectedtitle="Register Account";
		Assert.assertEquals(actualtitle, expectedtitle, " Verify user is on home");
	}
	 public void click_on_the_product_catalog_option_in_the_static_top_menu () {
		 Locateoptioninstatictopmenu.click();
		 desktop.click();
		 
	 }
	  public void accurate_product_details_includes (String name, String price, String description)   {
		  Locateoptioninstatictopmenu.click();
		  //productname.click();
		  //productprice.click();
		  //productdescription.click();
		  String actualtitle=driver.getTitle();
	      String expectedtitle="Register Account";
	      Assert.assertEquals(actualtitle, expectedtitle, " Verify Product details displays successfully");	

		  
	  }
	  public void catalog_is_organized_with_appropriate_categories () {
		  Menu.click();
		  String actualtitle=driver.getTitle();
	      String expectedtitle="Phones & PDAs";
	      Assert.assertEquals(actualtitle, expectedtitle, " Verify atalog_is_organized_with_appropriate_categories");	

		  
	  }
	  public void filters_are_available_and_functional () {
		  Filter.click();
		  
	  }
	  public void click_on_the_categories () {
		  productreleventtocatagories.click();
		  
	  }
	  public void category_displays_only_the_relevant_products () {
		  String actualtitle=driver.getTitle();
	      String expectedtitle="Canon EOS 5D";
	      Assert.assertEquals(actualtitle, expectedtitle, " Verify catagory displays relevent products");	

		  }
	  public void Applying_filter_displays_only_the_products_matching_the_selected_criteria () {
		  desktop.click();
		  catagory_related_product.click();
		  String actualtitle=driver.getTitle();
	      String expectedtitle="Desktops";
	      Assert.assertEquals(actualtitle, expectedtitle, " Verify catagory displays relevent products");	
		  
	  }
	  public void Navigate_to_product_catagories () {
		 productreleventtocatagories.click();
		 }
	  public void apply_Filter () {
		  Filter.click();
		  
	  }
	  public void search_product_from_search_box (String productname) {
		  search_box.click();
		  search_box.sendKeys(productname);
		    
	  }
	  public void search_button_for_product_search () {
		  search_button.click();
		  
	  }
	  public void navigates_back_and_forth_between_categories_ilters_and_search_results () {
		  Assert.assertTrue(productreleventtocatagories.isDisplayed(), "product is displayed");
		  driver.navigate().forward();
		  driver.navigate().back();
		 
	 }
	  
	  public void navigation_should_be_smooth_without_errors_or_glitches () {
		  redirect_link.click();
		  driver.getPageSource();
		  driver.navigate().forward();
		  driver.navigate().back();
          Assert.assertTrue(redirect_link.isDisplayed(),"navigation is smoother and glitch free");		  
	  }
	  
	  
	 // TC_07*****************************************************************************************
		public void navigate_to_registration_page(String string, String string2) {
			 RegisterAccount.click();	    
		}

		public void scroll_down_the_page_and_static_header_remains_visible_at_the_top() {
			String actualtitle=driver.getTitle();
		      String expectedtitle="Register Account";
		      Assert.assertEquals(actualtitle, expectedtitle, " Verify static header remain visible at the top after scrolling down ");
		}

		public void header_is_present_on_the_homepage_and_other_pages() {
			Static_header.click();
		      driver.navigate().forward();
			String actualtitle=driver.getTitle();
		      String expectedtitle="Phones & PDAs";
		      Assert.assertEquals(actualtitle, expectedtitle, " Verify static header present in the homepage and other pages  ");
		      //driver.navigate().forward();
			  driver.navigate().back();
		}
			

		public void the_header_does_not_disappear_when_scrolling_down_the_page() {
			String actualtitle=driver.getTitle();
		      String expectedtitle="Register Account";
		      Assert.assertEquals(actualtitle, expectedtitle, " Verify static header doesnot diddepear when scrolling down ");
			
			
		}
		
	//TC_08*************************************************************************************************
		
			
		public void locate_currency_selector_dropdown_in_the_header() {
			currency.click();
			String actualtitle=driver.getTitle();
		      String expectedtitle="Register Account";
		      Assert.assertEquals(actualtitle, expectedtitle, " Verify currency option visible in currency option ");    
		}

		public void click_currency_dropdown_to_view_available_options() {
			currency_dropdown.click();
		   
		}

		public void select_a_different_currency (String string) {
			currency_dropdown.click();
			String actualtitle=driver.getTitle();
		      String expectedtitle="Register Account";
		      Assert.assertEquals(actualtitle, expectedtitle, " Verify currency option displays different currency ");  
		}

		public void  verify_product_prices_are_updated_to_reflect_the_selected_currency () {
			desktop.click();
			currency.click();
			currency_dropdown.click();
			select_currency.click();
			String actualtitle=driver.getTitle();
		    String expectedtitle="Register Account";
		     Assert.assertEquals(actualtitle, expectedtitle, " Verify changing currency option reflect on product price  ");  
		    
		}

		public void verify_page_reloads_or_updates_the_content_without_errors_after_selecting_the_currency () {
			price_list.click();
			
		    String actualPriceText = price_list.getText();
		    String expectedPriceText = "£" + "74.73"; 
		    Assert.assertEquals(actualPriceText, expectedPriceText, "The product price did  update correctly after currency change.");
    
		}

}