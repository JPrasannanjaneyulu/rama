package prasanna;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javarobotex4 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\batch229\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//Launch site
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(5000);
		//Click download link
		driver.findElement(By.linkText("Download")).click();
		Thread.sleep(5000);
		//Click a software link to start download
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(5000);
		//Handle file download window
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_LEFT);
		r.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(15000);//for file download
		//Close site
		driver.close();
	}
}
