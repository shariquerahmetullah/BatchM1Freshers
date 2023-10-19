package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public WebDriver driver;
	 public LoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 /// declaration of web element
	 @FindBy(xpath ="//input[@data-testid='user-mobileno-input-box']")
	  private WebElement  MobileNumber;
	 
	 @FindBy(xpath ="//input[@data-testid='password-input-box-cta']")
	  private WebElement  passwordTextFeild;
	 
	 public WebElement getMobileNumber() {
		return MobileNumber;
	}
	public WebElement getPasswordTextFeild() {
		return passwordTextFeild;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	@FindBy(xpath ="//div[@data-testid='login-cta']")
	  private WebElement  LoginButton;
	 //getter Method
	 
	}

