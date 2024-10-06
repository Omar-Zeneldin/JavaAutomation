package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class RegisterPage extends PageBase{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="name")
	WebElement nameTxt;
	
	@FindBy(name="email")
	List<WebElement> emailTxt;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signUpBtn;
	
	@FindBy(id="id_gender1")
	WebElement genderBtn;
	
	@FindBy(id="password")
	WebElement passwordTxt;
	
	@FindBy(id="days")
	WebElement daysList;
	
	@FindBy(id="months")
	WebElement monthsList;
	
	@FindBy(id="years")
	WebElement yearsList;
	
	@FindBy(id="newsletter")
	WebElement newsLetterCheckBox;
	
	@FindBy(id="optin")
	WebElement specialOffersCheckBox;
	
	@FindBy(id="first_name")
	WebElement firstNameTxt;
	
	@FindBy(id="last_name")
	WebElement lastNameTxt;
	
	@FindBy(id="company")
	WebElement companyTxt;
	
	@FindBy(id="address1")
	WebElement addressTxt1;
	
	@FindBy(id="address2")
	WebElement addressTxt2;
	
	@FindBy(id="country")
	WebElement countryList;
	
	@FindBy(id="state")
	WebElement stateTxt;
	
	@FindBy(id="city")
	WebElement cityTxt;
	
	@FindBy(id="zipcode")
	WebElement zipCodeTxt;
	
	@FindBy(id="mobile_number")
	WebElement mobileNumberTxt;
	
	@FindBy(css="#form > div > div > div > h2 > b")
	public WebElement successMessage;
	
	@FindBy(css = "button.btn.btn-default")
	WebElement createAccountBtn;
	
	@FindBy (css="#form > div > div > div:nth-child(3) > div > h2")
	public WebElement newUserSignUpMessage;
	
	@FindBy (css="#form > div > div > div > div.login-form > h2 > b")
	public WebElement EnterAccountInformationMessage;
	
	@FindBy(linkText = "Continue")
	WebElement continueBtn;
	
	@FindBy(tagName = "li")
	public List<WebElement> navBarList;
	
	@FindBy(partialLinkText = "Delete Account")
	WebElement deleletAccountBtn;
	
	@FindBy(css="#form > div > div > div > h2 > b")
	public WebElement deleteAccountMessage;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/p")
	public WebElement failedMessage;
	
	public void newUserSignUp(String name,String email) {
		nameTxt.sendKeys(name);
		emailTxt.get(1).sendKeys(email);
		signUpBtn.click();
	}
	
	public void userCanRegister(String password,String day,String month,String year,String First_Name,String Last_name,String company,String address1,String address2,String Country,String state,String city,String zipCode,String mobileNumber) {
		genderBtn.click();
		passwordTxt.sendKeys(password);
		
		Select makeDaysList = new Select(daysList);
		Select makeMonthsList = new Select(monthsList);
		Select makeYearsList = new Select(yearsList);
		Select makeCountryList = new Select(countryList);
		
		makeDaysList.selectByValue(day);
		makeMonthsList.selectByValue(month);
		makeYearsList.selectByValue(year);
		
		newsLetterCheckBox.click();
		specialOffersCheckBox.click();
		
		firstNameTxt.sendKeys(First_Name);
		lastNameTxt.sendKeys(Last_name);
		companyTxt.sendKeys(company);
		addressTxt1.sendKeys(address1);
		addressTxt2.sendKeys(address2);
		
		makeCountryList.selectByValue(Country);
		stateTxt.sendKeys(state);
		
		cityTxt.sendKeys(city);
		zipCodeTxt.sendKeys(zipCode);
		
		mobileNumberTxt.sendKeys(mobileNumber);
		
		createAccountBtn.click();
	}
	
	public void continueAccount() {
		continueBtn.click();
	}
	
	public void deleteAccount() {
		deleletAccountBtn.click();
	}
	
}
