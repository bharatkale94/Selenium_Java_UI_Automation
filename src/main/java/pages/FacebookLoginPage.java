package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	private WebDriver driver;

	// Constructor
	public FacebookLoginPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	// Locators:

	@FindBy(xpath = "//input[@name='email']")
	private WebElement emailBox;

	@FindBy(xpath = "//input[@name='pass']")
	private WebElement passWord;

	@FindBy(xpath = "//div[@aria-label=\"Log in\"]")
	private WebElement loginButton;

	// Actions:
	public void enterUserName(String username) {
		emailBox.sendKeys(username);

	}

	public void enterPassword(String password) {
		passWord.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
