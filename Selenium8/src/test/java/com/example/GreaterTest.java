package com.example;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GreaterTest {
 Greater g= new Greater();
  
 @Test(dataProvider="value")
  public void great(int exp,int a, int b) {
    Assert.assertEquals(exp,g.great(a, b));
  }

  @Test(enabled=false)
  public void mod() {
    Assert.assertEquals(0, g.mod(4, 2));
  }
  
  @DataProvider(name="value")
  public Object[][] getdata(){ 
	  Object[][] arr_value=new Object[][] {
	  {4,6,4},{6,5,6},{10,4,10}};
	  return arr_value;
  }
  @Test(expectedExceptions=Exception.class)
  
 
	  public void div() {
		  int a=5,b=0,c;
		  c=a/b;
		  System.out.println(c);
		  
		  
	  }
  }

