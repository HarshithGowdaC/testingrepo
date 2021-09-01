package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class tooltip {
  @Test
  public void f() throws AWTException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w6= new ChromeDriver();
	 w6.get("http://leafground.com/pages/tooltip.html");
	WebElement el= w6.findElement(By.id("age"));
	String tool=el.getAttribute("title"); 
	System.out.print(tool);
	
	
	
	
	WebElement el1=w6.findElement(By.xpath("/html/body/div[1]/div/div[3]/p"));
	
	 Actions ac = new Actions(w6);
     ac.moveToElement(el).perform();
	String tooltipText = el1.getText();
    
    
        System.out.println(tooltipText);
    
    
  

  
	
  
  }
}
  
