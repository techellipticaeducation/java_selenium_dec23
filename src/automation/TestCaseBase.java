package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestCaseBase {
	ChromeDriver driver;
	@BeforeMethod
	public void setup() {
		String driverPath = "C:\\Users\\Vaibhav\\git\\java_selenium_dec23\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
