package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript3a 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/A._P._J._Abdul_Kalam");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Scroll from top to bottom
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(5000);
		//Scroll from bottom to top
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
		Thread.sleep(5000);
		//Scroll to specified element
		WebElement e=driver.findElement(By.id("Presidency"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		Thread.sleep(5000);
		driver.close();
	}
}
