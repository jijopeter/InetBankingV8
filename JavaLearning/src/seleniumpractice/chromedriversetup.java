package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromedriversetup {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\JavaLearning\\server\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.youtube.com/watch?v=zhLH3FNheY0");
		driver.navigate().to("https://www.youtube.com/watch?v=zhLH3FNheY0");
		
		//driver.close();
		driver.quit();
		

	}

}
