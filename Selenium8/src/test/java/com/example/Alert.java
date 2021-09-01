package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
import org.testng.annotations.Test;

public class Alert {
  @Test
  public void f() throws AWTException, IOException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w6= new ChromeDriver();
	 w6.get("http://www.leafground.com");
	 w6.findElement(By.linkText("Alert")).click();
	 WebDriverWait wait=new WebDriverWait(w6,50);
	 FluentWait f1= new FluentWait(w6);
	 f1.withTimeout(25,TimeUnit.SECONDS)
	 .pollingEvery(5,TimeUnit.SECONDS)
	 .ignoring(NoSuchElementException.class);
	 wait.until(ExpectedConditions.alertIsPresent());
	 w6.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button")).click();
	 String msg1= w6.switchTo().alert().getText();
	 System.out.println(msg1);
	 Robot r1= new Robot();
	 Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	 Rectangle rect=new Rectangle(d);
	 BufferedImage src =r1.createScreenCapture(rect);
	 File des=new File("C:\\Users\\harshith.gowdac\\OneDrive - HCL Technologies Ltd\\Pictures\\picture2");
	ImageIO.write(src, "jpg",des );
	 
	 w6.switchTo().alert().accept();
	 
	 WebDriver w7 = new ChromeDriver();
	 w7.get("http://www.leafground.com");
	 w7.findElement(By.linkText("Alert")).click();
	 w7.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
	 w7.switchTo().alert().dismiss();
	  
	  WebDriver w8= new ChromeDriver();
	  w8.get("http://www.leafground.com");
	 w8.findElement(By.linkText("Alert")).click();
	 w8.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/button")).click();
	 w8.switchTo().alert().sendKeys("Harsha");
	 w8.switchTo().alert().accept();
  }
}
