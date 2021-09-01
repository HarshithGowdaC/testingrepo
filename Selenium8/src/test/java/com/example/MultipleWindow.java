package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MultipleWindow {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w10=new ChromeDriver();
	  w10.get("http://www.leafground.com");
	  w10.findElement(By.linkText("Window")).click();
	  w10.navigate().back();
	  w10.navigate().forward();
	  w10.findElement(By.id("home")).click();
	  Set<String> win_val = w10.getWindowHandles();
	  Iterator<String> i = win_val.iterator(); 
	  String win1=i.next();
	  String win2=i.next();
	  w10.switchTo().window(win2);
	  System.out.print(w10.getTitle());
	  System.out.print(w10.getCurrentUrl()); 
	  System.out.print(w10.getPageSource()); 
	  w10.navigate().to("https://www.naukri.com");
	  w10.manage().window().maximize();
	  Dimension d= new Dimension(250,100);
	  w10.manage().window().setSize(d);
	  
//	  Set<String> pwin= w10.getWindowHandles();
//	  Iterator<String> j= win_val.iterator();
//	  String cwin=i.next();
//	  while(!pwin.equals(cwin))
//	  {
//	  w10.switchTo().window(cwin);
//	  System.out.print(w10.switchTo().window(cwin).getTitle());
//	  }
  }
}
