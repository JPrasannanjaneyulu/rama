package prasanna;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

public class Sikuliex1 
{
	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\batch229\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.name("search_query")).sendKeys("gangnam style");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//a[@id='video-title']")).click();
		Thread.sleep(15000);
		Screen s=new Screen();
		Location l=new Location(150, 400);
		s.wheel(l, Button.LEFT, 0);
		s.click("pause.png");
		Thread.sleep(15000);
		s.wheel(l, Button.LEFT, 0);
		s.click("play.png");
		Thread.sleep(5000);
		s.wheel(l, Button.LEFT, 0);
		s.mouseMove("volume.png");
		Match e=s.find("bar.png");
		Location el1=new Location(e.getX()-10, e.getY());
		s.dragDrop(e, el1);
		Thread.sleep(15000);
		s.wheel(l, Button.LEFT, 0);
		s.mouseMove("volume.png");
		Location el2=new Location(e.getX()+10, e.getY());
		s.dragDrop(e, el2);
		Thread.sleep(15000);
		s.wheel(l, Button.LEFT, 0);
		s.click("maximize.png");
		Thread.sleep(15000);
		s.wheel(l, Button.LEFT, 0);
		s.click("scroll.png");
		s.wheel(Button.WHEEL_DOWN, 10);
		Thread.sleep(15000);
		s.wheel(Button.WHEEL_UP, 10);
		s.wheel(l, Button.LEFT, 0);
		s.click("minimize.png");
		Thread.sleep(15000);
		s.wheel(l, Button.LEFT, 0);
		s.click("mini.png");
		Thread.sleep(15000);
		Region r=s.create(1000, 700, 400, 225);
		r.click("pause.png");
	}
}
