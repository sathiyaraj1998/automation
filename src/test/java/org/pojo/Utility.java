package org.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.it.Date;

public class Utility {
    public static WebDriver driver;
    public static TakesScreenshot t;
	public static void browserconfig() {

		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public static void passUrl(String url) {
         driver.get(url);
	}
	public static void screenshot(String path) {
		t=(TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\user\\eclipse-workspace\\DemoTry\\snap"+path+"png");
		
		try {
			FileUtils.copyFile(src, des);
			} catch (IOException e) {
			
			}	
	}
	public static String  excelData(String location,String sheet,int row,int cell) throws FileNotFoundException {
        
		File f=new File(location);
		FileInputStream fis=new FileInputStream(f);
		Workbook w=new XSSFWorkbook();
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String value=null;
		if(c.getCellType()==1) {
			String Value = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
		java.util.Date dateCellValue = c.getDateCellValue();
		SimpleDateFormat s1=new SimpleDateFormat("dd/mm/yyyy");
		  value = s1.format(dateCellValue);
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			long l=(long)numericCellValue;
			value = String.valueOf(l);
			
		}
		return value;
	}
	
}
