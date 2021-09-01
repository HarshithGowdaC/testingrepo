package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Drag {
  @Test
  public void f() throws InterruptedException{
  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
  WebDriver w=new ChromeDriver();
  

 
  w.get("http://www.leafground.com");
  w.findElement(By.linkText("Edit")).click();
 WebElement e=w.findElement(By.id("email"));
 WebElement e1=w.findElement(By.xpath("//html/body/div/div/div[3]/section/div[2]/div/div/input"));
 Actions a= new Actions(w);
 a.sendKeys(e,"Harsha").clickAndHold(e)
 .moveToElement(e1)
 .release(e1).build().perform();
// Action b= a.clickAndHold(e)
//		 .moveToElement(e1)
//		 .release(e1).build();
// 
//w.close();
 


  }
  
  
}
