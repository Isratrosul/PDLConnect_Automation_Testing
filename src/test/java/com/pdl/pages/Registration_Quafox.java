package com.pdl.pages;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.pdl.utilities.CommonMethods;
import com.pdl.utilities.Driver;

public class Registration_Quafox extends CommonMethods{
	
	WebDriver driver=Driver.getDriver();
	
// LOCATOR   
	 @FindBy(xpath = "/html/body")
	    private WebElement regform;
	 
    @FindBy(xpath = "//*[@id=\"input-firstname\"]")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement emailField;

    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement passwordField;
    

    @FindBy(xpath = "//*[@id=\"input-confirm\"]")
    private WebElement confirmpasswordField;

    @FindBy(xpath = "//*[@id=\"input-telephone\"]") 
    private WebElement telephonenymberfield;
     
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]") 
    private WebElement privacypolicybtn;
    
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/a") 
    private WebElement continueBtn;

    @FindBy(css = "//*[@id=\"account\"]/div[5]/div/div") 
    private WebElement errorMessage;
    
  //Tc_02.......
    @FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
    private WebElement userLink;
    @FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
    private WebElement redirect_link;
    
    
   //Tc_03........
    
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/a")
    private WebElement createact;//
    
    
    // Reyazul 
    //TC-30 
    
    @FindBy(xpath = "/html/body/div[2]/div/div/h1")
    private WebElement Registation;
    
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[1]")
    private WebElement Login;
    
    @FindBy (xpath = "/html/body/div[2]/div/div/div/div[1]/div/a")
    private WebElement New_Customer;
     
    
    @FindBy (xpath = "/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input")
    private WebElement First_Name ;
    
    @FindBy (xpath = "/html/body/div[2]/div/div/form/fieldset[1]/div[3]/div/input")
    private WebElement Last_Name;
    
    @FindBy (xpath = "/html/body/div[2]/div/div/form/fieldset[1]/div[4]/div/input")
    private WebElement Email;
    
    @FindBy (xpath = "/html/body/div[2]/div/div/form/fieldset[1]/div[5]/div/input")
    private WebElement Telephone;
    
    @FindBy (xpath = "/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input")
    private WebElement Password;
    @FindBy (xpath = "/html/body/div[2]/div/div/form/fieldset[2]/div[2]/div/input")
    private WebElement  Password_Confirm;
    
    @FindBy (xpath = " /html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]")
    private WebElement  Newsletter;
   
    @FindBy (xpath = " /html/body/div[2]/div/div/form/div/div/input[1]")
    private WebElement Policy ;
    
    @FindBy (xpath = "/html/body/div[2]/div/div/form/div/div/input[2]")
    private WebElement Continue;
  
    @FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input")
    private WebElement login_email;
    @FindBy (xpath = "/html/body/div[2]/div/div/div/div[2]/div/form/div[2]/input")
    private WebElement login_password;
 
	//PAGE FACTORY CONSTRUCTOR.......
	public Registration_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
    
// TC_01

	public void  isRegistrationFormDisplayed() {
		regform.click();	
    }

	
  
    
    //TC-30
    public void Registration_Process () {
    	
		String actualtitle=driver.getTitle();
		String expectedtitle="Register Account";
		Assert.assertEquals(actualtitle, expectedtitle, "Registration Process");
		
	}
    
    public void login() {
    	Login.click();
    }
    public void new_customer () {
    	New_Customer.click();
    }
    public void first_Name() {
    	First_Name.click();
    	First_Name.sendKeys("Reyazul");
    }
    public void last_name () {
    	Last_Name.click();
    	Last_Name.sendKeys("Islam");
    }
    public void email() {
    	Email.click();
    	Email.sendKeys("teamaqa35@gmai.com");
    }
    public void telephone() {
    	Telephone.click();
    	Telephone.sendKeys("3473447765");
    	
    }
    public void password () {
    	Password.click();
    	Password.sendKeys("teamA1234@");
    }
    public void confirm_password() {
    	Password_Confirm.click();
    	Password_Confirm.sendKeys("teamA1234@");
    }
    public void newsletter() {
    	Newsletter.click();
    }
    
    public void policy() {
    	Policy.click();
    }
    public void ccontinue() {
    	Continue.click();
    }
    
    public void Login_email () {
    	login_email.click();
    	login_email.sendKeys("teamaqa35@gmail.com");
    }
    public void Login_password() {
    	login_password.click();
    	login_password.sendKeys("teamA1234@");
    }
    

  /* public void Verify_user_link_direct_them_to_log_in_page () {
	  String actualtitle=driver.getTitle();
		String expectedtitle="Register Account";
		Assert.assertEquals(actualtitle, expectedtitle, " Verify user is on log in  page");
	}
	 
/*  // TC_02 *************************************************************

  public void create_account_button (String createacount) {
	  createact.click();
	  String actualtitle=driver.getTitle();
	  String expectedtitle="Account button is visible and blue  ";
	  Assert.assertEquals(actualtitle, expectedtitle, "Title does not match the expected value.");
	  
	  
  }
  public boolean isUserLinkVisible() {
      return userLink.isDisplayed();
      
  }
*/
  
  // Method to click on user link
    public void clickUserLink() {
      userLink.click();
  }
    public void redirect_user_to_link () {
    	redirect_link.click();
    }
	
	
    
}
