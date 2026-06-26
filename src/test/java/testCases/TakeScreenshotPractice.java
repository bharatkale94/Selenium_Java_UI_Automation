package testCases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class TakeScreenshotPractice extends BaseTest {

	@Test
	public void verifyFailureScreenshot() {

		Assert.assertEquals("Bharat", "Kale");
	}

	@Test
	public void verifyElementScreenshot() throws IOException {

		WebElement logo = driver.findElement(By.id("companyLogo"));

		File src = logo.getScreenshotAs(OutputType.FILE);

		Files.copy(src.toPath(), Paths.get("screenshots/logo.png"));

		System.out.println("Element Screenshot Captured");
	}
}
