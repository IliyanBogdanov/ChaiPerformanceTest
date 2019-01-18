package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseTestFixture.Browser;


public class InkSpaceLoginPage {
	@FindBy(id="login-email")
	public static WebElement UsernameTextField;
	
	@FindBy(id="login-password")
	public static WebElement PasswordTextField;

	@FindBy(css="a > input[class='btn btn-done']")
	public static WebElement LogInToInkspaceButton;
	
	
	public void LoginIntoInkspaceWithValidCredentials() throws InterruptedException
	{
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(LogInToInkspaceButton));
		UsernameTextField.sendKeys("inkspace1.4@gmail.com");
		PasswordTextField.sendKeys("qawacomsofia0");
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(LogInToInkspaceButton));
		Thread.sleep(1000);
		LogInToInkspaceButton.click();
	}
	
}
