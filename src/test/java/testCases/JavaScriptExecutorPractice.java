package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.JavaScriptExecutorUtility;

public class JavaScriptExecutorPractice extends BaseTest {

	@Test
	public void verifyClickAction() {

		// 1. JavaScriptExecutor Click:
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginButton']"));

		// loginButton.click(); // Getting exception: ElementClickInterceptedException

		JavaScriptExecutorUtility.clickElement(driver, loginButton); // So used JavaScriptExecutor Click

		WebElement loginMessage = driver.findElement(By.xpath("//p[@id='message'][2]"));
		
		System.out.println("JavaScriptExecutor click successfull");

	}
	
	// 2. ScrollToView Element:
	
	@Test
	public void scrollToViewButton()
	{
		
	WebElement bottomButton=driver.findElement(By.xpath("//button[@id='bottomButton']"));
	
	// bottomButton.click(); // Regular method also click on the button
	
	JavaScriptExecutorUtility.scrollToElement(driver, bottomButton);
	
	bottomButton.click();
	
	WebElement scrollText=driver.findElement(By.xpath("//p[@id='scrollMessage']"));
	
	Assert.assertEquals(scrollText.getText(), "Scroll Successful");
	
	System.out.println(scrollText.getText());
	
	System.out.println("Scrolling Successfully done");
	
	}
	
	// 3. ScrollToBottom:
	
	@Test
	public void scrollToBottom() {
		
		JavaScriptExecutorUtility.scrollToBottom(driver); 
		
		WebElement scrollBottomButton = driver.findElement(By.xpath("//button[@id='bottomPageButton']"));
		
		scrollBottomButton.click();
		
		System.out.println("Scroll To Bottom of the page done successfully");
		
	}
	
	// 4. Highlight Element:
	
	@Test
	public void verifyHighlightElement() {

	    WebElement nameField =
	            driver.findElement(
	            By.id("nameBox"));

	    JavaScriptExecutorUtility.highlightElement(
	            driver,
	            nameField);

	    nameField.sendKeys("Bharat");

	    System.out.println(
	            "Element Highlighted Successfully");
	}

}
