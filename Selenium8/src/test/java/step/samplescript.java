package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class samplescript {
	WebDriver w;
	@Given("Open the browser and url of the application for registration")
	public void open_the_browser_and_url_of_the_application_for_registration() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		  w= new ChromeDriver();
		  w.get("https://ksrtc.in/oprs-web/user/add.do");
		 
	}
	
	@When("Enter username and password and click signup button")
	public void enter_username_and_password_and_click_signup_button() {
		w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
		 		  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[2]/input")).sendKeys("Harsha");
		  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[3]/input")).sendKeys("8310573124");
		
	}
	
	@Then("Registration Successful")
	public void Registration_Successful() {
		  w.findElement(By.xpath("//*[@id='userProfileForm']/div/div/div/div/div/div[4]/input")).click();
	   System.out.println("Registered successfully");
	}
	
	
	@Given("Open the browser and url of the application for login")
	public void open_the_browser_and_url_of_the_application_for_login() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		  w= new ChromeDriver();
		w.get("https://ksrtc.in/oprs-web/login/perform.do");
	}

	
	@When("Enter username and password and click login button")
	public void enter_username_and_password_and_click_login_button() {
		 w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[1]/input")).sendKeys("harshithgowda2301@gmail.com");
		  w.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div/div/div/div[2]/input")).sendKeys("Harsha@2301");
		  
			}
	
	
	@Then("Login to the account")
	public void login_to_the_account() {
		w.findElement(By.id("submitBtn")).click();
	   System.out.println("Login successfull");
	}
	
	
}

