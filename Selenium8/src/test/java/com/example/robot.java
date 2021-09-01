package com.example;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.read.biff.BiffException;

public class robot {
public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException {
		 
	System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
	w.get("https://smallpdf.com/word-to-pdf");
	w.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[5]/div/div[1]/div/div/div/div/div/div/form/label/div/div[2]/div/button[1]")).click();
	String file="C:\\Users\\harshith.gowdac\\OneDrive - HCL Technologies Ltd\\Documents\\chrome_options";
	StringSelection s1=new StringSelection(file);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
	Thread.sleep(5000);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_ENTER);
	
	 }
}

