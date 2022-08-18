package seleniumreviseframesiframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iframe {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//id locator
		/*driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("jijo");*/
		//name locator
		/*driver.get("https://docs.oracle.com/javase/8/docs/api/");
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Description")).click();*/
		//webelement
		driver.get("https://blogpendingtasks.blogspot.com/p/switchtoframeusingwebelement.html");
		WebElement iframeelement = driver.findElement(By.xpath("//iframe[@title='arunmotoori']"));
		driver.switchTo().frame(iframeelement);
		driver.findElement(By.linkText("Home")).click();
	}

}
