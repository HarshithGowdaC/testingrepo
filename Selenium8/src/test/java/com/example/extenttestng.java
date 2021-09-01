package com.example;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extenttestng {
	WebDriver w;
	  ExtentReports extent;
	  ExtentHtmlReporter htmlReporter;
	 
@BeforeTest
	public void setup()
	{
	 htmlReporter = new ExtentHtmlReporter("extent1.html");
    
    // create ExtentReports and attach reporter(s)
	 extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
	}

@Test
public void test1() throws IOException {
	 ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  w= new ChromeDriver();
	w.get("https://ksrtc.in/oprs-web/user/add.do");
	 w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
	 w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[2]/input")).sendKeys("Harsha");
	  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[3]/input")).sendKeys("8310573124");
	  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[4]/input")).click();
  w.switchTo().alert().accept();
//log(Status, details)
  test.log(Status.INFO, "This step shows usage of log(status, details)");

  // info(details)
  test.info("This step shows usage of info(details)");
  
  
}
@Test   ///////valid login//////////
public void test2() throws IOException, InterruptedException {
	 ExtentTest test = extent.createTest("MySecondTest", "Sample description");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  w= new ChromeDriver();
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
//	  Thread.sleep(2000);
//	 w.switchTo().alert().accept();
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
	//log(Status, details)
	  test.log(Status.INFO, "This step shows usage of log(status, details)");

	  // info(details)
	  test.info("This step shows usage of info(details)");
// test.log(LogStatus.PASS, "login successful ");
}
@Test   ///////invalid login//////////
public void test3() throws IOException, InterruptedException {
	 ExtentTest test = extent.createTest("MyThirdTest", "Sample description");
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
	  w= new ChromeDriver();
	 w.get("https://ksrtc.in/oprs-web/login/perform.do");
	  w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
	  w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[2]/input")).sendKeys("Harsha@301");
	  w.findElement(By.id("submitBtn")).click();
	// log with snapshot
	  test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	  
	  // test with snapshot
	  test.addScreenCaptureFromPath("screenshot.png");
//	  test.log(LogStatus.FAIL, "invalid user id or password");
	
}
@AfterSuite
public void after()
{
	 extent.flush();
}

}


