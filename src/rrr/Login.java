package rrr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

	@Test
	public void getlogin() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vipin\\eclipse-workspace\\07Dec_Framework_TestNG\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();
	}
	
	
}
