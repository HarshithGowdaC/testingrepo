package com.example;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestngignoreTest {
Testngignore test= new Testngignore();
	
//  @Test
//  public void add(int exp,int a,int b) {
//    Assert.assertEquals(exp,test.add(5,5));
//	
//  }
//
//
//
//@Test
//  public void mul() {
//   Assert.assertEquals(20,t.mul(4, 5));
//   Reporter.log("Executed Successfully"+true);
//  }
//
//  @Test(enabled=false)
//  public void sub() {
//   Assert.assertEquals(5,test.sub(5, 5));
  
  @Test(expectedExceptions=Exception.class)
  public int div(int a,int b) {
	  Assert.assertEquals(6,test.div(2,0));
	  return a/b;
  }
}
