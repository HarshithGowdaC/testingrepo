package com.example;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample1 {

	@BeforeSuite
	public void bsuite1()
	{
		int a,b=3,c=7;
		a=b+c;
		System.out.print("before suit");
		System.out.println(a);
	}
	
	@BeforeMethod
	public void bmethod1()
	{
		int a,b=3,c=5;
		a=b+c;
		System.out.print("before method");
		System.out.println(a);
	}
	@BeforeTest
	public void btest1()
	{
		int a,b=3,c=5;
		a=c-b;
		System.out.print(a);
	}
	@AfterMethod
	public void amethod1()
	{
		int a,b=3,c=5;
		a=b*c;
		System.out.print("after method");
		System.out.println(a);
	}
	@AfterTest
	public void atest1()
	{
		int a,b=6,c=2;
		a=b/c;
		System.out.print("after test");
		System.out.println(a);
	}
	@AfterSuite
	public void asuite1()
	{
		int a,b=3,c=10;
		a=b+c;
		System.out.print("after suit");
		System.out.println(a);
	}
    @Test(priority=1)
	public void case1()
	{
		System.out.print("Executed case1");
		
	}
	
    @Test(priority=0)
   	public void case2()
   	{
   		System.out.print("Executed case2");
   	  Reporter.log("Executed Successsfully"+true);
   	}
   	
    @Test(priority=-1)
   	public void case3()
   	{
   		System.out.print("Executed case3");
   		
   	}
    @Test(groups= {"TestCase1"})
   	public void case5()
   	{
   		System.out.print("Executed case5");
   		System.out.println(Thread.currentThread().getId());
   	}
    @Test(groups= {"TestCase2"})
   	public void case6()
   	{
   		System.out.print("Executed case6");
   		System.out.println(Thread.currentThread().getId());
   	}
    
    @Test(groups= {"TestCase2","TestCase1"})
   	public void case7()
   	{
   		System.out.print("Executed case7");
   		System.out.println(Thread.currentThread().getId());
   		
   	}
    
   	
}


