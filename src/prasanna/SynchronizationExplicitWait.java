package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationExplicitWait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thehindu.com/");
		//conditional wait as Explicit
		WebDriverWait w=new WebDriverWait(driver, 100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-menu']/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
