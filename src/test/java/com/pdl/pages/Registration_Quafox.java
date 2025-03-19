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
	 
    @FindBy(xpath = "/html/body/div[2]/div/div/form/fieldset[1]/div[2]/div/input")
    private WebElement firstNameField;

    @FindBy(xpath = "//*[@id=\"input-lastname\"]")
    private WebElement lastNameField;

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/fieldset[2]/div[1]/div/input")
    private WebElement passwordField;
    

    @FindBy(xpath = "//*[@id=\"input-confirm\"]")
    private WebElement confirmpasswordField;

    @FindBy(xpath = "//*[@id=\"input-telephone\"]") 
    private WebElement telephonenymberfield;
     
    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]") 
    private WebElement privacypolicybtn;
    
    @FindBy(css = "#content > form > div > div > input.btn.btn-primary") 
    private WebElement continueBtn;

    @FindBy(css = "//*[@id=\"account-register\"]/div[1]") 
    private WebElement errorMessage;
    @FindBy(css ="/html/body/div[2]/div/div/div/div/a") 
    private WebElement reg_com_con_btn;
    
    
    
  //Tc_02.......
    @FindBy(xpath = "/html/body/header/div/div/div[1]/div/h1/a")
    private WebElement userLink;
   
    @FindBy(xpath = "/html/body/header/div/div/div[1]/div/h1/a")
                     
    private WebElement redirect_link;
    
    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div")
    private WebElement invalidentryerrormsg;
    @FindBy(css = "#content > form > div > div > input.btn.btn-primary") 
    private WebElement continuebtn;
    @FindBy(css = "//*[@id=\"account-register\"]/div[1]") 
    private WebElement errormsg;
      
    
    
    
   //Tc_03........
    @FindBy(xpath = "/html/body/nav/div/div[2]/ul/li[2]")
	 private WebElement my_account_button;
    @FindBy(xpath = "    /html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a\r\n")
	 private WebElement registeroption;
    
    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement emailformatvalidate ;
    @FindBy(xpath = "//*[@id=\"account\"]/div[4]/div/div]")
    private WebElement invalisemail ;
    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[1]/div/div")
    private WebElement invalidpassword ;
    @FindBy(xpath = "  //*[@id=\"account-register\"]/div[1]\r\n")
    private WebElement duplicateemail ;
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[5]\r\n")
    private WebElement element_require_login ;
    
    

    		
  
  

	

	//PAGE FACTORY CONSTRUCTOR.......
	public Registration_Quafox() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
    
	
// TC_01**********************************************************

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
		String expectedtitle="Your Account Has Been Created!";
		Assert.assertEquals(actualtitle, expectedtitle, " Verify user is on log in  page");
		//reg_com_con_btn.click();
	}
	 
  // TC_02 *************************************************************

  
  public void isUserLinkVisible_and_clickable () {
	  userLink.click();
  
      
  }
 
    public void redirect_user_to_link () {
    	String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	Assert.assertEquals(actualtitle, expectedtitle, "User are redirect to the link without any issue ");
    	
    }
    
    
    public void input_valid_credential () {
      //userLink.click();
  	  firstNameField.clear();
  	  firstNameField.click();
  	  firstNameField.sendKeys("Team");
  	  lastNameField.clear();
  	  lastNameField.click();
  	  lastNameField.sendKeys("qa");
  	  emailField.clear();
      emailField.sendKeys("teamAqa@gmail.com");
      passwordField.clear();
      passwordField.sendKeys("1234");
  	  confirmpasswordField.click();
  	  confirmpasswordField.sendKeys("1234");
      telephonenymberfield.sendKeys("4438832669");
   	  privacypolicybtn.click();
  	  continueBtn.click();
  	  
    }
    
    
	public void error_message_for_invalid_entry () {
		//invalidentryerrormsg.click();
		String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	Assert.assertTrue(isErrorMessageDisplayed(), expectedtitle);
    			
	}
	 public void submitEmptyForm() {
		continuebtn.click(); 
	 }
	
	    public void isValidationErrorDisplayed() {
	    	String actualtitle=driver.getTitle();
	    	String expectedtitle="Warning: You must agree to the Privacy Policy!";
	    	Assert.assertEquals(actualtitle, expectedtitle, "The reg form should dispaly an error ");
	       
	    }
   
       public void enter_invalid_email () {
    	   firstNameField.click();
    	   firstNameField.sendKeys();
    	   lastNameField.click();
    	   lastNameField.sendKeys();
    	   emailField.click();
    	   emailField.clear();
           emailField.sendKeys();
           telephonenymberfield.click();
           telephonenymberfield.sendKeys();
       }
       public void email_error_msg () {
    	   errormsg.click();
    	   
       }
    public void enter_invalid_password () {
    	passwordField.sendKeys();
    	confirmpasswordField.click();
    	confirmpasswordField.sendKeys();
    	
    }
    
    //TC_03....****************
    
    public void verify_user_on_registration_page () {
    	 String actualtitle=driver.getTitle();
     	  String expectedtitle="Register Acount" ;
     	  Assert.assertEquals(actualtitle, expectedtitle, "Title does not match the expected value.");
    	
    }
   public void click_on_registrationz_link () {
    	userLink.click();
    }
    
    public void  RegistrationFormDisplayed() {
    	my_account_button.click();
    	//userLink.click();	
    }

    public void create_account_button (String createacount) {
  	  String actualtitle=driver.getTitle();
  	  String expectedtitle="Account button is visible and blue  ";
  	  Assert.assertEquals(actualtitle, expectedtitle, "Title does not match the expected value.");
  	  
    }	
    public void proper_email_format_validation () {
    	//emailformatvalidate.click();
    	 String actualtitle=driver.getTitle();
     	  String expectedtitle="Your Store";
     	  Assert.assertEquals(actualtitle, expectedtitle, "Email format validated");
    }
    public void valid_password_that_adheres_to_policy_requirements ( ) {
    	//passwordField.click();
    	String actualtitle=driver.getTitle();
   	  String expectedtitle="Your Store";
   	  Assert.assertEquals(actualtitle, expectedtitle, "Password adhered provacy policy");
    }
    public void password_and_confirm_password_matches (String Password, String ConfirmPassword) {
    	passwordField.click();
    	passwordField.sendKeys(Password);
    	confirmpasswordField.click();
    	confirmpasswordField.sendKeys(ConfirmPassword);
    	
    }
    public void enter_invalid_data () {
    	emailField.click();
    	emailField.sendKeys("user@gmail.com");	
    }
    public void invalid_input_email_rejected () {
    	String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	  Assert.assertEquals(actualtitle, expectedtitle, "E-Mail Address does not appear to be valid!");	
    }
    public void invalid_input_password_rejected () {
    	String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	Assert.assertEquals(actualtitle, expectedtitle, "Password must be between 4 and 20 characters!");	
    }
    public void input_duplicate_email () {
        emailField.click();
        emailField.sendKeys("teamaqa35@gmail.com");
    }
    public void duplicate_email_rejected () {
    	duplicateemail.click();
    }
    public void Validate_form_with_valid_details () {
    	firstNameField.click();
    	firstNameField.sendKeys("Team");
    	lastNameField.clear();
        lastNameField.sendKeys("aqa");
        emailField.clear();
        emailField.sendKeys("teamaqa35@gmail.com");
        passwordField.clear();
        passwordField.sendKeys("teamA1234@");
        confirmpasswordField.click();
		confirmpasswordField.sendKeys("teamA1234@");
		telephonenymberfield.click();
    	telephonenymberfield.sendKeys("4438832669");
    	privacypolicybtn.click();
        continueBtn.click();



        
        
    }
    public void enter_the_correct_otp (String otp) {
    	String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	  Assert.assertEquals(actualtitle, expectedtitle, "otp field is empty");	
        	
    }
    
	public void i_enter_an_incorrect_otp() {
		String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	  Assert.assertEquals(actualtitle, expectedtitle, "otp is invalid");	
		
	}

	public void an_error_message_is_displayed() {
		String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	  Assert.assertEquals(actualtitle, expectedtitle, "otp is invalid ");	
	}
	public void the_otp_expires_after_a_set_time() throws InterruptedException {
		Thread.sleep(1000);
		String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	  Assert.assertEquals(actualtitle, expectedtitle, "otp is expired ");	
		
	}
	public void i_request_to_resend_the_otp() {
		String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	  Assert.assertEquals(actualtitle, expectedtitle, "Request to resend an otp");
		
	}

	public void the_otp_is_resent_successfully() {
		String actualtitle=driver.getTitle();
    	String expectedtitle="Register Account";
    	  Assert.assertEquals(actualtitle, expectedtitle, "Resend otp was not successful");
		
	}
	public void registration_is_successful() {
		userLink.click();
		
	}
	public void enter_all_credential () {
		firstNameField.click();
    	firstNameField.sendKeys("Team");
    	lastNameField.clear();
        lastNameField.sendKeys("aqa");
        emailField.clear();
        emailField.sendKeys("teamaqa35@gmail.com");
        passwordField.clear();
        passwordField.sendKeys("teamA1234@");
        confirmpasswordField.click();
		confirmpasswordField.sendKeys("teamA1234@");
		telephonenymberfield.click();
    	telephonenymberfield.sendKeys("4438832669");
    	privacypolicybtn.click();
        continueBtn.click();	
	}

	public void the_user_is_redirected_to_the_homepage() {
		
	String actualtitle=driver.getTitle();
    String expectedtitle="My Account";
    Assert.assertEquals(actualtitle, expectedtitle, "Verify user are directed to homepage after registration");
		
	}
	

	public void registration_is_unsuccessful() {
		String actualtitle=driver.getTitle();
	    String expectedtitle="My Account";
	    Assert.assertEquals(actualtitle, expectedtitle, " Registration is unsuccessful");
	}

	public void the_user_is_unable_to_access_restricted_pages_without_logging_in() {
		element_require_login.clear();
		
		String actualtitle=driver.getTitle();
	    String expectedtitle="Address Book Entries";
	    Assert.assertEquals(actualtitle, expectedtitle, "unable to access restricted pages without logging_in");
		
	}
	
	
    
}

