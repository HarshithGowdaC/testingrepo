package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Ordered {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w= new ChromeDriver();
	  w.get("http://demo.automationtesting.in/AutoComplete.html");
	  w.findElement(By.id("searchbox")).sendKeys("b");
	  Thread.sleep(10000);
	  List<WebElement> el=w.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
	  int l=el.size();
	  System.out.println(l);
	  Thread.sleep(5000);
	  for(WebElement list_values:el) {
		  if(list_values.getText().equalsIgnoreCase("Bangaladesh")) {
			  list_values.click();
			  break;
		  }
		  
	  }
	  
  }
}