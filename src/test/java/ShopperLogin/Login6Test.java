package ShopperLogin;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import GenericUtility.BaseClass2;

@Test
public class Login6Test extends BaseClass2
{
		public void TC_Login_001() throws Throwable 
		{
			 System.out.println("The first case");
			 driver.findElement(By.xpath("//a[@href='/men']")).click();
			 if(driver.getCurrentUrl().equals("https://www.shoppersstack.com/men"));
			 {
			 System.out.println("The men page is displayed");
			 System.out.println("The test case 1st is passed");
		}
		}
		public void TC_Login_002() throws Throwable 
		{
			 System.out.println("The second case");
			 driver.findElement(By.xpath("//a[@href='/women' and @id='women']")).click();
			 if(driver.getCurrentUrl().equals("https://www.shoppersstack.com/women"));
			 {
			 System.out.println("The women page is displayed");
			 System.out.println("The test case 2st is passed");		 
	}			 
	}
}
