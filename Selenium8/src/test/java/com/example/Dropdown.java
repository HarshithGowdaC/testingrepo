package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Dropdown {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w5=new ChromeDriver();
	  w5.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 w5.get("http://www.leafground.com");
	 w5.findElement(By.linkText("Drop down")).click();
	 Select s1=new Select(w5.findElement(By.id("dropdown1")));
	 s1.selectByVisibleText("Selenium");
	 
	 
	 Select s2=new Select(w5.findElement(By.name("dropdown2")));
	 s2.selectByIndex(1);
	 Select s3= new Select(w5.findElement(By.id("dropdown3")));
	 s3.selectByValue("3");
	 Boolean msg=s3.isMultiple();
	 System.out.println(msg);
	// 
  }
}
