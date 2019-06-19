package prasanna;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript1ex2a 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("j.prasannanjaneyulu131@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9912358366");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('loginbutton').click();");
	}
}
