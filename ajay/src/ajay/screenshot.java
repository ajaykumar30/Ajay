package ajay;

import org.testng.annotations.Test;

import com.steadystate.css.util.Output;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class screenshot
{
	WebDriver driver;
  @Test
  public void f() throws IOException
  {
	  driver.get("https://www.rightstart.com");
	  capture("ajaykumar");
  }
  
  public void capture(String name) throws IOException
  {
	 File srcfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(srcfile,new File("E:\\selenium\\Screenshots\\"+name+".png"));
  }
  @BeforeClass
  public void beforeClass() 
  {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
