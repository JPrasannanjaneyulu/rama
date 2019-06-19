package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://en.wikipedia.org/wiki/Main_Page");
		//Thread.sleep(5000);
		//String x=driver.findElement(By.id("lst-ib")).getAttribute("id");
		//System.out.println(x);
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		String x=driver.findElement(By.name("websubmit")).getCssValue("font-family");
		System.out.print(x);
		//String x=driver.findElement(By.id("mp-dyk")).getText();
		//System.out.print(x);
		Thread.sleep(5000);
		driver.close();
	}
}
