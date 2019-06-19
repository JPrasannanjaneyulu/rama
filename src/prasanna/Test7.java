package prasanna;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://framesites.com");
		driver.findElement(By.xpath(".//*[@id='nav']/div/div[3]/div[2]/a/button")).click();
		Thread.sleep(5000);
		String win=driver.getWindowHandle();
		System.out.println(win);
		Thread.sleep(5000);
		ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0; i<x.size(); i++)
		{
			System.out.println(x.get(i));
		}
		Thread.sleep(5000);
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wins.get(1));
		driver.close();
		driver.switchTo().window(wins.get(0));
		driver.close();
	}
}
