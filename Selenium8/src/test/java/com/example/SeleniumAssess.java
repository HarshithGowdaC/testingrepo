package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

@Listeners(com.example.Listeners.class)

public class SeleniumAssess {
  @Test
  public void f() throws InterruptedException, IOException {
	  FileInputStream f= new FileInputStream("src\\test\\java\\com\\example\\Config.properties");
	  Properties p= new Properties();
	  p.load(f);
	 String brname= p.getProperty("Browser");
	 String dpath= p.getProperty("path");
	 WebDriver w;
	  if(brname.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver",dpath);
		  w= new ChromeDriver();
	  }
	  else  if(brname.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver",dpath);
		  w= new FirefoxDriver();
	  }
	  else 
	  {
		  System.setProperty("webdriver.ie.driver",dpath);
		  w= new InternetExplorerDriver();
	  }  
	
	  w.get("https://ksrtc.in/oprs-web/user/add.do");

	  w.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
	 
	  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[2]/input")).sendKeys("Harsha");
	  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[3]/input")).sendKeys("8310573124");
	  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[4]/input")).click();
	 // w.switchTo().alert().accept();
	  w.get("https://ksrtc.in/oprs-web/login/perform.do");
	  w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
	  w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[2]/input")).sendKeys("Harsha@2301");
	  w.findElement(By.id("submitBtn")).click();
	  	WebElement el=w.findElement(By.id("fromPlaceName"));
	  el.sendKeys("MYSORE");
	  el.sendKeys(Keys.ARROW_DOWN); 
	  el.sendKeys(Keys.ARROW_DOWN); 
	  el.sendKeys(Keys.ENTER);
	 el.sendKeys(Keys.TAB);
	  Thread.sleep(2000);
	// w.switchTo().alert().accept();
	  WebElement el2=w.findElement(By.id("toPlaceName"));
	  el2.sendKeys("DHARMASTALA");
	  el2.sendKeys(Keys.ARROW_DOWN); 
	  el2.sendKeys(Keys.ARROW_DOWN); 
	  el2.sendKeys(Keys.ENTER);
	  el.sendKeys(Keys.TAB);
	
	 
	 
	  
	  JavascriptExecutor js= (JavascriptExecutor) w;
	  js.executeScript("document.getElementById('txtJourneyDate').value='19/08/2021'");
	  js.executeScript("document.getElementById('txtReturnJourneyDate').value='22/08/2021'");

//	  
	 w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
	
	 //w.close();
		 
  }
}