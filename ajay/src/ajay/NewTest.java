package ajay;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.google.com");
	  if(driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div/a")).isDisplayed()){
		  driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div/a")).click();
	  }
	  else
	  {
		  System.out.println("pop-up not present");
		
	  }
	  }
  
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
