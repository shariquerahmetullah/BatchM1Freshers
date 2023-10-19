package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass2;

public class Login8Test extends BaseClass2 
{
 @Test(groups = "SmokeTest")
public void TC_Login_003()
{
	System.out.println("the third test case");
}
 @Test(groups = "RegressionTest")
	public void TC_Login_004()
	{
		System.out.println("the four test case");
}

	 @Test(groups = {"SmokeTest","RegressionTest"})
	public void TC_Login_005()
	{
		System.out.println("the five test case");
}
}