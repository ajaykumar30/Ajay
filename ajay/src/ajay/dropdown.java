package ajay;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class dropdown 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  
	  driver.get("https://www.bing.com");
	  driver.findElement(By.className("sw_pref")).click();
	  driver.findElement(By.linkText("Settings")).click();
	  WebElement dpd=driver.findElement(By.xpath("//select[@id='rpp']"));
	 
	  Select s=new Select(dpd);
	  
	 
	  List<WebElement> sss=s.getOptions();
	  for (int i = 0; i < sss.size(); i++) {
		  System.out.println(sss.get(i).getText());
		
	}
	  
//	  List<WebElement> dropdownoptions=driver.findElements(By.xpath("//select[@id='rpp']/option"));
//	  
//	  for (int i = 0; i < dropdownoptions.size(); i++) 
//		 
//	  {
//		  
//		System.out.println(dropdownoptions.get(i).getSize());
//		System.out.println(dropdownoptions.get(i).getTagName());
//	}
	  
	  
  }
  @BeforeClass
  public void beforeClass()
  {
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
