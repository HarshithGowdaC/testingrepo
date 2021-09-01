package functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.Locators;

public class Login1 {
		@Test
		public void sample() {
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\harshith.gowdac\\Downloads\\chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.get("https://ksrtc.in/oprs-web/login/perform.do");
        PageFactory.initElements(w, Locators.class);
		Locators.emailid.sendKeys("harshithgowda2301@gmail.com");		
		
		Locators.password.sendKeys("Harsha@2301");
		Locators.signin.click();
	
   }
}
