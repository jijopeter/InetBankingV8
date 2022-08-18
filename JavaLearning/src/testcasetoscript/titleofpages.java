package testcasetoscript;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class titleofpages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bar-and-shield-sandbox.mybigcommerce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='guestTkn']")).sendKeys("zjo34kbkfp");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.getTitle();
		driver.switchTo().defaultContent();
		driver.getTitle();
		
		/*Set<String> windowids=driver.getWindowHandles();
		List<String> windowidslist=new ArrayList(windowids);
		String parentwindowid=windowidslist.get(0);
		String childwindowid=windowidslist.get(1);
		driver.switchTo().window(parentwindowid);
		System.out.println("child window title is "+driver.getTitle());*/
		
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		String tab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).sendKeys(tab);
		Thread.sleep(2000);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(parent);
		System.out.println("parent window title is "+driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(child);
		System.out.println("child window title is "+driver.getTitle());
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		System.out.println("parent window title is "+driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}

}
