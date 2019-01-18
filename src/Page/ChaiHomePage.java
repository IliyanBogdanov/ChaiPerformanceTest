package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import BaseTestFixture.Browser;
import Helpers.Helpers;

public class ChaiHomePage {
	
	public long StartTime=0;
	public long EndTime=0;
	public long ExecutionTime=0;
	
	
	@FindBy(css="div.modal-body > div.preloader-content > i.preloader-icon")
	public WebElement LoadingWindow;

	@FindBy(id="SKIP")
	public WebElement FTESkipOption;
	
	@FindBy(css="ul.bottom-group > li > button.main-btn.btn.import > i")
	public WebElement ImportButton;
	
	@FindBy(id="file")
	public WebElement FileImportButton;
	
	
	@FindBy(css="img[alt='Clocktower_Panorama_20080622_20mb.jpg']")
	public WebElement ImportedPicture20MB;
	
	@FindBy(css="img[alt='Pizigani_1367_Chart_10MB.jpg']")
	public WebElement ImportedPicture10MB;
	
	@FindBy(css="img[alt='zandromeda_1024x768.jpg']")
	public WebElement ImportedPicture1MB;
	
	@FindBy(css="ul.bottom-group > li > button.main-btn.btn.fbr-menu")
	public static WebElement ReportBugOrSendFeedbackButtonOptions;
	
	@FindBy(css="div.context-menu-inner > button.context-btn.btn-defalt.btn-delete")
	public static WebElement ImageDeleteOption;
	
	
	public void LoadingTimeCalculation()
	{
		Browser.Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-body > div.preloader-content > i.preloader-icon")));
		StartTime=System.currentTimeMillis();
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(FTESkipOption));
		EndTime=System.currentTimeMillis();
		ExecutionTime=EndTime-StartTime;
		System.out.println( Browser.Name+" Loading Time: "+ ExecutionTime);
	}
	
	public void ClickOnTheFTESkipButton()
	{
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(FTESkipOption));
		FTESkipOption.click();
	}
	
	public void HomePageBeforeImportScreenshot() throws IOException
	{
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(ImportButton));
		Helpers.CreateScreenshot("HomePageBeforeImport");
	}
	
	public void HomePageAfterImportScreenshot() throws IOException, InterruptedException, AWTException
	{
		Thread.sleep(10000);
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(ReportBugOrSendFeedbackButtonOptions));
		ReportBugOrSendFeedbackButtonOptions.click();
		Thread.sleep(2000);
		Helpers.CreateScreenshot("HomePageAfterImport");
		ReportBugOrSendFeedbackButtonOptions.click();
		Thread.sleep(1000);
	    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:960,564").getInputStream();
		Thread.sleep(1000);
		Robot robot=new Robot();
		robot.mousePress(InputEvent.BUTTON3_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_MASK);    
		Thread.sleep(3000);
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(ImageDeleteOption));
		ImageDeleteOption.click();
		Thread.sleep(1000);
		ReportBugOrSendFeedbackButtonOptions.click();

	}
	
	
	
	public void ClickOnTheImportButton()
	{
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(ImportButton));
		ImportButton.click();
	}
	
	public void ClickOnTheFileImportButton() throws InterruptedException, IOException
	{
		if(Browser.Name.equals("Safari"))
		{
			Thread.sleep(4000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:220,585").getInputStream();
			Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:220,585").getInputStream();
			
			Thread.sleep(4000);
		}else
		{
			Browser.Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='IMPORT FILE']")));
			FileImportButton.click();
		}
	}
	
	public void Import20MBPictureTimeCalculation() throws InterruptedException, IOException
	{
		
		switch(Browser.Name)
		{
		case "Firefox":
		
		Thread.sleep(2000); 
		Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:580,384").getInputStream();
	    Thread.sleep(1000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:580,384").getInputStream();
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:760,224").getInputStream();
	    Thread.sleep(1000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick dc:760,224").getInputStream();
	    break;
		
		case "Chrome":
			Thread.sleep(2000); 
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:377,329").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:377,329").getInputStream();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:477,169").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick dc:477,169").getInputStream();
			break;
			
		case "Safari":
			Thread.sleep(2000); 
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:650,324").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:650,324").getInputStream();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:860,164").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick dc:860,164").getInputStream();
			break;
		}
		
		StartTime=System.currentTimeMillis();
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(ImportedPicture20MB));
		EndTime=System.currentTimeMillis();
		ExecutionTime=EndTime-StartTime;
	    
		System.out.println("Import 20MB Picture Time: "+ExecutionTime);
		ImportedPicture20MB.click();
		
		
		
	}
	
	
	
	
	public void Import10MBPictureTimeCalculation() throws IOException, InterruptedException
	{
		
		
		switch(Browser.Name)
		{
		case "Firefox":
			Thread.sleep(2000); 
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:580,384").getInputStream();
			Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:580,384").getInputStream();
			Thread.sleep(1000);
	    	Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:760,244").getInputStream();
	    	Thread.sleep(2000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  dc:760,244").getInputStream();
		break;
		
		case "Chrome":
			Thread.sleep(2000); 
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:377,329").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:377,329").getInputStream();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:477,189").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick dc:477,189").getInputStream();
		break;
		
		case "Safari":
			Thread.sleep(2000); 
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:650,324").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:650,324").getInputStream();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:860,184").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick dc:860,184").getInputStream();
			break;
			
		}
		
		StartTime=System.currentTimeMillis();
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(ImportedPicture10MB));
		EndTime=System.currentTimeMillis();
		ExecutionTime=EndTime-StartTime;
	    
		System.out.println("Import 10MB Picture Time: "+ExecutionTime);
		ImportedPicture10MB.click();
	}

	public void Import1MBPictureTimeCalculation() throws IOException, InterruptedException
	{
		switch(Browser.Name)
		{
		case "Firefox":
		Thread.sleep(2000); 
		Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:580,384").getInputStream();
	    Thread.sleep(1000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:580,384").getInputStream();
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:760,264").getInputStream();
	    Thread.sleep(3000);
		Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  dc:760,264").getInputStream();
		break;
		
		case "Chrome":
			Thread.sleep(2000); 
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:377,329").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:377,329").getInputStream();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:477,209").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick dc:477,209").getInputStream();
		break;
		
		case "Safari":
			Thread.sleep(2000); 
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  m:650,324").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick  c:650,324").getInputStream();
		    Thread.sleep(1000);
		    Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:860,204").getInputStream();
		    Thread.sleep(1000);
			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick dc:860,204").getInputStream();
		break;
		
		}
		
		StartTime=System.currentTimeMillis();
		Browser.Wait.until(ExpectedConditions.elementToBeClickable(ImportedPicture1MB));
		EndTime=System.currentTimeMillis();
		ExecutionTime=EndTime-StartTime;
	    
		System.out.println("Import 1MB Picture Time: "+ExecutionTime);
		ImportedPicture1MB.click();
	}
	
	
	
	
	public boolean AssertHomePageIsDifferentBeforeANdAfterImageImport()
	{
		return Helpers.CompareCanvasBeforeAndAfterImportImage("/Users/nenko/Documents/WacomProjectScreenshots/ChaiPerformanceScreenshot/HomePageAfterImport.png", "/Users/nenko/Documents/WacomProjectScreenshots/ChaiPerformanceScreenshot/HomePageBeforeImport.png");
	}
	
	
	
	public void GoToInkSpace()
	{
		Browser.Driver.get("https://inkspace.wacom.com/user?lang=en");
	}
	
}
