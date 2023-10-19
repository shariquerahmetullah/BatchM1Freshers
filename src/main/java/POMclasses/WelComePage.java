package POMclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelComePage 
{
 public WebDriver driver;
 
 public WelComePage(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
   ///Initializing all the webelement
 @FindBy(xpath="//div[text()='Login']")
 private WebElement LoginButton;

public WebElement getLoginButton() 
{
	return LoginButton;
}
}
  
   
  

