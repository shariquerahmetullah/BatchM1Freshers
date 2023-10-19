package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.BaseClass1;
import GenericUtility.DataUtility;

public class Login5Test extends BaseClass1
{
	@Test (priority = 3,enabled = true)
 public void TC_Login_001() throws Throwable 
	{
		 System.out.println("The first case");
		DataUtility data1=new DataUtility();
		 String URL=data1.fetchingPropertiesFileData("url");
		 driver.get(URL);
		  
	}
	@Test(dependsOnMethods = "TC_Login_003",alwaysRun = true)
 public void TC_Login_002() throws Throwable 
	{
		DataUtility data1=new DataUtility();
		 System.out.println("The second case");
		 String URL=data1.fetchingPropertiesFileData("url");
		 driver.get(URL);
		 
}
	@Test 
 public void TC_Login_003() throws Throwable 
	{
		DataUtility data1=new DataUtility();
		 System.out.println("The third case");
		 String URL=data1.fetchingPropertiesFileData("url");
		 driver.get(URL);
		 
}
}
