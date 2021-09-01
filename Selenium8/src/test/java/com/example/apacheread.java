package com.example;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.FileNotFoundException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class apacheread {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
				String filepath=("C:\\Users\\harshith.gowdac\\OneDrive - HCL Technologies Ltd\\Desktop\\Book1.xlsx");
		File f1=new File(filepath);
		DataFormatter d = new DataFormatter();
		FileInputStream file=new FileInputStream(f1);
		XSSFWorkbook w1=new XSSFWorkbook(file);
		XSSFSheet sheet = w1.getSheetAt(0);
		
		for(int i=0;i<sheet.getLastRowNum();i++)
			
		{
			String username=sheet.getRow(i).getCell(0).toString();
	        String password=sheet.getRow(i).getCell(1).toString();
	           w.get("https://ksrtc.in/oprs-web/login/show.do");
	           w.findElement(By.id("userName")).sendKeys(username);
	        w.findElement(By.id("password")).sendKeys(password);
	           w.findElement(By.id("submitBtn")).click();

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////		for(int i=0;i<10;i++) {
////		for(int j=0;j<10;j++){
////            Row r1=sheet.getRow(i);
////				Cell c1=r1.getCell(j);
////		String c="harsha"
//////		}}
//				 for (Row r: sheet) {
//			            for(Cell cell: r) {
//			                String cellValue = d.formatCellValue(cell);
//			                System.out.print(cellValue);
//			                
//			            	
//			                String username=sheet.getStringCell(cellValue);
////			                String password=sheet.formatCellValue(cellValue).getContents();
////			                w.get("https://ksrtc.in/oprs-web/login/show.do");
////			                w.findElement(By.id("userName")).sendKeys(username);
////			             w.findElement(By.id("password")).sendKeys(password);
////			                w.findElement(By.id("submitBtn")).click();
////			            }
////			            System.out.println();
//////			            System.out.print(msg);
//			        }
//		
//		
		
		
	}
}