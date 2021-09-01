package com.example;

import java.io.BufferedWriter;		
import java.io.File;		
import java.io.FileWriter;
import java.util.Set;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;		

public class Cookies{	
    

    public static void main(String[] args) throws InterruptedException		
    {
    	WebDriver w;	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		  w= new ChromeDriver();
		  w.get("https://ksrtc.in/oprs-web/login/perform.do");		
       	
		 w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
		  w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[2]/input")).sendKeys("Harsha@2301");
		  w.findElement(By.id("submitBtn")).click();
//		  	WebElement el=w.findElement(By.id("fromPlaceName"));
//		  el.sendKeys("MYSORE");
//		  el.sendKeys(Keys.ARROW_DOWN); 
//		  el.sendKeys(Keys.ARROW_DOWN); 
//		  el.sendKeys(Keys.ENTER);
//		 el.sendKeys(Keys.TAB);
//		  Thread.sleep(2000);
//		// w.switchTo().alert().accept();
//		  WebElement el2=w.findElement(By.id("toPlaceName"));
//		  el2.sendKeys("DHARMASTALA");
//		  el2.sendKeys(Keys.ARROW_DOWN); 
//		  el2.sendKeys(Keys.ARROW_DOWN); 
//		  el2.sendKeys(Keys.ENTER);
//		  el.sendKeys(Keys.TAB);					
//		  JavascriptExecutor js= (JavascriptExecutor) w;
//		  js.executeScript("document.getElementById('txtJourneyDate').value='26/08/2021'");
//		  js.executeScript("document.getElementById('txtReturnJourneyDate').value='28/08/2021'");
//
////		  
//		 w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
		
		 w.close();
		 Cookie n = new Cookie("Cookies","harsha");
			w.manage().addCookie(n);
			w.manage().deleteCookie(n);
        File file = new File("C:\\Users\\harshith.gowdac\\OneDrive - HCL Technologies Ltd\\Documents\\Cookies.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            
            for(Cookie ck:w.manage().getCookies())							
            {			
            	Bwrite.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));																									
                Bwrite.newLine();             
            }
           
            w.manage().deleteAllCookies();
            
            for(Cookie ck:w.manage().getCookies())							
            {			
            	Bwrite.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));																									
                Bwrite.newLine();             
            }
            Bwrite.close();			
            fileWrite.close();	
              
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
    }		
}