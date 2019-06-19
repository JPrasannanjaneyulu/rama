package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions8b 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		//a.moveToElement(e).click().sendKeys("kalam").build().perform();
		//a.moveToElement(e).sendKeys("kalam").build().perform();
		a.moveToElement(e).doubleClick().sendKeys("kalam").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).build().perform();
		Thread.sleep(5000);
		driver.close();
	}
}
