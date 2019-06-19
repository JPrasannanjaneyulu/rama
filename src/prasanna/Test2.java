package prasanna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(5000);
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
			System.out.println("site was secured");
		}
		else
		{
			System.out.println("site was not secured");
		}
		driver.close();
	}
}
