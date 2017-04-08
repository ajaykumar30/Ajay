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

public class mouseoverbyreuse
{
	WebDriver driver;
	reusable r;
	
  @Test
  public void f() throws InterruptedException
  {
	  r=new reusable(driver);
	  driver.get("https://www.rightstart.com");
	  WebElement travelgare=driver.findElement(By.id("navigation-top-cat-label-707"));
	  r.mover(travelgare);
	  WebElement carseats=driver.findElement(By.linkText("Car Seats"));
	  r.mover(carseats);
	  WebElement carseatacc=driver.findElement(By.xpath("//a[@id='navigation-top-cat-label-314']/span"));
	  r.mover(carseatacc);
	 
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
