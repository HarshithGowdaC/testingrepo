package com.example;

import org.testng.annotations.Test;

public class Sample2 {
	
	@Test
   	public void case8()
   	{
   		System.out.print("Executed case5");
   		System.out.println(Thread.currentThread().getId());
   	}
    @Test
   	public void case9()
   	{
   		System.out.print("Executed case6");
   		System.out.println(Thread.currentThread().getId());
   	}
    
    
    @Test(dependsOnMethods= {"case6a"})
   	public void case5a()
   	{
   		System.out.print("Executed case5a");
   		System.out.println(Thread.currentThread().getId());
   	}
    @Test(dependsOnMethods= {"case7a"})
   	public void case6a()
   	{
   		System.out.print("Executed case6a");
   		System.out.println(Thread.currentThread().getId());
   	}
    
    @Test
   	public void case7a()
   	{
   		System.out.print("Executed case7a");
   		System.out.println(Thread.currentThread().getId());
   		
   	}
}

