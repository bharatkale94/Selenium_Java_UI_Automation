package utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TakeScreenshotUtility {

	// Method for the capture full page screenshot
	public static String takeScreenshot(WebDriver driver, String fileName) {

		String screenshotPath = "";

		try {

			// Create screenshots folder if not exists
			Path screenshotFolder = Paths.get("screenshots");

			if (!Files.exists(screenshotFolder)) {

				Files.createDirectories(screenshotFolder);
			}

			// Generate Timestamp
			String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));

			// Capture Screenshot
			TakesScreenshot ts = (TakesScreenshot) driver;

			File src = ts.getScreenshotAs(OutputType.FILE);

			screenshotPath = "screenshots/" + fileName + "_" + timestamp + ".png";

			Files.copy(src.toPath(), Paths.get(screenshotPath));

			System.out.println("Screenshot Saved : " + screenshotPath);

		} catch (IOException e) {

			e.printStackTrace();
		}

		return screenshotPath;
	}
	
	// Method for the capture element specific screenshot

	public static void captureElementScreenshot(WebElement element, String fileName) {

		try {

			File src = element.getScreenshotAs(OutputType.FILE);

			Files.copy(src.toPath(), Paths.get("screenshots/" + fileName + ".png"));

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}