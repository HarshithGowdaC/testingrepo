package com.example;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentsample {
	WebDriver w;
	  ExtentReports extent;
	  ExtentHtmlReporter htmlReporter;
	
@BeforeSuite
	public void setup()
	{
	 htmlReporter = new ExtentHtmlReporter("extentreport.html");
	    
	    // create ExtentReports and attach reporter(s)
		 extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	}
	@Test
	public void test1() throws IOException {
		 ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
		 test.log(Status.INFO, "This step shows usage of log(status, details)");

	        test.info("This step shows usage of info(details)");
	        
	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        test.addScreenCaptureFromPath("screenshot.png");
	        
	}
	@AfterTest
	public void after() {
		extent.flush();
	}
}
