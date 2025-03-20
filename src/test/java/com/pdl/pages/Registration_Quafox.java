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
    
    //Tc_14 .......
    @FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
    private WebElement navigate_to__the_registration_page;
    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
    private WebElement yesbutton;//
    
    
    
    //Tc_15 .......
    @FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
    private WebElement navigate_to_home_page;
    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/legend")
    private WebElement newsletterpage;//
    
    
    //Tc_17.......
    @FindBy(xpath = "//*[@id=\"logo\"]/h1/a")
    private WebElement navigate_to_login_page;
    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[1]")
    private WebElement loginpage;//
    
    //Tc_18.......
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[2]")
    private WebElement register_option;
   
    //Tc_19
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[3]")
    private WebElement ForgottenPassword;//
    
    //Tc_20
    @FindBy(xpath = "//*[@id=\"column-right\"]/div/a[4]")
    private WebElement MyAccount;//
    
    //TC_21
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[5]")
    private WebElement AdressBook;//
    
    //TC_22
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[6]")
    private WebElement WishList;//
  
    //TC_23
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[7]")
    private WebElement OrderHistory;//
    
    //TC_24
    @FindBy(xpath = "/html/body/div[2]/div/aside/div/a[8]")
    private WebElement Downloads;//
   
    
    
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
    
	
	 // Tc-14 **********

    public void navigate_to_the_registration_page(String  website ) {
    //	yesbutton.clear();
    }
    
    public void navigate_the_registration_page(String  website ) {
    yesbutton.click();
    	
    }
    public void scroll_down_to_the_newsletter_subscription(String  website ) {
    	yesbutton.click();
    }
    	
  
     public void select_yes_option(String  website ) {
    	yesbutton.click();
    }
   // Tc-15**********
    public void navigate_to__registration_page(String  website ) {
    navigate_to_home_page.click();
    }
    public void scroll_down_to__registration_page(String  website ) {
        navigate_to_home_page.click();
        }
    
    

    //Tc_16 .......
   public void verify_user_is_on_quick_access_panel() {
	String actualtitle=driver.getTitle();
	String	expectedtitle="Register Account";
	Assert.assertEquals(actualtitle,expectedtitle,"verify user is on quick access panel");
	
	
   }
   public void check_quick_access_panel_remain_visible() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"check quick access panel rmain visible");
   }
		
   public void confirm_quick_access_panel_remain_visible_after_refresh() {
 		String actualtitle=driver.getTitle();
 		String	expectedtitle="Register Account";
 		Assert.assertEquals(actualtitle,expectedtitle,"confirm quick access panel rmain visible after refresh");
   }
	
   public void ensure_quick_access_panel_remain_visible_when_scrolling_down() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"ensure quick access panel rmain visible when scrolling down");   
   
   } 
   public void verify_quick_access_panel_remain_visible() {
 		String actualtitle=driver.getTitle();
 		String	expectedtitle="Register Account";
 		Assert.assertEquals(actualtitle,expectedtitle,"verify quick access panel rmain visible");
 		
} 
   //Tc_17 ________________
   public void navigate_to_log_in_page() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"navigate to log in page");
		
   } 
   public void verify_the_login_option_is_visible() {
 		String actualtitle=driver.getTitle();
 		String	expectedtitle="Register Account";
 		Assert.assertEquals(actualtitle,expectedtitle,"verify the ;login option is visible");
 		
}   	
   public void check_user_redirected_to__the_login_option_page() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"check user is redirected to log in page");
		
} 
	
   public void check_when_user_redirected_to__the_login_option_page() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"check when  user is redirected to log in page");
		
	
}   
   public void verify_login_page_loads_properly() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify login page loads properly");
}
   public void verify_user_able_to_enter_necessary_field() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify user able to enter necessary field");
}
   //Tc_18 ________
   public void verify_the_aregister_option_is_visible() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify the register option is visible");
   }
   public void user_click_on_the_register_option_() {
	    register_option.click();
   }
   public void verify_user_is_redirected_to_the_register_page_() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify user is redirected to the register page ");
  }	
   public void the_user_is_redirected_to_the_register_page_() {
 		String actualtitle=driver.getTitle();
 		String	expectedtitle="Register Account";
 		Assert.assertEquals(actualtitle,expectedtitle,"the user is redirected to the register page ");
   }
   public void check_the_register_page_loads_properly() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"check the register page loads properly");
		}	
   public void the_user_is_on_register_page() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"the user is on register page ");
		}
   public void verify_the_user_is_able_to_enter_necessary_field() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify the user is able to enter necessary field");
		}	
   //Tc_19___________________
 
   public void verify_the_user_is_redirected__to_the_password_recovery_page() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify the user is redirected to the password recovery page ");
}
   public void the_user_is_on__the_page_with_forgotten_password_option() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"the user is on the page with forgotten password option ");
}
   public void verify__the_the_forgotten_password_is_clickble() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify the forgotten password is clickble ");
}
   public void user_clicks_on_the_forgotten_password() {
		ForgottenPassword.click();
   }
		
		
   public void verify_the_password_recovery_option_loads_properly() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Forgot Your Password?";
		Assert.assertEquals(actualtitle,expectedtitle,"verify the password recovery option loads properly");
}
   public void user_is_on_the_password_recovery_page() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Forgot Your Password?";
		Assert.assertEquals(actualtitle,expectedtitle,"user is on the password recovery page");
}
   public void verify_user_is_able_to_enter_valid_email_address() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Forgot Your Password?";
		Assert.assertEquals(actualtitle,expectedtitle,"verify user is able to enter valid email address");
}
   //Tc 20_______________________
   public void verify_my_account_option_is_visible() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify My accont option is visible");
   }
   public void clickMyAccount() {
	  // MyAccount.click();
   }
   public void verify_user_is_redirected_to_user_account() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify user is redirected to My accont ");
  }
   public void the_user_is_on_the_page_with_my_account_option() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"the user is on the page with My accont option");
} 
   public void ClickMyAccountOption() {
	  // MyAccount.click();
   }
   public void UserClickMyAccountOption() {
	//   MyAccount.click();
}
   public void verify_the_account_page_loads_properly() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify the account page loads properly");
   }
   //Tc 21_______________________
   public void user_click_on_the_address_book_option() {
	//   AdressBook.click();
   }
   public void the_user_is_redirected_to_the_address_book_page() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"the user is redirected to the address book page");
} 
   public void verify_user_is_on_the_page_with_address_book_option() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify user is on the page with address book option");
} 
   public void clickAdressBook() {
	   AdressBook.click();
   }
   public void the_user_clicks_on_the_address_book_option() {
	   AdressBook.click();
   }

   public void Verify_that_the_address_book_page_loads_properly() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Account Login";
		Assert.assertEquals(actualtitle,expectedtitle,"verify that the address book page loads properly");
} 
   //Tc_22_______________________
   public void user_click_on_the_wish_list_option() {
		//   WishList.click();
	   }
   public void the_user_is_redirected_to_the_wish_list_option() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"the user is redirected to the order history option ");
}
   public void verify_user_is_on_the_page_with_wish_list_option() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Register Account";
		Assert.assertEquals(actualtitle,expectedtitle,"verify user is on the page with wish list option");
} 
   public void WishList() {
	  WishList.click();
   }
   public void the_user_clicks_on_the_wish_list_option() {
	   WishList.click();
   }

   public void Verify_that_the_wish_list_page_loads_properly() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Account Login";
		Assert.assertEquals(actualtitle,expectedtitle,"verify that the wish list page loads properly");
}  
   
 //Tc_23_______________________
   public void user_click_on_the_order_history_option() {
		   OrderHistory.click();
	   }
   public void the_user_is_redirected_to_the_order_history_option() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Account Login";
		Assert.assertEquals(actualtitle,expectedtitle,"the user is redirected to the order history option ");
}
   public void verify_user_is_on_the_page_with_order_history_option() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Account Login";
		Assert.assertEquals(actualtitle,expectedtitle,"verify user is on the page with order history option");
} 
   public void OrderHistory() {
	  OrderHistory.click();
   }
   public void the_user_clicks_on_the_order_history_option() {
	   OrderHistory.click();
   }

   public void Verify_that_the_order_history_page_loads_properly() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Account Login";
		Assert.assertEquals(actualtitle,expectedtitle,"verify that the order history page loads properly");
} 
   
   //Tc_24______________________
   public void user_click_on_the_downloads_option() {
		   Downloads.click();
	   }
   public void the_user_is_redirected_to_the_downloads_option() {         
		String actualtitle=driver.getTitle();
		String	expectedtitle="Account Login";
		Assert.assertEquals(actualtitle,expectedtitle,"the user is redirected to the downloads option ");
}
   public void verify_user_is_on_the_page_with_downloads_option() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Account Login";
		Assert.assertEquals(actualtitle,expectedtitle,"verify user is on the page with downloads option");
} 
   public void downloads() {
	  Downloads.click();
   }
   public void the_user_clicks_on_the_downloads_option() {
	   Downloads.click();
   }

   public void Verify_that_the_downloads_page_loads_properly() {
		String actualtitle=driver.getTitle();
		String	expectedtitle="Account Login";
		Assert.assertEquals(actualtitle,expectedtitle,"verify that the downloads page loads properly");
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

	public void create_account_button(String create_Account) {
		// TODO Auto-generated method stub
		
	}

	public void isUserLinkVisible() {
		// TODO Auto-generated method stub
		
	}

	public void Verify_user_link_direct_them_to_log_in_page() {
		// TODO Auto-generated method stub
		
	}

	public void clickcontinueButton() {
		// TODO Auto-generated method stub
		
	}

	public void click_on_privacy_policy() {
		// TODO Auto-generated method stub
		
	}

	public void telephonenumber(String phonenumber) {
		// TODO Auto-generated method stub
		
	}

	public void confirmpassword(String confirmpassword) {
		// TODO Auto-generated method stub
		
	}

	public void enterPassword(String password2) {
		// TODO Auto-generated method stub
		
	}

	public void enterEmail(String email2) {
		// TODO Auto-generated method stub
		
	}

	public void enterLastName(String last_name2) {
		// TODO Auto-generated method stub
		
	}

	public void enterFirstName(String first_name2) {
		// TODO Auto-generated method stub
		
	}
	
	}
    

