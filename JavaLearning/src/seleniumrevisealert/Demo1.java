package seleniumrevisealert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		//driver.findElement(By.id("ta1")).sendKeys("jijo peter");
		//driver.findElement(By.name("q")).sendKeys("jijo");
		//driver.findElement(By.className("dropbtn")).click();
		//driver.findElement(By.linkText("compendiumdev")).click();
		//driver.findElement(By.xpath("//*[@id=\"HTML42\"]/div[1]/form/input[3]")).click();
		driver.findElement(By.cssSelector("#HTML42 > div.widget-content > form > input[type=button]:nth-child(3)")).click();

	}

}
