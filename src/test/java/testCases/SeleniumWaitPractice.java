package testCases;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class SeleniumWaitPractice extends BaseTest {

	@Test
	public void verifyImplicitWaitFunctionality() throws InterruptedException {

		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='waitShowButton']"));

		showMessageButton.click();

		// Thread.sleep(4000); //Java Wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); // Implicit Wait

		WebElement messageOnclick = driver.findElement(By.xpath("//p[@id='waitResultMessage']"));

		System.out.println(messageOnclick.getText());

		Assert.assertEquals(messageOnclick.getText(), "Wait Practice Successful");

	}

	@Test
	public void explicitWaitFunctionality() {

		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='waitShowButton']"));

		showMessageButton.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

		wait.until(ExpectedConditions.textToBe(By.xpath("//p[@id='waitResultMessage']"), "Wait Practice Successful")); // Explicit
																														// Wait

		WebElement messageOnclick = driver.findElement(By.xpath("//p[@id='waitResultMessage']"));

		System.out.println(messageOnclick.getText());

		Assert.assertEquals(messageOnclick.getText(), "Wait Practice Successful");

	}

	@Test
	public void fluentWaitFunctionality() {

		WebElement showMessageButton = driver.findElement(By.xpath("//button[@id='waitShowButton']"));

		showMessageButton.click();

		FluentWait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)) //Fluent Wait
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		fluentWait.until(ExpectedConditions.textToBe(By.xpath("//p[@id='waitResultMessage']"), "Wait Practice Successful")); 
		

		WebElement messageOnclick = driver.findElement(By.xpath("//p[@id='waitResultMessage']"));

		System.out.println(messageOnclick.getText());

		Assert.assertEquals(messageOnclick.getText(), "Wait Practice Successful");

	}

}
