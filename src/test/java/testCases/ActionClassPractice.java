package testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ActionClassPractice extends BaseTest {

	@Test(priority = 1)
	public void verifyMouseHoverAction() {

// 1. moveToElement: Mouseover Action

		WebElement mouseHoverBox = driver.findElement(By.id("hoverBox"));

		actions.moveToElement(mouseHoverBox).perform(); // Move to element

		WebElement hoverText = driver.findElement(By.xpath("//p[@id='hoverText']"));

		Assert.assertTrue(hoverText.isDisplayed());

		System.out.println("Mousehover action performed successfully");

	}

// 2. contextClick: Right click action

	@Test(priority = 2)
	public void verifyContextClickAction() {

		WebElement rightClickButton = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

		actions.contextClick(rightClickButton).perform(); // perform right click operation

		Alert alert = driver.switchTo().alert();

		String alertMessage = alert.getText();

		Assert.assertEquals(alertMessage, "Right Click Successful");

		alert.accept();

		System.out.println("Right Click action performed successfully");

	}

	// 3. doubleClick: perform double click action

	@Test(priority = 3)
	public void verifyDoubleClickAction() {

		WebElement doubleClickButton = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

		actions.doubleClick(doubleClickButton).perform();

		System.out.println("Double Click actions perform Successfully");
	}

	// 4. Drag and Drop action

	@Test(priority = 4)
	public void verifyDragAndDropAction() throws InterruptedException {

		WebElement dragElement = driver.findElement(By.xpath("//div[@id='source']"));
		WebElement dropElement = driver.findElement(By.xpath("//div[@id='target']"));

		actions.clickAndHold(dragElement).moveToElement(dropElement).release().build().perform(); // used this actions because direct drag and drop not working

		System.out.println("Target Text = " + dropElement.getText());

		Thread.sleep(2000);
		WebElement dropSucessMessage = driver.findElement(By.xpath("//p[@id='dropMessage']"));
		System.out.println("Message: " + dropSucessMessage.getText());
		Assert.assertEquals(dropSucessMessage.getText(), "Drag and Drop Successful");

		System.out.println("Drag and Drop Action perform Successfully");
	}

}
