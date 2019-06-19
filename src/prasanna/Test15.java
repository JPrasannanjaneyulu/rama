package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 
{
	public static void main(String[] args) 
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Maximize browser window
		driver.manage().window().maximize();
		//Launch google site
		driver.get("https://www.Google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Go to gmail
		driver.navigate().to("https://www.Gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Back to google
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Forward to gmail
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Reload gmail
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Close site
		driver.close();
	}
}
