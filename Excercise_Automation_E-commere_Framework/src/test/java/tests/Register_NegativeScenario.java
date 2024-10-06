package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Register_NegativeScenario extends TestBase{
	HomePage homeObject;
	RegisterPage registerObject;
	
	public void initilizeObjects() {
		homeObject = new HomePage(driver);
		registerObject = new RegisterPage(driver);
	}
	
  
  
  @Test (priority = 2)
  public void UserRegister_existUsername() throws InterruptedException {
	  initilizeObjects();
	  
	  Thread.sleep(2000);
	  homeObject.openRegisterationPage();
	  Thread.sleep(2000);
	  registerObject.newUserSignUp("Abdelrahman Osama", "abdelrahmanosama10@gmail.com");
	  Thread.sleep(2000);
	  Assert.assertEquals(registerObject.failedMessage.getText(),"Email Address already exist!");
  }
  
}

