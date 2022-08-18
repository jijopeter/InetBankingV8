package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Findlinktextpartiallinktext {

	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL="https://letskodeit.teachable.com/";
		driver.get(URL);
		
		driver.findElement(By.partialLinkText("Pract")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Login")).click();
		
		

	}

}
