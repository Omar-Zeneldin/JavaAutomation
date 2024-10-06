package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Register_HappyScenrio extends TestBase{
	HomePage homeObject;
	RegisterPage registerObject;
	
	public void initilizeObjects() {
		homeObject = new HomePage(driver);
		registerObject = new RegisterPage(driver);
	}
	
  @Test (priority = 1)
  public void UserRegister_newUsername() throws InterruptedException {
	  initilizeObjects();
	  
	  homeObject.openRegisterationPage();
	  
	  Thread.sleep(3000);
	  
	  Assert.assertEquals(registerObject.newUserSignUpMessage.getText(),"New User Signup!");
	  registerObject.newUserSignUp("Abdelrahman Osama", "abdelrahmanosama10@gmail.com");
	  
	  Thread.sleep(2000);
	  
	  Assert.assertEquals(registerObject.EnterAccountInformationMessage.getText(), "ENTER ACCOUNT INFORMATION");
	  
	  registerObject.userCanRegister("12345678","1","8","1999","Abdelrahman","Osama","Itworx","Elfostat City","Elgiza","Canada","Newyork","aaa","765212","01013440554");
	  Thread.sleep(3000);
	  Assert.assertTrue(registerObject.successMessage.getText().equalsIgnoreCase("Account Created!")); 
	  
	  registerObject.continueAccount();
 
	  Assert.assertEquals(registerObject.navBarList.get(9).getText(), "Logged in as Abdelrahman Osama");
	  Thread.sleep(2000);
	  
	  registerObject.deleteAccount();
	  Thread.sleep(2000);
	  
	  Assert.assertEquals(registerObject.deleteAccountMessage.getText(), "ACCOUNT DELETED!");
  }
  
  
  
}

