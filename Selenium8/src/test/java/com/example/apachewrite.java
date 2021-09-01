package com.example;

import java.awt.AWTException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class apachewrite {
public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
			String filepath=("C:\\\\Users\\\\harshith.gowdac\\\\OneDrive - HCL Technologies Ltd\\\\Documents\\\\Book2");
			File f1=new File(filepath);
			FileOutputStream fos=new FileOutputStream(f1);
			XSSFWorkbook w1=new XSSFWorkbook();
			XSSFSheet  s1=w1.createSheet("Harshithgowda");
//	for(int i=0;i<5;i++)
//		for(int j=0;j<5;j++)
		Row r1=s1.createRow(3);
			Cell c1=r1.createCell(5);
			c1.setCellType(CellType.STRING);
			c1.setCellValue("Harsha");
			w1.write(fos);
        }
	}