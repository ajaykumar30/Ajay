package ajay;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

public class normal 
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		 driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	
			screenshot("ajay2");
		
	Thread.sleep(5000);
		driver.close();
		}
	
	public static void screenshot(String name) throws IOException
	{
	
	File srcfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("E:\\selenium\\"+name+".png" ));
			
}
	}
