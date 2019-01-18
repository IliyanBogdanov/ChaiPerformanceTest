package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseTestFixture.Browser;


public class InkSpacePage {

public static String URL="https://inkspace.wacom.com/index.html?lang=en";
	
	@FindBy(id="login")
	public WebElement LogInButton;
	
	public void ClickOnLoginButton()
	{
		
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(LogInButton));
		LogInButton.click();
	}
	
	public void GoToInkspacePage()
	{	
		Browser.Driver.get(URL);
	}
}
