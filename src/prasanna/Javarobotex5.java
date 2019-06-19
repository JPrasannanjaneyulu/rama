package prasanna;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Javarobotex5 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch site
		driver.get("https://www.seleniumhq.org");
		Thread.sleep(5000);
		//Right click on download link
		WebElement e=driver.findElement(By.linkText("Download"));
		Actions a=new Actions(driver);
		a.contextClick(e).build().perform();
		Thread.sleep(5000);
		//Handle window menu using java robot
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//Switch to new browser window
		ArrayList<String> l=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(l.get(1));
		driver.close();
		driver.switchTo().window(l.get(0));
		Thread.sleep(5000);
		//Close site
		driver.close();
		
	}
}
