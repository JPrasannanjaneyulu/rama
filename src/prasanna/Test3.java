package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).sendKeys("facebook");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).clear();
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).sendKeys("youtube");
		Thread.sleep(5000);
		driver.findElement(By.className("lsb")).click();
		driver.close();
	}
}
