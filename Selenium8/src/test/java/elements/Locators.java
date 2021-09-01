package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {
	
		@FindBy(id="userName")
	public static WebElement emailid;
	
	@FindBy(id="password")
	public static WebElement password;
	
	@FindBy(id="submitBtn")
	public static WebElement signin;
	
}
	
	

