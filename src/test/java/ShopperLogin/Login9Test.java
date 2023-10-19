package ShopperLogin;

import org.testng.annotations.Test;

import GenericUtility.BaseClass2;

public class Login9Test extends BaseClass2 
{
	
		 @Test(groups = "SanityTest")
		public void TC_Login_006()
		{
			System.out.println("the six test case");
		}

		 @Test(groups = "RegressionTest")
		public void TC_Login_007()
		{
			System.out.println("the seven test case");
        }

		 @Test(groups= "SmokeTest")
		public void TC_Login_008()
		{
			System.out.println("the eight test case");
}
}