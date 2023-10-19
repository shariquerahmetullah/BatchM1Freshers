package ShopperLogin;

import GenericUtility.BaseClass;
import GenericUtility.DataUtility;

public class Login3Test extends BaseClass
{
public static void main(String[] args) throws Throwable 
{
	DataUtility data1=new DataUtility();
	 String Browser=data1.fetchingPropertiesFileData("browser");	
	 
	  BaseClass.launchThebrowser(Browser);
	 String URL=data1.fetchingPropertiesFileData("url");
	 driver.get(URL);
}
}
