package Helpers;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseTestFixture.Browser;


public class Helpers {

	public static final String ChaiURL="https://inkspace.wacom.com/collaboration/?sessionId=96a55e69-e183-46bd-b143-a8fb202bc7d6";
	
	public static void CreateScreenshot(String FileName) throws IOException
	{
		File CreateNewFile=((TakesScreenshot)Browser.Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(CreateNewFile,new File("/Users/nenko/Documents/WacomProjectScreenshots/ChaiPerformanceScreenshot/"+FileName+".png"));
	}
	
	
	
	public static boolean CompareCanvasBeforeAndAfterImportImage(String firstNote, String secondNote)
	{
		boolean screensAreEqual=false;
		 //String firstImage, String secondImage
		String file1 = firstNote;
		String file2 = secondNote;
		//boolean NotesAreEqual=false;
		 
		Image image1 = Toolkit.getDefaultToolkit().getImage(file1);
		Image image2 = Toolkit.getDefaultToolkit().getImage(file2);
		 
		try {
		 
		PixelGrabber grab1 =new PixelGrabber(image1, 0, 0, -1, -1, false);
		PixelGrabber grab2 =new PixelGrabber(image2, 0, 0, -1, -1, false);
		 
		int[] data1 = null;
		 
		if (grab1.grabPixels()) {
		int width = grab1.getWidth();
		int height = grab1.getHeight();
		data1 = new int[width * height];
		data1 = (int[]) grab1.getPixels();
		}
		 
		int[] data2 = null;
		 
		if (grab2.grabPixels()) {
		int width = grab2.getWidth();
		int height = grab2.getHeight();
		data2 = new int[width * height];
		data2 = (int[]) grab2.getPixels();
		}
		screensAreEqual=java.util.Arrays.equals(data1, data2);
		System.out.println("Pixels equal: " + java.util.Arrays.equals(data1, data2));
		}
		catch (InterruptedException e1) {
		e1.printStackTrace();
		}
		return screensAreEqual;
	}
	
}
