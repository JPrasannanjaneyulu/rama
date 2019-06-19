package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class SynchronizationFluentWait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thehindu.com/");
		//Conditional wait as Fluent
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(100, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-menu']/ul/li[2]/a")));
		Thread.sleep(5000);
		driver.close();
	}
}
