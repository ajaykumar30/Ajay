package ajay;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class readingexcel 
{
	WebDriver driver;
	String filepath="C:\\Users\\VIJJU\\Desktop\\Fb.xlsx";
	FileInputStream fs;
	
	Workbook w;
	Sheet s;
  @Test
  public void f() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	  driver.get("https://www.fb.com");
	  excel();
	  driver.findElement(By.id("email")).clear();
	  driver.findElement(By.id("email")).sendKeys(s.getRow(1).getCell(0).getStringCellValue());
	  driver.findElement(By.id("pass")).clear();
	  driver.findElement(By.id("pass")).sendKeys(s.getRow(1).getCell(1).getStringCellValue());
	  driver.findElement(By.id("u_0_m")).click();
	  Thread.sleep(7000);
  }
  public void excel() throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	fs=new FileInputStream(filepath);
	w=WorkbookFactory.create(fs);
	s=w.getSheet("Sheet1");
	
	
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
