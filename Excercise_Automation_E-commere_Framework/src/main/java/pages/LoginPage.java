package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="email")
	WebElement emailTxt;
	
	@FindBy(name="password")
	WebElement passwordTxt;
	
	@FindBy(css="button.btn.btn-default")
	WebElement loginBtn;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/h2")
	public WebElement loginMessage;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/p")
	public WebElement failedMessage;
	
	public void userCanLogin(String email,String password){
		emailTxt.sendKeys(email);
		passwordTxt.sendKeys(password);
		
		loginBtn.click();
	}
}
