package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Frame {
  @Test
  public void f() {
	/////frame////
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe"); 
	 WebDriver w9= new ChromeDriver();
	 w9.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.html");
	// w9.findElement(By.linkText("Frame")).click();
	 WebDriverWait wait=new WebDriverWait(w9,15);
	 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.linkText("Beginners Guide")));
	  w9.findElement(By.linkText("Beginners Guide")).click();
	  w9.switchTo().frame(0);
	  w9.switchTo().frame(3);
	  w9.switchTo().defaultContent();
	  
	 // w9.findElement(By.linkText("Beginners Guide")).click();
	  
//	 w9.switchTo().defaultContent();
	// w9.switchTo().frame
	  w9.switchTo().parentFrame();
	  
   w9.close();
   
  }
}
