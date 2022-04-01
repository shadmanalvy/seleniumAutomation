package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	
	public WebDriver driver;
	
	@BeforeSuite
	
	public void Setup () {
		
		WebDriverManager.chromedriver().version("100.0.4896.60").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tripadvisor.com");
		
	}
	
	@AfterSuite
	
	public void tearDown() {
		
		driver.quit();
	}

}
