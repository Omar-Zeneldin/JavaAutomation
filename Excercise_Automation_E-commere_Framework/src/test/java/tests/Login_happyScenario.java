package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class Login_happyScenario extends TestBase{
	HomePage homeObject;
	LoginPage loginObject; 
	RegisterPage registerObject;
	
	public void initializeObjects() {
		homeObject = new HomePage(driver);
		loginObject = new LoginPage(driver);
		registerObject = new RegisterPage(driver);
	}
  @Test (priority = 1)
  public void Login_CorrectUsernameAndCorrectPassword() throws InterruptedException {
	  initializeObjects();
	  
	  homeObject.openLoginPage();
	  Thread.sleep(2000);
	  Assert.assertEquals(loginObject.loginMessage.getText(), "Login to your account");
	  	
	  loginObject.userCanLogin("abdelrahmanosama10@gmail.com", "12345678");
	  Thread.sleep(2000);
	  Assert.assertEquals(registerObject.navBarList.get(9).getText(), "Logged in as Abdelrahman Osama");
	  
	  registerObject.deleteAccount();
	  Thread.sleep(2000);
  }
  

}
