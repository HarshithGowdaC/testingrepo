package com.example;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.*;

import io.cucumber.core.backend.Status;

public class ksrtc {
	WebDriver w;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeSuite
	public void before() {
//		extent = new ExtentReports("ExtentReportResults.html");
	extent = new ExtentReports(System.getProperty("user.dir") +"/test-output/ExtentReportResults.html", true);
	    extent.addSystemInfo("Host name","local host");
		extent.addSystemInfo("environment","qa");
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\extentconfig.xml"));
		}

	@Test
	public void test1() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		  w= new ChromeDriver();
		w.get("https://ksrtc.in/oprs-web/user/add.do");
		 w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
		 w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[2]/input")).sendKeys("Harsha");
		  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[3]/input")).sendKeys("8310573124");
		  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[4]/input")).click();
	  w.switchTo().alert().accept();
//	  test.log(LogStatus.FAIL, "Already registered");
	}

	@Test   ///////valid login//////////
	public void test2() throws IOException, InterruptedException {
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
//		  Thread.sleep(2000);
//		 w.switchTo().alert().accept();
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
//		 test.log(LogStatus.PASS, "login successful ");
}

	@Test   ///////invalid login//////////
	public void test3() throws IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		  w= new ChromeDriver();
		 w.get("https://ksrtc.in/oprs-web/login/perform.do");
		  w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
		  w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[2]/input")).sendKeys("Harsha@301");
		  w.findElement(By.id("submitBtn")).click();
//		  test.log(LogStatus.FAIL, "invalid user id or password");
		 
}

//@AfterMethod
//public void result(ITestResult result)
//{
//	if(result.getStatus()==ITestResult.FAILURE)
//	{
//		test.log(LogStatus.FAIL,result.getThrowable());
//		
//	}

//}

@AfterSuite
public void after()
{
	 extent.flush();
}



}


