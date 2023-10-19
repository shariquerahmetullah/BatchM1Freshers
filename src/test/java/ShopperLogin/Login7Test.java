package ShopperLogin;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GenericUtility.BaseClass2;
import GenericUtility.DataUtility;
import POMclasses.HomePage;
import POMclasses.HotelPage;
@Listeners(GenericUtility.ListnersFailure.class)
public class Login7Test extends BaseClass2
{
	DataUtility data1=new DataUtility();
	@Test()
	public void TC_Login_001() throws Throwable
	{
		System.out.println("The First Test Case");
		HomePage homepage = new HomePage(driver);
		Thread.sleep(3000);
		homepage.getHotelsmenuLink().click();
		
		System.out.println(driver.getCurrentUrl());
		
		Assert.assertEquals("https://www.spicejet.com/", driver.getCurrentUrl());
		
		String mainWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		allWindowID.remove(mainWindowID);
		for (String window:allWindowID)
		{
			driver.switchTo().window(window);
		}
		SoftAssert softassert=new SoftAssert();
		softassert.assertEquals("https://www.spicejet.com/", driver.getCurrentUrl());
		System.out.println("The remaining lines code");
		
		
//		HotelPage hotelpage = new HotelPage(driver);
//		String City = data1.fetchingPropertiesFileDataString("Sheet1",1,0);
//		hotelpage.getCityInputTextFeild().sendKeys(City);
//		Thread.sleep(3000);
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_DOWN);
//		robot.keyRelease(KeyEvent.VK_DOWN);
//		 Thread.sleep(3000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		hotelpage.getfromDate().click();
//		long FROMDATE = data1.fetchingPropertiesFileDataNumeric("Sheet1",1,1);
//		long TODATE = data1.fetchingPropertiesFileDataNumeric("Sheet1",1,2);
//		hotelpage.selectDateForHotels(driver,FROMDATE,TODATE);
//		Thread.sleep(3000);
//		hotelpage.getsearchHotelButton().click();
//		driver.switchTo().window(mainWindowID);
	}
}

