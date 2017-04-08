package ajay;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class windowhandling 
{
WebDriver driver;

	@Test
  public void f() throws InterruptedException 
	{
		driver.get("https://www.rightstart.com");
		String pwin=driver.getWindowHandle();
		driver.findElement(By.linkText("Our Blog")).click();
		java.util.Set<String> allwin=driver.getWindowHandles();
		System.out.println(pwin);
		System.out.println(allwin);
		allwin.remove(pwin);
		driver.switchTo().window(allwin.iterator().next());
		driver.findElement(By.linkText("Meet the Right Start Moms")).click();
		Thread.sleep(5000);
		driver.switchTo().window(pwin);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(5000);
		
  }
  @BeforeClass
  public void beforeClass() 
  {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(90000, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass()
  {
	  driver.quit();
  }

}
