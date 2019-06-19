package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 
{
	public static void main(String[] args) 
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Delete all existing cookies
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Open site
		driver.get("https://www.Gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Cookies testing
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("Cookies were loaded");
		}
		else
		{
			System.out.println("No cookies");
		}
		//Close site
		driver.close();
	}
}
