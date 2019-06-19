package prasanna;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javarobotex3 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch gmail
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("j.prasannanjaneyulu131");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='password']/descendant::input")).sendKeys("janjanam@rp");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//Click compose
		driver.findElement(By.xpath("//*[text()='Compose']")).click();
		Thread.sleep(5000);
		//Fill fields
		driver.findElement(By.name("to")).sendKeys("j.prasannanjaneyulu131@gmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("wishes");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi");
		driver.findElement(By.xpath("//*[@data-tooltip='Attach files']/descendant::*[3]")).click();
		Thread.sleep(5000);
		//Handle file upload pop-up window
		StringSelection s=new StringSelection("C:\\Users\\janja\\Pictures\\flower.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(20000);//for file uploading
		//Click send
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("//*[@role='alert']/descendant::*[3]")).getText();
		System.out.println(x);
		Thread.sleep(5000);
		//Do logout
		driver.findElement(By.xpath("//span[@class='gb_bb gbii']")).click();
		driver.findElement(By.xpath("//*[text()='Sign out']")).click();
		Thread.sleep(5000);
		//Close browser
		driver.close();
	}
}
