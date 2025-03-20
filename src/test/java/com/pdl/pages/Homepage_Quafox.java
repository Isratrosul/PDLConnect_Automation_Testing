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
    
    @FindBy(xpath = " /html/body/div[2]/div/div/h1")
    private WebElement searchfunctionality;
    
    @FindBy(xpath = " /html/body/div[2]/div/div/div/div[1]/input")
    private WebElement search_box;

    @FindBy(xpath = " /html/body/div[2]/div/div/input")
    private WebElement search;
    
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[1]")
    private WebElement Login;
    
    @FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")
    private WebElement login_password;
    
    @FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")
    private WebElement login_email;
     @FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/input")
     private WebElement final_login;
     
     @FindBy (xpath ="/html/body/div[2]/div/div/div/div[2]/select")
     private WebElement Allcatagorie;
     @FindBy (xpath ="/html/body/div[2]/div/div/div/div[2]/select/option[5]")
     private WebElement Laptop;
    	 
    
    
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

    


//TC_34
	 public void Login_email () {
	    	login_email.click();
	    	login_email.sendKeys("teamaqa35@gmail.com");
	    }
	    public void Login_password() {
	    	login_password.click();
	    	login_password.sendKeys("teamA1234@");
	    }
	    public void Final_login() {
	    	final_login.click();
	    }
	    public void allcatagorie () {
	    	Allcatagorie.click();
	    }
	    public void laptop () {
	    	Laptop.click();
	    }
	    
	  public void searchfunctionality () {
	    	
			String actualtitle=driver.getTitle();
			String expectedtitle="Search";
			Assert.assertEquals(actualtitle, expectedtitle, " verify Search");
			
		}
	  public void Search_box() {
		  search_box.click();
		  search_box.sendKeys("Laptop");
		  
	  }
	  public void Search () {
		  search.click();
	  }
	public void loginfor() {
		Login.click();
		
		
	}

}