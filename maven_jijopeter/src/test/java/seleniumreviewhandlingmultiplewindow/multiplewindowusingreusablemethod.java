package seleniumreviewhandlingmultiplewindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplewindowusingreusablemethod {
	static WebDriver driver;
	static Set<String> allWindows;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("jijo");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Open a popup window")).click();//first child window
		
		driver.findElement(By.linkText("Blogger")).click();//second child window
		
		allWindows = driver.getWindowHandles();
		switchToTheRequiredWindow("Basic Web Page Title");
		String paraText = driver.findElement(By.id("para1")).getText();
		System.out.println(paraText);
		
		switchToTheRequiredWindow("Blogger.com - Create a unique and beautiful blog easily.");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		driver.switchTo().window(parentWindow);
		driver.findElement(By.name("q")).sendKeys("jijo peter");
	

	}
	public static void switchToTheRequiredWindow(String title)
	{
		Iterator<String> itr = allWindows.iterator();
		while(itr.hasNext()) {
			String win = itr.next();
			driver.switchTo().window(win);
			if(driver.getTitle().equals(title)) {
				break;
			}
		}
			
		
	}

}
