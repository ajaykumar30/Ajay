package ajay;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class draganddrop 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  //for drag
	  
	  driver.get("https://www.jqueryui.com");
	  driver.findElement(By.linkText("Draggable")).click();
	  driver.switchTo().frame(0);
	  WebElement source=driver.findElement(By.id("draggable"));
	  Actions a =new Actions(driver);
	  a.dragAndDropBy(source, 70, 90).perform();
	  Thread.sleep(5000);
	 
	  //for drag and drop
	  
	  driver.switchTo().defaultContent();
	  driver.findElement(By.linkText("Droppable")).click();
	  driver.switchTo().frame(0);
	 WebElement source1= driver.findElement(By.id("draggable"));
	 WebElement dest=driver.findElement(By.id("droppable"));
	 a.dragAndDrop(source1, dest).perform();
	 Thread.sleep(5000);
	  
  }
  @BeforeClass
  public void beforeClass()
  {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
