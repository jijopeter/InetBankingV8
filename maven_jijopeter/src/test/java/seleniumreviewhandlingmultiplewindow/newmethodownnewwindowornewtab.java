package seleniumreviewhandlingmultiplewindow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newmethodownnewwindowornewtab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.id("ta1")).sendKeys("jijo");
		
		//driver.switchTo().newWindow(WindowType.WINDOW);//new window
		driver.switchTo().newWindow(WindowType.TAB);//new tab
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.name("search")).sendKeys("HP");

	}

}
