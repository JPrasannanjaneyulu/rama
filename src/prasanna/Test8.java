package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.way2sms.com");
		driver.findElement(By.id("mobileNo")).sendKeys("9912358366");
		driver.findElement(By.id("password")).sendKeys("prasanna123");
		driver.findElement(By.xpath("//*[@id='loginform']/div[2]/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("mobile")).sendKeys("9148752210");
		driver.findElement(By.id("message")).sendKeys("hi");
		driver.findElement(By.id("sendButton")).click();
		//driver.findElement(By.xpath("div/li/a/[class='logout']//i")).click();
	}
}
