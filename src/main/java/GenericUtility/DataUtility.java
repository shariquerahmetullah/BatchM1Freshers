package GenericUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import io.opentelemetry.sdk.metrics.data.Data;

public class DataUtility 
{
public String fetchingPropertiesFileData (String key) throws Throwable
{
	File file= new File("./src/test/resources/TestData/Propertyfile.properties");
	FileInputStream files = new FileInputStream(file);
	Properties pro = new Properties();
	pro.load(files);
	String value = pro.getProperty(key);
	return value;
}
public String fetchingPropertiesFileData (String sheetname,int rowNum,int cellNum) throws Throwable
{
	File file= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\personaldata.xlsx");
	FileInputStream files = new FileInputStream(file);	
	
	Workbook workbook = WorkbookFactory.create(files);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	String value = cell.getStringCellValue();
	return value;
}
public String fetchingPropertiesFileDataString (String sheetname,int rowNum,int cellNum) throws Throwable
{
	File file= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\personaldata.xlsx");
	FileInputStream files = new FileInputStream(file);	
	
	Workbook workbook = WorkbookFactory.create(files);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	String value = cell.getStringCellValue();
	return value;
}
public long fetchingPropertiesFileDataNumeric (String sheetname,int rowNum,int cellNum) throws Throwable
{
	File file= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\personaldata.xlsx");
	FileInputStream files = new FileInputStream(file);	
	
	Workbook workbook = WorkbookFactory.create(files);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	long value = (long) cell.getNumericCellValue();
	return value;
}
public boolean fetchingPropertiesFileDataBoolean (String sheetname,int rowNum,int cellNum) throws Throwable
{
	File file= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\personaldata.xlsx");
	FileInputStream files = new FileInputStream(file);	
	
	Workbook workbook = WorkbookFactory.create(files);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	boolean value = cell.getBooleanCellValue();
	return value;
}
public Data fetchingPropertiesFileDataDate (String sheetname,int rowNum,int cellNum) throws Throwable
{
	File file= new File("C:\\Users\\DELL\\OneDrive\\Desktop\\personaldata.xlsx");
	FileInputStream files = new FileInputStream(file);	
	
	Workbook workbook = WorkbookFactory.create(files);
	Sheet sheet = workbook.getSheet(sheetname);
	Row row = sheet.getRow(rowNum);
	Cell cell = row.getCell(cellNum);
	Date value = cell.getDateCellValue();
	return (Data) value;
}	 
}
