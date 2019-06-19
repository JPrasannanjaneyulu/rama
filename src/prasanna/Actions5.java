package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Actions5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e=driver.findElement(By.name("xxx"));
		Select s=new Select(e);
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(2)).click(s.getOptions().get(3)).click(s.getOptions().get(0)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		driver.close();
	}
}
