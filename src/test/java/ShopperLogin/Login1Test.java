package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Login1Test 
{
public static void main(String[] args) throws Throwable 
{
	File file= new File("./src/test/resources/TestData/Propertyfile.properties");
	FileInputStream files = new FileInputStream(file);
	Properties pro = new Properties();
	pro.load(files);
	String URL = pro.getProperty("url");
	System.out.println(URL);
	
	String UserName = pro.getProperty("username");
	System.out.println(UserName);
	
	String pass = pro.getProperty("password");
	System.out.println(pass);
}
}
