package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 
{
	
	public static WebDriver driver;
	@BeforeMethod
	public void launchThebrowser() throws Throwable
	{
		DataUtility data1=new DataUtility();
		 String Browser=data1.fetchingPropertiesFileData("browser");
		if (Browser.equals("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		else if (Browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();	
		}
		else if (Browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();	
	}
}
	@AfterMethod
	public void aftermethod() throws Throwable
	{
		Thread.sleep(3000);
		driver.quit();
	}
}