package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicselenium2getnavigatetobackforwardrefresh {

	public static void main(String[] args) {
		//properties and browser instance
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//invoke the url using get method
		//driver.get("https://www.facebook.com/");
		//invoke the url using navigate method
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("my current title "+driver.getTitle());
		driver.navigate().to("https://www.messenger.com/");
		System.out.println("my sec title is "+driver.getTitle());
		driver.navigate().back();
		System.out.println("my navigating back title is "+driver.getTitle());
		driver.navigate().forward();
		System.out.println("my navigating forward title is "+driver.getTitle());
		//refresh the page
		try {
			Thread.sleep(2000);
			driver.navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.quit();
		

	}

}
