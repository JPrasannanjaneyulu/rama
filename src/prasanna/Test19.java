package prasanna;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test19 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("REGISTER")).click();
		Select s=new Select(driver.findElement(By.name("country")));
		//WebElement e=driver.findElement(By.name("country"));
		//Select s=new Select(e);
		//List<WebElement> l=s.getOptions();
		//System.out.println(l.size());
		s.selectByVisibleText("INDIA");
		//s.selectByValue("92");
		//s.selectByIndex(18);
		//s.deselectByVisibleText("INDIA");
		Thread.sleep(5000);
		driver.close();
	}
}
