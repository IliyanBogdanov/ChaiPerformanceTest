package BaseTestFixture;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTestFixture {

  @BeforeMethod
  public void SetUp() throws InterruptedException, IOException {
	  Browser.Initialization();
  }
  
  //@Parameters({"BrowserName"})
  //@BeforeClass
  //public void SetBrowser(String BrowserName)
  //{
//	Browser.Name  =BrowserName;
 // }

  @AfterMethod
  public void Finish() {
	  Browser.Quit();
  }

}
