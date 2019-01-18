package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseTestFixture.Browser;
import Helpers.Helpers;


public class InkSpaceHomePage {

	@FindBy(css="div.collaboration_beta > div.submit > input")
	public static WebElement InkspaceBetaWindowSureIllJoinOption;
	
	@FindBy(id="btn-upload")
	public WebElement UploadButton;
	
	@FindBy(css="input[placeholder='SEARCH FILE OR TEXT...']")
	public WebElement SearchFileOrTextField;
	
	@FindBy(css="span.check > span")
	public WebElement FirstPictureAfterSearch;
	
	@FindBy(css="a.delete_menu")
	public WebElement PictureMenuDeleteOption;
	
	@FindBy(css="form > div.submit > input[value='DELETE']")
	public WebElement DialogWindowDeleteButton;
	
	
	public void InkspaceBetaWindowClickOnToSureIllJoinOption()
	{
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(InkspaceBetaWindowSureIllJoinOption));
		InkspaceBetaWindowSureIllJoinOption.click();
	}
	
	
	
	
	public void GoToChai()
	{
		Browser.Driver.get(Helpers.ChaiURL);
	}
	
	public void TypeInPicture20MBNameValue() throws InterruptedException
	{
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(UploadButton));
		SearchFileOrTextField.sendKeys("");
		SearchFileOrTextField.sendKeys("Clocktower_Panorama_20080622_20mb.jpg");
		Thread.sleep(2000);
	}
	
	
	public void TypeInPicture10MBNameValue() throws InterruptedException
	{
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(UploadButton));
		SearchFileOrTextField.sendKeys("");
		SearchFileOrTextField.sendKeys("Pizigani_1367_Chart_10MB.jpg");
		Thread.sleep(2000);
	}
	
	
	public void TypeInPicture1MBNameValue() throws InterruptedException
	{
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(UploadButton));
		SearchFileOrTextField.sendKeys("");
		SearchFileOrTextField.sendKeys("zandromeda_1024x768.jpg");
		Thread.sleep(2000);
	}
	
	
	public void MouseMoveToPicture() throws IOException, InterruptedException
	{
		 int x=FirstPictureAfterSearch.getLocation().getX();
		 int y=FirstPictureAfterSearch.getLocation().getX();
		 
		 Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:"+Integer.toString(x)+","+Integer.toString(y)+"").getInputStream();
		 Thread.sleep(2000);
	}
	
	public void DeletePicture() throws AWTException, InterruptedException
	{
		 Robot robot=new Robot();
		 robot.mousePress(InputEvent.BUTTON3_MASK);
		 robot.mouseRelease(InputEvent.BUTTON3_MASK);    
		 Thread.sleep(3000);
		 Browser.Wait.until(ExpectedConditions.elementToBeClickable(PictureMenuDeleteOption));
		 PictureMenuDeleteOption.click();
		 Browser.Wait.until(ExpectedConditions.elementToBeClickable(DialogWindowDeleteButton));
		 DialogWindowDeleteButton.click();
		 
	}
	
	
}
