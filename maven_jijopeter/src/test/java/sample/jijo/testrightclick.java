package sample.jijo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testrightclick {
	@Test
	
	public void rightclick() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"))).perform();
		Thread.sleep(4000);
		driver.close();
	}

}
