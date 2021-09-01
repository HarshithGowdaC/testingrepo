package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
  WebDriver w=new ChromeDriver();
  

 
  w.get("http://www.leafground.com");
  w.findElement(By.linkText("Edit")).click();
  WebDriverWait wait=new WebDriverWait(w,15);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
  w.findElement(By.id("email")).sendKeys("Harsha"); 
 // w.findElement(By.xpath("///html/body/div/div/div[3]/section/div[2]/div/div/input")).sendKeys("Gowda");
 w.findElement(By.name("username")).sendKeys("C");
 w.findElement(By.cssSelector("input[value='Clear me!!']"));
w.close();
 
  ///////button///////////////////error
 
  //////////CheckBox///////////////error

  }
  
  
}
