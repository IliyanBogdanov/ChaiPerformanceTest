package PerformanceTests;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import BaseTestFixture.BaseTestFixture;
import Page.InkSpacePage;
import Page.Page;

public class PerformanceTests extends BaseTestFixture {
	//@Test
  	public void ChaiLoadingTime() throws InterruptedException {
	  
	  Page.InkSpacePage().GoToInkspacePage();
	  Page.InkSpacePage().ClickOnLoginButton();
	  Page.InkSpaceLoginPage().LoginIntoInkspaceWithValidCredentials();
	  Page.InkSpaceHomePage().InkspaceBetaWindowClickOnToSureIllJoinOption();
	  Page.InkSpaceHomePage().GoToChai();
	  Page.ChaiHomePage().LoadingTimeCalculation();
	  Thread.sleep(1000);
  	} 
  
  
  	@Test
  	public void ChaiImportPictureTimeCalculation() throws InterruptedException, IOException, AWTException
  	{
  	  Page.InkSpacePage().GoToInkspacePage();
	  Page.InkSpacePage().ClickOnLoginButton();
	  Page.InkSpaceLoginPage().LoginIntoInkspaceWithValidCredentials();
	  Page.InkSpaceHomePage().InkspaceBetaWindowClickOnToSureIllJoinOption();
	  Page.InkSpaceHomePage().GoToChai();
	  Page.InkSpaceHomePage().GoToChai();
	  Page.ChaiHomePage().ClickOnTheFTESkipButton();
	  
	  Page.ChaiHomePage().HomePageBeforeImportScreenshot();
	  Page.ChaiHomePage().ClickOnTheImportButton();
	  Page.ChaiHomePage().ClickOnTheFileImportButton();
	  Page.ChaiHomePage().Import20MBPictureTimeCalculation();
	  Page.ChaiHomePage().HomePageAfterImportScreenshot();
	  
	  Page.ChaiHomePage().HomePageBeforeImportScreenshot();
	  Page.ChaiHomePage().ClickOnTheImportButton();
	  Page.ChaiHomePage().ClickOnTheFileImportButton();
	  Page.ChaiHomePage().Import10MBPictureTimeCalculation();
	  Page.ChaiHomePage().HomePageAfterImportScreenshot();
	  
	  Page.ChaiHomePage().HomePageBeforeImportScreenshot();
	  Page.ChaiHomePage().ClickOnTheImportButton();
	  Page.ChaiHomePage().ClickOnTheFileImportButton();
	  Page.ChaiHomePage().Import1MBPictureTimeCalculation();
	  Page.ChaiHomePage().HomePageAfterImportScreenshot();
	  
	  
	  Assert.assertFalse(Page.ChaiHomePage().AssertHomePageIsDifferentBeforeANdAfterImageImport());
	  
	  //DeletePicture 
	  Page.ChaiHomePage().GoToInkSpace();
	  Page.InkSpaceHomePage().TypeInPicture20MBNameValue();
	  Page.InkSpaceHomePage().MouseMoveToPicture();
	  Page.InkSpaceHomePage().DeletePicture();
	  
	  Page.ChaiHomePage().GoToInkSpace();
	  Page.InkSpaceHomePage().TypeInPicture10MBNameValue();
	  Page.InkSpaceHomePage().MouseMoveToPicture();
	  Page.InkSpaceHomePage().DeletePicture();
	  
	  Page.ChaiHomePage().GoToInkSpace();
	  Page.InkSpaceHomePage().TypeInPicture1MBNameValue();
	  Page.InkSpaceHomePage().MouseMoveToPicture();
	  Page.InkSpaceHomePage().DeletePicture();
	  
	  
	  
	  Thread.sleep(1000);
  	}
  
  
}
