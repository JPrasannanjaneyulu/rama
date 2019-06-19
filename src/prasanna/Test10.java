package prasanna;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wins.get(1));
		driver.findElement(By.name("emailid")).sendKeys("prasanna@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.switchTo().window(wins.get(0));
		driver.close();
	}
}
