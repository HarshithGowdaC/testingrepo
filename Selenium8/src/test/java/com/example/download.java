package com.example;

import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class download {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");

	  WebDriver w= new ChromeDriver();
     w.get("http://leafground.com/pages/download.html");
     w.findElement(By.linkText("Download PDF")).click();
     File loc=new File("C:\\Users\\harshith.gowdac\\Downloads");
  File[] tfile=loc.listFiles();
  for(File f:tfile) {
	  f.getName().equalsIgnoreCase("testleaf.pdf");
	  System.out.print("downloaded");
	  break;
  }
  }
}