package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckBox {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w4=new ChromeDriver();
	 
	 w4.get("http://www.leafground.com");
	 w4.findElement(By.linkText("Checkbox")).click();
	 
	 //w4.findElement(By.xpath("//input[@type='checkbox'][2]")).click();
	 w4.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[2]/input")).click();
	 w4.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[3]/input")).click();
	 //w4.close();
  }
}
