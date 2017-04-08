package ajay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class reusable 
{ 
	WebDriver driver;
	public reusable(WebDriver driver)
	{
		this.driver=driver;
	}
	Actions a;
public void mover(WebElement element) throws InterruptedException
{
	a=new Actions(driver);
	a.moveToElement(element).perform();
	Thread.sleep(5000);
	}

}
