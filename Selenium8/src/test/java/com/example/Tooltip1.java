package com.example;

import static org.testng.Assert.assertEquals;
import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;
public class Tooltip1 {
    
    public static void main(String[] args) throws AWTException, InterruptedException {
        
        System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/css/css_tooltip.asp");
        driver.manage().window().maximize();
        
        //Scroll down the screen to see the tooltip element
        JavascriptExecutor script = (JavascriptExecutor)driver;
        script.executeScript("window.scrollBy(0,100)", "");
        Thread.sleep(2000);
        
        //xpath of element where we will get tooltip
        WebElement element = driver.findElement(By.xpath("//div[@class='w3-quarter'][1]/div"));
        
        //xpath of tooltip
        WebElement element1 = driver.findElement(By.xpath("//div[@class='w3-quarter'][1]/div/span"));
        
        // Creating Actions class object
        Actions ac = new Actions(driver);
        ac.moveToElement(element).perform();
        
        
        //Getting tooltip text using getText() method and store into String
        String tooltipText = element1.getText();
        
        //validating tooltip using assert method
        assertEquals(tooltipText, "Tooltip text");
        
        System.out.println(tooltipText);
        
           driver.quit();
        
        }
}