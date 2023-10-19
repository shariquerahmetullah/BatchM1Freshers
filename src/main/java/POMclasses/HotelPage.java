package POMclasses;
	import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class HotelPage
	{
		public WebDriver driver;
		 public HotelPage(WebDriver driver)
		 {
			 PageFactory.initElements(driver, this);
		 }
		
		@FindBy(xpath ="//input[@id='txtHotelCity")
		private WebElement CityInputTextFeild;
		
		@FindBy(xpath ="//input[@id='from']")
		private WebElement fromDate;
		
		
		@FindBy(xpath="//a[text()='Search Now'")
		private WebElement searchnowHotelButton;
		
		public WebElement getCityInputTextFeild()
		{
			return CityInputTextFeild;
		}
		public WebElement getsearchHotelButton()
		{
			return searchnowHotelButton;
		} 
		public WebElement getfromDate()
		{
			return fromDate;
		} 
		public void selectDateForHotels(WebDriver driver,long fromdate,long todate) throws Throwable
		{
			driver.findElement(By.xpath("//a[text()='"+fromdate+"']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='"+todate+"']")).click();	
		}
	}
