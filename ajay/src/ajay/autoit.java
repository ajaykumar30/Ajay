package ajay;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class autoit
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException 
  {
	driver.get("http://tinypic.com/");
	driver.findElement(By.xpath("//input[@id='the_file']")).click();
	Thread.sleep(5000);
	Runtime.getRuntime().exec("C:\\Users\\VIJJU\\Desktop\\auto1.exe");
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
