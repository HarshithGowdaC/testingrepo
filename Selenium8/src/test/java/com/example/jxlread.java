package com.example;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class jxlread {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		Workbook w1= Workbook.getWorkbook(new File("C:\\Users\\harshith.gowdac\\OneDrive - HCL Technologies Ltd\\Documents\\Book1.xls"));
		Sheet s1=w1.getSheet(0);
        for (int i=1;i <s1.getRows();i++) {
        String username=s1.getCell(0,i).getContents();
        String password=s1.getCell(1,i).getContents();
           w.get("https://ksrtc.in/oprs-web/login/show.do");
           w.findElement(By.id("userName")).sendKeys(username);
        w.findElement(By.id("password")).sendKeys(password);
           w.findElement(By.id("submitBtn")).click();

        }

	
	}
	

}


