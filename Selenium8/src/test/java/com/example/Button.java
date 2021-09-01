package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

//import java.util.Iterator;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Button {
  @Test
  public void f() throws IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w2=new ChromeDriver();
	 w2.get("http://www.leafground.com");
	 w2.findElement(By.linkText("Button")).click();
	 w2.findElement(By.id("home")).click();
	// w2.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/button")).click();
	// w2.findElement(By.id("color")).click();
	 w2.findElement(By.xpath("//*[@id='size']")).click();
	 
	 TakesScreenshot t=(TakesScreenshot) w2;
	 File src=t.getScreenshotAs(OutputType.FILE);
	 File des=new File("C:\\Users\\harshith.gowdac\\OneDrive - HCL Technologies Ltd\\Pictures\\picture1");
	 FileHandler.copy(src, des);
	 w2.close();
  }
}
