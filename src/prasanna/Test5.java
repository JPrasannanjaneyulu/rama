package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("prasanna");
		driver.findElement(By.name("lastName")).sendKeys("j", Keys.TAB, "123456789", Keys.TAB, "prasanna@gmail.com", Keys.TAB, "marathhalli", Keys.TAB, "", Keys.TAB, "Bangalore", Keys.TAB, "Karanataka", Keys.TAB, "500037", Keys.TAB, Keys.DOWN, Keys.TAB, "Prasanna", Keys.TAB, "prasanna123", Keys.TAB, "prasanna123");
		driver.findElement(By.name("register")).click();
		driver.close();
	}
}
