package ajay;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class mouseover
{
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException
  {
	  driver.get("https://www.rightstart.com");
	  WebElement travelgare=driver.findElement(By.id("navigation-top-cat-label-707"));
	  Actions a=new Actions(driver);
	  a.moveToElement(travelgare).perform();
	  Thread.sleep(4000);
	  WebElement carseats=driver.findElement(By.linkText("Car Seats"));
	  a.moveToElement(carseats).perform();
	  Thread.sleep(4000);
	  WebElement carseatacc=driver.findElement(By.xpath("//a[@id='navigation-top-cat-label-314']/span"));
	  a.moveToElement(carseatacc).perform();
	  Thread.sleep(10000);
	  
  }
  @BeforeClass
  public void beforeClass() 
  {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
