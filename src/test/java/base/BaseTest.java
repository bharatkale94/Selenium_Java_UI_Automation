package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.BrowserFactory;
import utilities.ConfigReader;
import utilities.TakeScreenshotUtility;

public class BaseTest {

	protected WebDriver driver;
	protected Actions actions;

	@BeforeMethod
	@Parameters("browser")
	public void setup(@Optional("chrome") String browser) {
//		driver = new ChromeDriver(); -- For one browser support

		driver=BrowserFactory.getDriver(browser);
//		driver = BrowserFactory.getDriver(ConfigReader.getProperty("browser")); // to get all browser support

		driver.get(ConfigReader.getProperty("url"));
		driver.manage().window().maximize();  // Maximize browser 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit Wait method
		actions = new Actions(driver); // call action class
	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		// Capture Screenshot Only If Test Fails

		if (result.getStatus() == ITestResult.FAILURE) {

			TakeScreenshotUtility.takeScreenshot(driver, result.getName());

			System.out.println("Failure Screenshot Captured");
		}

		// Close Browser

		if (driver != null) {

			driver.quit();
		}
	}
}
