package prasanna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		Thread.sleep(5000);
		//String x=driver.getTitle();
		//String x=driver.getPageSource();
		String x=driver.getCurrentUrl();
		System.out.println(x);
		driver.close();
	}
}
