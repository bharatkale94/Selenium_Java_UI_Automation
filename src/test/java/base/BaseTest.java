package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.BrowserFactory;
import utilities.ConfigReader;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setup() {
//		driver = new ChromeDriver(); -- For one browser support
		
		driver=BrowserFactory.getDriver(ConfigReader.getProperty("browser")); // to get all browser support

		driver.get(ConfigReader.getProperty("url"));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
