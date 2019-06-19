package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		WebElement e=driver.findElement(By.name("xxx"));
		Actions a=new Actions(driver);
		a.click(e).build().perform();
		Thread.sleep(5000);
		a.keyDown(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN, Keys.ENTER).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER).build().perform();
		Thread.sleep(5000);
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		driver.close();
	}
}
