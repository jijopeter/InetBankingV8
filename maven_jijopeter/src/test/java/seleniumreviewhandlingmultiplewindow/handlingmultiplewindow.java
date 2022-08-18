package seleniumreviewhandlingmultiplewindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingmultiplewindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("jijo");
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Open a popup window")).click();//first child window
		
		driver.findElement(By.linkText("Blogger")).click();//second child window
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> itr = allWindows.iterator();
		while(itr.hasNext()) {
			String win = itr.next();
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Basic Web Page Title")) {
				String paraText = driver.findElement(By.id("para1")).getText();
				System.out.println(paraText);
				
				break;
			}
		}
		Iterator<String> itr2 = allWindows.iterator();
		while(itr2.hasNext()) {
			String win=itr2.next();
			driver.switchTo().window(win);
			if(driver.getTitle().equals("Blogger.com - Create a unique and beautiful blog easily.")) {
				driver.findElement(By.xpath("//span[text()='Sign in']")).click();
				break;
			}
		}
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.name("q")).sendKeys("jijo peter");
		driver.quit();

	}

}
