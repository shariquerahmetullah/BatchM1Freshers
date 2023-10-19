package ShopperLogin;
import org.testng.annotations.Test;
import GenericUtility.BaseClass;
import GenericUtility.DataUtility;

public class Login4Test extends BaseClass
{
	@Test (priority = 3,enabled = false)
 public void TC_Login_001() throws Throwable 
	{
		DataUtility data1=new DataUtility();
		 String Browser=data1.fetchingPropertiesFileData("browser");	
		 System.out.println("The first case");
		  BaseClass.launchThebrowser(Browser);
		 String URL=data1.fetchingPropertiesFileData("url");
		 driver.get(URL);
		 driver.quit();	 
	}
	@Test(dependsOnMethods = "TC_Login_003",alwaysRun = true)
 public void TC_Login_002() throws Throwable 
	{
		DataUtility data1=new DataUtility();
		 String Browser=data1.fetchingPropertiesFileData("browser");	
		 System.out.println("The second case");
		  BaseClass.launchThebrowser(Browser);
		 String URL=data1.fetchingPropertiesFileData("url");
		 driver.get(URL);
		 driver.quit();
}
	@Test 
 public void TC_Login_003() throws Throwable 
	{
		DataUtility data1=new DataUtility();
		 String Browser=data1.fetchingPropertiesFileData("browser");	
		 System.out.println("The third case");
		  BaseClass.launchThebrowser(Browser);
		 String URL=data1.fetchingPropertiesFileData("url");
		 driver.get(URL);
		 driver.quit();
}
}
