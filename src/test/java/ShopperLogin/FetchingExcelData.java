package ShopperLogin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingExcelData 
{
public static void main(String[] args) throws Throwable 
{
	File file= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\personaldata.xlsx");
	FileInputStream files = new FileInputStream(file);	
	
	Workbook workbook = WorkbookFactory.create(files);
	Sheet sheet = workbook.getSheet("sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(1);
	String value = cell.getStringCellValue();
	System.out.println(value);
}
}
