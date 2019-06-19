package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		Thread.sleep(5000);
		driver.switchTo().frame("iframe2");
		driver.findElement(By.linkText("Hello world!")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.close();
	}
}
