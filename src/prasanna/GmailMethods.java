package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailMethods 
{
	WebDriver driver;
	public String launch(String l, String d, String c)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(d);
		return("done");
	}
	public String fill(String l, String d, String c) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.name(l)).sendKeys(d);
		return("done");
	}
	public String click(String l, String d, String c) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(l)).click();
		return("done");
	}
	public String checkUserid(String l, String d, String c) throws InterruptedException
	{
		Thread.sleep(5000);
		if(c.equalsIgnoreCase("valid") && driver.findElement(By.name("password")).isDisplayed())
		{
			return("Test passed");
		}
		else if(c.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/span/div[1]/div/div[2]/div[2]/div")).isDisplayed())
		{
			return("Test passed");
		}
		else
		{
			return("Test failed");
		}
	}
	public String close(String l, String d, String c) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		return("done");
	}
}
