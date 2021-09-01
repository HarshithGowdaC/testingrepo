package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RadioButton {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  WebDriver w3=new ChromeDriver();
	w3.get("http://www.leafground.com");
	 w3.findElement(By.linkText("Radio Button")).click();
	 WebDriverWait wait=new WebDriverWait(w3,15);
	 wait.until(ExpectedConditions.elementToBeClickable(By.id("yes")));
	 w3.findElement(By.id("yes")).click();
	 w3.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]")).click();
	 w3.findElement(By.className("myradio")).click();
	 
	 }
}
