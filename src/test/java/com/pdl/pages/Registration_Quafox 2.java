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
    
    @FindBy(css = "#content > form > div > div > input.btn.btn-primary") 
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
    


	//PAGE FACTORY CONSTRUCTOR.......
	public Registration_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
    
// TC_01

	public void  isRegistrationFormDisplayed() {
		regform.click();	
    }

    public void enterFirstName(String firstName) {
        firstNameField.clear();
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    
    public void confirmpassword (String confirmpassword  ) {
		confirmpasswordField.sendKeys(confirmpassword);
    		
    }
    public void telephonenumber (String phonenumber ) {
    	telephonenymberfield.sendKeys(phonenumber);
    		
    }
    public void click_on_privacy_policy () {
    	privacypolicybtn.click();
    }
    
    public void clickcontinueButton() {
    	continueBtn.click();
    }

    public boolean isErrorMessageDisplayed() {
        return errorMessage.isDisplayed();
    }
  public void Verify_user_link_direct_them_to_log_in_page () {
	  String actualtitle=driver.getTitle();
		String expectedtitle="Register Account";
		Assert.assertEquals(actualtitle, expectedtitle, " Verify user is on log in  page");
	}
	 
  // TC_02 *************************************************************

  public void create_account_button (String createacount) {
	  createact.click();
	  String actualtitle=driver.getTitle();
	  String expectedtitle="Account button is visible and blue  ";
	  Assert.assertEquals(actualtitle, expectedtitle, "Title does not match the expected value.");
	  
	  
  }
  public boolean isUserLinkVisible() {
      return userLink.isDisplayed();
      
  }

  // Method to click on user link
    public void clickUserLink() {
      userLink.click();
  }
    public void redirect_user_to_link () {
    	redirect_link.click();
    }
		
	
	
  
    
	


}
