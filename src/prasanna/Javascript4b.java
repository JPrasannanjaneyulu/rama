package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript4b 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/A._P._J._Abdul_Kalam");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e=driver.findElement(By.id("Early_life_and_education"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('Early_life_and_education').scrollIntoView();");
		js.executeScript("arguments[0].style.border='2px dashed blue';", e);
		Thread.sleep(5000);
		driver.close();
	}
}
