package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
	public WebDriver driver;
	 public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//div[text()='Hi Sharique']")
	  private WebElement UserMenuLink;
	 
	 @FindBy(xpath ="//div[text()='Log Out']")
	  private WebElement  LoguotLink;
	 
	 @FindBy(xpath="//div[text()='Hotels' and @dir='auto']")
	 private WebElement HotelsmenuLink;
	 
	 //getters web element
	 
	
	public WebElement getLoguotLink() {
		return LoguotLink;
	}
	public WebElement getHotelsmenuLink() {
		return HotelsmenuLink;
	}
	public WebElement getUserMenuLink() {
		return UserMenuLink;
	}	 
	}
