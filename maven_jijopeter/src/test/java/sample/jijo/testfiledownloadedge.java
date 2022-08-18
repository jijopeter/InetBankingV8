package sample.jijo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class testfiledownloadedge {
	@Test
	public void downloadfirefox() throws InterruptedException
	{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.selenium.dev//downloads");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[3]//div[1]//div[2]//p[2]//a[1]")).click();
	}

}
