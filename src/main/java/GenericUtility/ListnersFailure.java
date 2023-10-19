package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersFailure extends BaseClass2 implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
		String FailedMethod=result.getMethod().getMethodName().toString();	 
		
		TakesScreenshot	ts=(TakesScreenshot) driver;
		
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		
		String Time = LocalDateTime.now().toString().replace(':','-');
		 
		String Name=FailedMethod+Time;
		File permanentFiles = new File ("./src/resources/Screenshot"+Time+".png");
		try {
			FileHandler.copy(tempfile, permanentFiles);
		} catch (IOException e)
		{ 
		}
	}

}
