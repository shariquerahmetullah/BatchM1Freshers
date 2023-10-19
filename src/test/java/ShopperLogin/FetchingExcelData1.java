package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelData1
{
	public static void main(String[] args) throws Throwable 
	{
		File file= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\personaldata.xlsx");
		FileInputStream files = new FileInputStream(file);	
		
		Workbook workbook = WorkbookFactory.create(files);
		Sheet sheet = workbook.getSheet("sheet1");
		int lastRowIndex=sheet.getLastRowNum();
		
		int lastcellvalue=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			for(int j=0;j<lastcellvalue;j++)
			{
				String value =sheet.getRow(i).getCell(j).getStringCellValue();
						System.out.println(value);
			}
			System.out.println();
		}
		
}
}