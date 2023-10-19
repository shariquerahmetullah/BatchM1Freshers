package ShopperLogin;

import GenericUtility.DataUtility;

public class Login2Test
{
	 public static void main(String[] args) throws Throwable 
	 {
		 DataUtility data1=new DataUtility();
		 String value1=data1.fetchingPropertiesFileData("username");
		 System.out.println(value1);
		 
		 
		 String value=data1.fetchingPropertiesFileData("sheet1",0,2);
		 System.out.println(value);
		 
		 String value3=data1.fetchingPropertiesFileData("sheet1",0,1);
		 System.out.println(value3);
	 }
}