package testcasetoscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testscenariofiledownloadfirefox2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://launchpad.net/sikuli");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='sprite info']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='download and run - see http://sikulix.com (7.5 MiB)']")).click();
		//driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.close();

	}

}
