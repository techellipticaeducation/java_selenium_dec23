package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
	
	
	public void test1() {

		String driverPath = "C:\\Users\\Vaibhav\\git\\java_selenium_dec23\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		By searchBox = By.id("user-name"); // locator strategy 
		WebElement searchBoxElement = driver.findElement(searchBox); // find element with LS
		searchBoxElement.sendKeys("standard_user"); // Action
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		By loginBtn = By.id("login-button");
		WebElement login = driver.findElement(loginBtn);
		login.click();
	}
}
