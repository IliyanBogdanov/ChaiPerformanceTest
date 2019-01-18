package BaseTestFixture;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.server.browserlaunchers.SafariCustomProfileLauncher;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

	//public static FirefoxDriver Firefox;
	public static WebDriver Driver;
	public static WebDriverWait Wait;
	public static String Name="Safari";
	
	public static void Initialization() throws InterruptedException, IOException
	{
		
	    switch (Name)
        {
            case "Chrome":
            	Driver = new ChromeDriver();
                break;
            case "Firefox":
                Driver=new FirefoxDriver();
                break;
            case "Safari":
            	String[] args = {"/usr/bin/osascript", "/Users/nenko/Documents/ClearCookies.scpt"};
            	
             
          	
            	Driver=new SafariDriver();
            	
            	try {
                    Process process = Runtime.getRuntime().exec(args);
                    process.waitFor();
              } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            	
            	//Clear User Date
            	Thread.sleep(2000);
    			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:80,10").getInputStream();
    			Thread.sleep(2000);
    			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick c:80,10").getInputStream();
    			Thread.sleep(2000);
    			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:80,80").getInputStream();
    			Thread.sleep(2000);
    			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick c:80,80").getInputStream();
    			Thread.sleep(2000);
    			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick m:980,375").getInputStream();
    			Thread.sleep(2000);
    			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick c:980,375").getInputStream();
    			Thread.sleep(2000);
    			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick kp:enter").getInputStream();
    			Thread.sleep(2000);
    			Runtime.getRuntime().exec("/Users/nenko/Documents/Applications/cliclick kp:esc").getInputStream();
            	    
            	  Thread.sleep(4000);
            	  
            	break;
        }
		
		Wait=new WebDriverWait(Driver,120);
		Driver.manage().window().maximize();
	}

	
	
	public static void Quit()
	{
		Driver.quit();
	}
	
}
