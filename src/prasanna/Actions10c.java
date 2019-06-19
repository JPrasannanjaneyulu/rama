package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions10c 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Actions");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e1=driver.findElement(By.name("one"));
		WebElement e2=driver.findElement(By.name("twelve"));
		Actions a=new Actions(driver);
		a.clickAndHold(e1).build().perform();
		Thread.sleep(5000);
		a.release(e2).build().perform();
		Thread.sleep(5000);
		driver.close();
	}
}
