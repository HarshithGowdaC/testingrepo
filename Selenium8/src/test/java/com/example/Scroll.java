package com.example;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scroll {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w= new ChromeDriver();
	  w.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
	  
          
	  JavascriptExecutor js= (JavascriptExecutor) w;
	  js.executeScript("scroll(0,500)");
	  WebElement e=w.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[6]/input"));
	  js.executeScript("arguments[0].scrollIntoView(true);",e);
  }
  
}