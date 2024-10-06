package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class Login_NegativeScenario extends TestBase{
	HomePage homeObject;
	LoginPage loginObject; 
	RegisterPage registerObject;
	
	public void initializeObjects() {
		homeObject = new HomePage(driver);
		loginObject = new LoginPage(driver);
		registerObject = new RegisterPage(driver);
	}
  
  @Test(priority = 2)
  public void Login_InCorrectUsernameAndPassword() throws InterruptedException {
	  initializeObjects();
	  
	  homeObject.openLoginPage();
	  Thread.sleep(2000);
	  Assert.assertEquals(loginObject.loginMessage.getText(), "Login to your account");
	  	
	  loginObject.userCanLogin("abdelrahmanosama15@gmail.com", "12345678");
	  Thread.sleep(2000);
	  Assert.assertEquals(loginObject.failedMessage.getText(), "Your email or password is incorrect!");
	  
	  
  }
}
