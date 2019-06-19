package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.com");
		Thread.sleep(5000);
		driver.switchTo().activeElement().sendKeys("abdul kalam");
		//driver.switchTo().activeElement().clear();
		//Thread.sleep(5000);
		driver.findElement(By.className("lsb")).click();
		Thread.sleep(5000);
		//driver.findElement(By.className("lsb")).submit();
		driver.close();
	}
}
