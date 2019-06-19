package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions6b 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Create acc")).click();
		WebElement e=driver.findElement(By.xpath("//*[@title='Birthday']"));
		Actions a=new Actions(driver);
		a.moveToElement(e).doubleClick().build().perform();
		Thread.sleep(5000);
		a.sendKeys("0").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		driver.close();
	}
}
